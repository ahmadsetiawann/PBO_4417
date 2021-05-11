import java.util.ArrayList;


public abstract class universitas {
        ArrayList  mhs = new ArrayList();
        ArrayList  dosen = new ArrayList();
        ArrayList<String>  matkul_utm = new ArrayList<>();
        ArrayList<String>  matkul_tam = new ArrayList<>();
        ArrayList<Integer>  nilaimhs = new ArrayList<>();
    
    public abstract void cetak(int i);
    public abstract void input(String i, int j);
}