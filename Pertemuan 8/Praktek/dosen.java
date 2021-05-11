public class dosen extends mahasiswa{
    
    public dosen (){
    };
    
    @SuppressWarnings("empty-statement")
    public void InputUtm (String i, String p, int j, int b, String c){
        dosen.add(i);
        switch (j) {
            case 1 -> {
                dosen.add(matkul_utm.get(1) + " Jam "+ p);
                matkul_utm.set(1, "1.Kalkulus"+ " Jam " + p);
            }
            case 2 -> {
                dosen.add(matkul_utm.get(2) + " Jam "+ p);
                matkul_utm.set(2, "2.Fisika" + " Jam " + p);
            }
            
            default ->  {
            }
        };
        switch (b) {
            case 11 -> {
                dosen.add(matkul_tam.get(0) + " Jam "+ c);
                matkul_tam.set(1, "11.Otomata dan teori bahasa"+ " Jam " + c);
            }
            case 12 -> {
                dosen.add(matkul_tam.get(1) + " Jam "+ c);
                matkul_tam.set(2, "12.Logika Informatika"+ " Jam " + c);
            }
            
            default ->  {
                
                }
        };

        
    };
    public void cetakSemua (){
        System.out.println(dosen.get(0));
            System.out.println("Mengampu: ");
            System.out.println(dosen.get(1));
            System.out.println(dosen.get(2));
    };
    
    public void Utmatkul (){
        System.out.println("Silakan Pilih Matkul Utama");
        System.out.println("Mata Kuliah Utama" + matkul_utm);
    };
    public void Tamtmatkul (){
        System.out.println("Silakan Pilih Matkul Tambahan");
        System.out.println("Mata Kuliah Tambahan" + matkul_tam);
    };
    
    

}