



public class MakananKering {
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;

    
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void ShowData(){
        System.out.println("Masukkan Nama Makanan: " + nama);
        System.out.println("Masukkan Jumlah Makanan: " + jumlah);
        System.out.println("Masukkan Harga Makanan: " + harga);
        System.out.println("Masukkan Brand Makanan: " + brand);
    }

    

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)

    // Todo : Create Constructor of MakananKering

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
