class Hewan {
    protected String nama;
    protected int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public void suara() {
        printBox("Suara hewan");
    }
    
    public void makan() {
        printBox(nama + " sedang makan.");
    }
    
    public void makan(String makanan) {
        printBox(nama + " sedang makan " + makanan + ".");
    }
    
    public void perkenalan() {
        printBox("ini adalah " + nama + " !");
    }
    
    protected void printBox(String content) {
        System.out.println("┌──────────────────────────────────┐");
        System.out.printf("│ %-32s │\n", content);
        System.out.println("└──────────────────────────────────┘");
    }
    
    public void infoHewan() {
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Nama", nama);
        printTableLine();
        System.out.printf("│ %-12s │ %-20s │\n", "Umur", umur + " tahun");
    }
    
    protected void printTableLine() {
        System.out.println("├─────────────┼──────────────────────┤");
    }
    
    protected void printTopLine() {
        System.out.println("┌─────────────┬──────────────────────┐");
    }
    
    protected void printBottomLine() {
        System.out.println("└─────────────┴──────────────────────┘");
    }
}
