/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class matematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        // TODO code application logic here
        matematika mtk = new matematika();
        mtk.tambah(20, 20);
        mtk.kurang(10, -5);
        mtk.kali(10, 20);
        mtk.bagi(20, 2);
    }
}

class matematika{
    int a = 0;
    int b = 0;
    int hasil;
    void tambah(int a, int b){
        hasil = a + b;
        System.out.println("Pertambahan :" + a + "+" + b + "=" + hasil);
    }
    void kurang(int a, int b){
        hasil = a - b;
        System.out.println("Perngurangan :" + a + "-" + b + "=" + hasil);
    }
    void kali(int a, int b){
        hasil = a * b;
        System.out.println("Perkalian :" + a + "*" + b + "=" + hasil);
    }
    void bagi(int a, int b){
        hasil = a / b;
        System.out.println("Pembagian :" + a + "/" + b + "=" + hasil);
    }
}
