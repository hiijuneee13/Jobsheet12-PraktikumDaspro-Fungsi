package Pertemuan14;

public class Kafe25 {
    // Fungsi Menu tanpa parameter.
    public static void Menu() {
        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20000");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4. Teh Tarik - Rp 12000");
        System.out.println("5. Roti Bakar - Rp 10000");
        System.out.println("6. Mie Goreng - Rp 18000");
        System.out.println("=======================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        // Panggil fungsi Menu dari main.
        Menu();
    }
}
