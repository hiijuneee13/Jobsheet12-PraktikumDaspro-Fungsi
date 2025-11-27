package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa25 {
        // a. Fungsi isianArray.
    public static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray.
    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int nilai : arr) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    // c. Fungsi hitTot (mengembalikan total).
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    // d. Fungsi main.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }
}