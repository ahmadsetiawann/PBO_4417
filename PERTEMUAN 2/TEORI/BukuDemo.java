class Buku{
    String Judul;
    String Pengarang;
    String Penerbit;
    private int tahun;

    Buku(){}
    Buku(String Judul, String Pengarang, String Penerbit, int tahun){
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.tahun = tahun;
    }
    
    void cetakBuku(){
        System.out.println("Judul       :"+this.Judul);
        System.out.println("Pengarang   :"+this.Pengarang);
        System.out.println("Penerbit    :"+this.Penerbit);
        System.out.println("Tahun       :"+this.tahun);
    }
}

public class BukuDemo{
    public static void main(String[] args){
        Buku buku1 = new Buku ("5 cm","Donny Dhirgantoro","Grasindo",2005);
        buku1.cetakBuku();
        Buku buku2 = new Buku ("Lupin","Steven","Erlangga",2020);
        buku2.cetakBuku();
    }
}
    