public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang (String NIK, String namaDepan, String namaBelakang){
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNIK(){
        return NIK;
    }

    public String getnamaDepan(){
        return namaDepan;
    }

    public String getnamaBelakang(){
        return namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
    }
}