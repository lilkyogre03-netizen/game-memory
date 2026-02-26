class artitarot extends tarot {
    String arti;

    public artitaro(String namakartu, String arti) {
        super(namakartu);
        this.arti = arti;
    }

    @Override
    public void showkartu(){
        System.out.println( namakartu +"--"+arti);
    }
}
