import java.util.Scanner;

public class SistemPenilaianIPK {
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

    // Metode untuk menghitung nilai akhir berdasarkan persentase kontrak belajar
    public double hitungNilaiAkhir(double nilaiTugas, double nilaiUTS, double nilaiUAS, int kehadiran, double nilaiUjiKompetensi) {
        // Persentase kontrak belajar
        double persentaseTugas = 0.10;
        double persentaseUTS = 0.30;
        double persentaseUAS = 0.30;
        double persentaseKehadiran = 0.10;
        double persentaseUjiKompetensi = 0.20;

        // Menentukan jumlah pertemuan
        int totalPertemuan = 12;

        // Menghitung nilai akhir
        double nilaiAkhir = (nilaiTugas * persentaseTugas) + (nilaiUTS * persentaseUTS)
                + (nilaiUAS * persentaseUAS) + ((double) kehadiran / totalPertemuan * persentaseKehadiran)
                + (nilaiUjiKompetensi * persentaseUjiKompetensi);

        return nilaiAkhir;
    }

    // Metode untuk menentukan IPK berdasarkan nilai akhir
    public double tentukanIPK(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return 4.0;
        } else if (nilaiAkhir >= 70) {
            return 3.0;
        } else if (nilaiAkhir >= 60) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
