import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = input.nextLine();

        String jenisKelamin;
        if (jenisKelaminInput.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else {
            jenisKelamin = "Perempuan";
        }

        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");

        input.close();
    }
}
