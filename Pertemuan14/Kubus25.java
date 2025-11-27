package Pertemuan14;

public class Kubus25 {
        // Menghitung volume kubus.
    public static int volumeKubus(int sisi) {
        int volumeKubus = sisi * sisi * sisi;
        return volumeKubus;
    }

    // Menghitung luas permukaan kubus.
    public static int luasPermukaanKubus(int sisi) {
        int luasPermukaanKubus = 6 * sisi * sisi;
        return luasPermukaanKubus;
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
