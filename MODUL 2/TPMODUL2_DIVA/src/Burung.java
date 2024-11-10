class Burung extends Hewan {
    private String warnaBulu;
    
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void suara() {
        printBox(nama + " berkicau.");
    }
    
    @Override
    public void infoHewan() {
        System.out.println("\n║═══════════════ INFO BURUNG ═══════════════║");
        printTopLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Nama", nama);
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Umur", umur + " tahun");
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Warna Bulu", warnaBulu);
        printBottomLine();
        System.out.println("║═════════════════════════════════════════════║\n");
    }
}