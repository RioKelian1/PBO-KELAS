public class Hewan_peliharaan {

    public String namaHewan = "doffy";
    public String jenis = "burung beo";
    public int umurHewan = 2;
    public String makananFaforit = "kacang";
    public char jenisKelamin = 'f';

    public void namaHewan() {
        System.out.println("Nama: " + namaHewan);
    }
    public void jenis() { System.out.println("Jenis: " + jenis); }

    public void umurHewan() {
        System.out.println("Umur: " + umurHewan);
    }
    public void makananFavorit() {
        System.out.println("Makanan kesukaan: " + makananFaforit);
    }
    public void jenisKelamin() {
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }

    public static void main(String [] args) {
        Hewan_peliharaan hewan = new Hewan_peliharaan();
        hewan.namaHewan();
        hewan.jenis() ;
        hewan.umurHewan();
        hewan.makananFavorit();
        hewan.jenisKelamin();
    }
}