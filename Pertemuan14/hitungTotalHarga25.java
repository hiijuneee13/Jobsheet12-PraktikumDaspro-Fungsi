package Pertemuan14;

import java.util.Scanner;

public class hitungTotalHarga25 {

    public static void Menu() {
        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20000");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4. Teh Tarik - Rp 12000");
        System.out.println("5. Roti Bakar - Rp 10000");
        System.out.println("6. Mie Goreng - Rp 18000");
        System.out.println("=======================");
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungTotalHargaPromo(int totalHarga, String kodePromo) {

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int potongan = totalHarga * 50 / 100;
            System.out.println("Diskon 50%: -Rp " + potongan);
            return totalHarga - potongan;

        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int potongan = totalHarga * 30 / 100;
            System.out.println("Diskon 30%: -Rp " + potongan);
            return totalHarga - potongan;

        } else if (kodePromo.equalsIgnoreCase("-") || kodePromo.equalsIgnoreCase("TIDAK")) {
            return totalHarga;

        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
            return totalHarga;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        System.out.println("=== PROGRAM PEMESANAN KAFE ===");

        boolean lanjut = true;

        while (lanjut) {
            Menu();

            System.out.print("Pilih nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah pesanan: ");
            int banyakItem = sc.nextInt();

            int total = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            System.out.println("Total harga menu ini: Rp " + total);

            totalKeseluruhan += total;

            System.out.print("Pesan menu lain? (y/n): ");
            char lagi = sc.next().charAt(0);

            if (lagi == 'n' || lagi == 'N') {
                lanjut = false;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Total sebelum diskon: Rp " + totalKeseluruhan);

        System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / -): ");
        String kode = sc.next();

        int totalAkhir = hitungTotalHargaPromo(totalKeseluruhan, kode);

        System.out.println("-------------------------------------");
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + totalAkhir);
        System.out.println("Terima kasih telah memesan!");
    }
}