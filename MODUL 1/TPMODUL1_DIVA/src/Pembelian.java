import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private static Penumpang penumpangPesanan;
    private static Penerbangan penerbanganPesanan;

    public static void main(String[] args) {
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK", "DPS", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB", "KNO", "09:00", "11:45", 1350000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("====== EAD Ticket Booking System ======");

        while (true) {
            System.out.println("\n1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    pesanTiket(scanner);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void tampilkanDaftarPenerbangan() {
        System.out.println("\nDaftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". Nomor Penerbangan: " + daftarPenerbangan.get(i).getNomorPenerbangan() +
                    "\nBandara Keberangkatan: " + daftarPenerbangan.get(i).getBandaraKeberangkatan() +
                    " ---> Bandara Tujuan: " + daftarPenerbangan.get(i).getBandaraTujuan() +
                    "\nWaktu Keberangkatan: " + daftarPenerbangan.get(i).getWaktuKeberangkatan() +
                    " ---> Waktu Kedatangan: " + daftarPenerbangan.get(i).getWaktuKedatangan() +
                    "\nHarga Tiket: Rp." + daftarPenerbangan.get(i).getHargaTiket());
        }
    }

    private static void pesanTiket(Scanner scanner) {
        System.out.print("Masukkan NIM (sebagai NIK): ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        penumpangPesanan = new Penumpang(NIK, namaDepan, namaBelakang);

        System.out.println("\nPilih nomor penerbangan:");
        tampilkanDaftarPenerbangan();
        System.out.print("Masukkan nomor penerbangan: ");
        int pilihanPenerbangan = scanner.nextInt();
        scanner.nextLine();

        if (pilihanPenerbangan < 1 || pilihanPenerbangan > daftarPenerbangan.size()) {
            System.out.println("Pilihan tidak valid.");
        } else {
            penerbanganPesanan = daftarPenerbangan.get(pilihanPenerbangan - 1);
            System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
        }
    }

    private static void tampilkanPesanan() {
        if (penumpangPesanan == null || penerbanganPesanan == null) {
            System.out.println("\nBelum ada pesanan tiket.");
        } else {
            System.out.println("\n====== Detail Tiket Penerbangan ======");
            System.out.println("Nomor Induk Kependudukan: " + penumpangPesanan.getNIK());
            System.out.println("Nama Depan: " + penumpangPesanan.getnamaDepan());
            System.out.println("Nama Belakang: " + penumpangPesanan.getnamaBelakang());
            System.out.println("Nomor Penerbangan: " + penerbanganPesanan.getNomorPenerbangan());
            System.out.println("Bandara Keberangkatan: " + penerbanganPesanan.getBandaraKeberangkatan());
            System.out.println("Waktu Keberangkatan: " + penerbanganPesanan.getWaktuKeberangkatan());
            System.out.println("Harga Tiket: Rp." + penerbanganPesanan.getHargaTiket());
        }
    }
}