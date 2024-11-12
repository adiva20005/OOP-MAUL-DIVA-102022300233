class KomputerVIP extends Komputer {
    private boolean  vipCard;

    public KomputerVIP(String namaWarnet, int jumlahKomputer, float hargaPerJam, boolean vipCard) {
        super(namaWarnet, jumlahKomputer, hargaPerJam);
        this.vipCard = vipCard
    }

    @Override
    public void Informasi() {
        // TODO Auto-generated method stub
        super.Informasi();
        System.out.println("Benefit Member VIP:");
        System.out.println("-Diskon 10% untuk bermain diatas 3 jam");
        System.out.println("-Geratis minuman setiap 4 jam bermain");
        System.out.println("Prioritas booking komputer gaming");
    }

    public void  Login(String nama){
        System.out.println("Login dengan username" + nama);

    }

    public void  Bermain(int jam){
        System.out.println("Bermain selama" + jam "jam");


    }

    public void  Bermain(int jam, int meneittambahan){
        System.out.println("bambah waktu" + jam +"jam" + meneittambahan + "menit");

    }



    

    

    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerVIP
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}
