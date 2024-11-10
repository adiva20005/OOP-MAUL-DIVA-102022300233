class Kucing extends Hewan {
    private String ras;
    
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    
    @Override
    public void suara() {
        printBox(nama + " mengeong.");
    }
    
    @Override
    public void infoHewan() {
        System.out.println("\n║═══════════════ INFO KUCING ═══════════════║");
        printTopLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Nama", nama);
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Umur", umur + " tahun");
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Ras", ras);
        printBottomLine();
        System.out.println("║═════════════════════════════════════════════║\n");
    }
}