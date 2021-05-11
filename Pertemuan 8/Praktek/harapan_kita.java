import java.util.Scanner;


public class harapan_kita{
    
    public static void main(String[] args) {
        // TODO code application logic here
       dosen dos = new dosen();
       System.out.println("Untuk Dosen: ");
       Scanner sc = new Scanner(System.in);
       System.out.println("Nama:");
       String i = sc.nextLine();
       dos.Utmatkul();
       System.out.println("Matkul Utama: :");
       int j = sc.nextInt();
       System.out.println("Jam Matkul Utama:");
       String p = sc.next();
       dos.Tamtmatkul();
       System.out.println("Matkul Tambahan: :");
       int b = sc.nextInt();
       System.out.println("Jam Matkul Tambahan:");
       String c = sc.next();
       dos.InputUtm(i, p, j, b, c);
       dos.cetakSemua();
       System.out.println("Mahasiswa: ");
       System.out.println("Nama:");
       String z = sc.next();
       dos.MatkulUtm();
       System.out.println("Matkul Utama yg Di Ambil: :");
       int f = sc.nextInt();
       System.out.println("Matkul Utama yg Di Ambil: :");
       int g = sc.nextInt();
       dos.MatkulTam();
       dos.InputMtMhs(z, f, g);
       dos.cetmhsMat();
       System.out.println("Dosen: ");
       System.out.println("Untuk Melihat Matkul Yg Di Ikuti Mhs");
       int n = sc.nextInt();
       dos.CetaMhsFromMatkul(n);
       System.out.println("Menginput Nilai Mahasiswa Berikut:");
       dos.cetmhsMat();
       System.out.println("Silakan Input Nilai Matkul 1: ");
       int o = sc.nextInt();
       System.out.println("Silakan Input Nilai Matkul 2: ");
       int d = sc.nextInt();
       dos.InputNilaiMhs(o, d);
       dos.cetmhsNilai();
       
       
        
        
    }
    
}