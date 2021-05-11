public class mahasiswa extends nilai {
    String Kalkulus, Fisika, OTB, LogInformatika; 
    int A, B, C, total;
    double utm = 0.6;
    double tam = 0.4;
    public mahasiswa (){
    };
    
    
    @SuppressWarnings("empty-statement")
    public void InputMtMhs (String i, int j,int x){
        mhs.add(i);
        switch (j) {
            case 1 -> {mhs.add(matkul_utm.get(1));
                     Kalkulus = i;
            }
            case 2 -> {mhs.add(matkul_utm.get(2));
                     Fisika = i;
            }
            
            default -> {
            }
        };

        switch (x) {
            case 11 -> {mhs.add(matkul_tam.get(0));
                        OTB = i;
                        break;
            }
            case 12 -> {mhs.add(matkul_tam.get(1));
                        LogInformatika = i;
                        break;
            }

            default -> {
            }
        };
        
    };
    
    @SuppressWarnings("empty-statement")
    public void CetaMhsFromMatkul(int v){
        switch (v) {
            case 1 -> {System.out.println(matkul_utm.get(1) +" : " + Kalkulus);
            }
            case 2 -> {System.out.println(matkul_utm.get(2) +" : " + Fisika);
            }
            case 11 -> {System.out.println(matkul_tam.get(1) +" : " + OTB);
            }
            case 12 -> {System.out.println(matkul_tam.get(2) +" : " + LogInformatika);
            }
        
            default -> {
            }
        };      
    };
    
    public void cetmhsMat (){
        System.out.println(mhs.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mhs.get(1));
            System.out.println(mhs.get(2));
    };
    
    public void cetmhsNilai (){
        System.out.println(mhs.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mhs.get(1) +" Nilai: " + nilaimhs.get(0));
            System.out.println(mhs.get(2)+" Nilai: " + nilaimhs.get(1));
            System.out.println("Rata rata nilai akhir: ");
            A = nilaimhs.get(0);
            B = nilaimhs.get(1);
            total = (int) (A * utm + B * utm * tam);
            System.out.println(total);
    };
    
    public void MatkulUtm (){
        System.out.println("Silakan Pilih Matkul Utama 2");
        System.out.println("Mata Kuliah Utama" + matkul_utm);
    };
    public void MatkulTam (){
        System.out.println("Silakan Pilih Matkul Tambahan 1");
        System.out.println("Mata Kuliah Tambahan" + matkul_tam);
    };
}