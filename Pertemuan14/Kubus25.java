package Pertemuan14;

public class Kubus25 {
        // Menghitung volume kubus
    public static int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    // Menghitung luas permukaan kubus
    public static int luasPermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;

        int volume = volumeKubus(sisi);
        int luas = luasPermukaanKubus(sisi);

        System.out.println("Sisi kubus : " + sisi);
        System.out.println("Volume kubus : " + volume);
        System.out.println("Luas permukaan kubus : " + luas);
    }
}
