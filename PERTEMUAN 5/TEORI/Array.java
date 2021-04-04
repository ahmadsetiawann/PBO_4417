import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    static ArrayList<String> list_hari = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        list_hari.add("Novel");
        list_hari.add("Pelajaran");
        menu();
    }

    static void menu() {
        System.out.println("Toko Buku");
        System.out.println("1. Tambah buku");
        System.out.println("2. List Buku");
        System.out.println("3. Cari Buku");
        System.out.println("Pilih nomor: ");
        int index = input.nextInt();
        switch (index) {
            case 1:
                tambahBuku();
                break;
            case 2:
                listBuku();
                break;
            case 3:
                cariBuku();
                break;
            default:
                menu();
        }
    }

    static void tambahBuku() {
        System.out.print("\nMasukan nama buku: ");
        String nama = input.next();
        list_hari.add(nama);
        System.out.println("\nMasukan lagi? [y/n]");
        String again = input.next();
        if (again.equalsIgnoreCase("y")) {
            tambahBuku();
        } else {
            menu();
        }
    }

    static void cariBuku() {
        int index = 0;
        boolean found = false;
        System.out.print("\nMasukan nama buku: ");
        String nama = input.next();
        for (int i = 0; i < list_hari.size(); i++) {
            if (list_hari.get(i).toString().equalsIgnoreCase(nama)) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(list_hari.get(index));
        } else {
            System.out.println("\nBuku tidak ditemukan\n");
        }
        menu();
    }

    static void listBuku() {
        System.out.println("\nDaftar Buku: ");
        for (int i = 0; i < list_hari.size(); i++) {
            System.out.println(list_hari.get(i));
        }
        System.out.println("");
        menu();
    }

}
