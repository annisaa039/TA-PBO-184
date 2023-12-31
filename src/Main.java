import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai-nilai dan informasi kehadiran
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        System.out.print("Masukkan jumlah kehadiran (dari 12 pertemuan): ");
        int jumlahKehadiran = scanner.nextInt();

        System.out.print("Masukkan nilai uji kompetensi: ");
        double nilaiUjiKompetensi = scanner.nextDouble();

        // Membuat objek dari kelas SistemPenilaianIPK
        SistemPenilaianIPK penilaianIPK = new SistemPenilaianIPK();

        // Menghitung nilai akhir menggunakan metode di kelas SistemPenilaianIPK
        double nilaiAkhir = penilaianIPK.hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS, jumlahKehadiran, nilaiUjiKompetensi);

        // Menampilkan hasil perhitungan
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Menentukan IPK berdasarkan nilai akhir
        Double ipk = penilaianIPK.tentukanIPK(nilaiAkhir);
        System.out.println("IPK: " + ipk);

        // Menutup objek Scanner
        scanner.close();
    }
}
