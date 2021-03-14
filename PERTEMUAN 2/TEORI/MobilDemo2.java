class Mobil{
    boolean hidup;
    int gigi;

    void hidupkanMobil(){
        hidup = true;
    }
    void matikanMobil(){
        hidup = false;
    }
    void ubahGigi(int gigiBaru){
        gigi = gigiBaru;
    }
}

public class MobilDemo2 {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        mobil1.hidupkanMobil();
        System.out.println(mobil1.hidup);
        mobil1.matikanMobil();
        System.out.println(mobil1.hidup);
        mobil1.ubahGigi(3);
        System.out.println(mobil1.gigi);

    }
}