package Pertemuan14;

public class PengunjungCafe25 {

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        
        if (namaPengunjung.length == 0) {
            System.out.println("(Tidak ada pengunjung)");
            return;
        }

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi"); 
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();  // contoh tanpa argumen.
    }
}
