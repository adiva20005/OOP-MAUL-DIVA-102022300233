class KomputerPremium extends Komputer {
    private boolean  ruangPrivat;

    public KomputerPremium(String namaWarnet, int jumlahKomputer, float hargaPerJam, boolean ruangPrivat) {
        super(namaWarnet, jumlahKomputer, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi();
        System.out.println("Fasilitas ruangan premium:");
        System.out.println("-Ruang be-AC");
        System.out.println("-Sofa gaming");
        System.out.println("-Komputer sertifikasi tinggi");
        System.out.println("-koneksi internet");
    }

    
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Bu atlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    
}
