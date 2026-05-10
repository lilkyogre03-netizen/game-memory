package MAIN;

import ENTITY.entity;

public class CollisionChecker {
    UI gp;

    public CollisionChecker(UI gp) {
        this.gp = gp;
    }

    // FIX: Helper baru — dulu tidak ada validasi batas sama sekali.
    // Mencegah ArrayIndexOutOfBoundsException jika entity berada di tepi peta.
    private boolean isValidTile(int col, int row) {
        return col >= 0 && col < gp.maxWorldCol && row >= 0 && row < gp.maxWorldRow;
    }

    // FIX: Helper baru — cek collision tile dengan aman.
    // Posisi di luar batas peta dianggap dinding (collision = true).
    private boolean hasTileCollision(int col, int row) {
        if (!isValidTile(col, row)) {
            return true; // Di luar batas = dinding
        }
        int tileNum = gp.tileM.mapTileNum[col][row];
        if (tileNum < 0 || tileNum >= gp.tileM.tile.length || gp.tileM.tile[tileNum] == null) {
            return false;
        }
        return gp.tileM.tile[tileNum].colliaion;
    }

    public void checkTile(entity entity) {
        int entityLeftWorldX   = entity.worldX + entity.solidArea.x;
        int entityRightWorldX  = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY    = entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        int entityLeftCol   = entityLeftWorldX  / gp.tileSize;
        int entityRightCol  = entityRightWorldX / gp.tileSize;
        int entityTopRow    = entityTopWorldY   / gp.tileSize;
        int entityBottomRow = entityBottomWorldY / gp.tileSize;

        switch (entity.direction) {
            case "up":
                // FIX: Dulu langsung gp.tileM.mapTileNum[col][row] tanpa cek batas.
                // Jika entityTopRow - speed = -1, langsung ArrayIndexOutOfBoundsException.
                entityTopRow = (entityTopWorldY - entity.speed) / gp.tileSize;
                if (hasTileCollision(entityLeftCol, entityTopRow) ||
                    hasTileCollision(entityRightCol, entityTopRow)) {
                    entity.collisionOn = true;
                }
                break;

            case "down":
                entityBottomRow = (entityBottomWorldY + entity.speed) / gp.tileSize;
                if (hasTileCollision(entityLeftCol, entityBottomRow) ||
                    hasTileCollision(entityRightCol, entityBottomRow)) {
                    entity.collisionOn = true;
                }
                break;

            case "left":
                entityLeftCol = (entityLeftWorldX - entity.speed) / gp.tileSize;
                if (hasTileCollision(entityLeftCol, entityTopRow) ||
                    hasTileCollision(entityLeftCol, entityBottomRow)) {
                    entity.collisionOn = true;
                }
                break;

            case "right":
                entityRightCol = (entityRightWorldX + entity.speed) / gp.tileSize;
                if (hasTileCollision(entityRightCol, entityTopRow) ||
                    hasTileCollision(entityRightCol, entityBottomRow)) {
                    entity.collisionOn = true;
                }
                break;
        }
    }

    public void checkEntity(entity entity, entity[] target) {
        int entityLeftWorldX   = entity.worldX + entity.solidArea.x;
        int entityRightWorldX  = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY    = entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        switch (entity.direction) {
            case "up":    entityTopWorldY    -= entity.speed; break;
            case "down":  entityBottomWorldY += entity.speed; break;
            case "left":  entityLeftWorldX   -= entity.speed; break;
            case "right": entityRightWorldX  += entity.speed; break;
        }

        for (int i = 0; i < target.length; i++) {
            if (target[i] != null) {
                int targetLeftWorldX   = target[i].worldX + target[i].solidArea.x;
                int targetRightWorldX  = target[i].worldX + target[i].solidArea.x + target[i].solidArea.width;
                int targetTopWorldY    = target[i].worldY + target[i].solidArea.y;
                int targetBottomWorldY = target[i].worldY + target[i].solidArea.y + target[i].solidArea.height;

                if (entityLeftWorldX   < targetRightWorldX  &&
                    entityRightWorldX  > targetLeftWorldX   &&
                    entityTopWorldY    < targetBottomWorldY &&
                    entityBottomWorldY > targetTopWorldY) {
                    entity.collisionOn = true;
                }
            }
        }
    }
}
}
