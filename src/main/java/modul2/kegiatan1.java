package modul2;

import java.util.ArrayList;

public class kegiatan1 {
    public static void main(String[] args) {
        ArrayList<String> NamaHewan = new ArrayList<String>();
        NamaHewan.add("Angsa");
        NamaHewan.add("Bebek");
        NamaHewan.add("Cicak");
        NamaHewan.add("Domba");
        NamaHewan.add("Elang");
        NamaHewan.add("Gajah");
        NamaHewan.add("Badak");
        NamaHewan.add("Bebek");

        //Menghitung elemen "Bebek" dan menampilkan posisi index dari elemen "Bebek"
        System.out.println("Output : \n"+NamaHewan);
        int hitungBebek = 0;
        for(int i = 0 ; i< NamaHewan.size(); i++){
            if(NamaHewan.get(i).equals("Bebek")){
                hitungBebek++;

            }
        }
        System.out.println("Bebek = "+hitungBebek);
        System.out.println("Posisi Index : "+NamaHewan.indexOf("Bebek") +"," +NamaHewan.lastIndexOf("Bebek"));

        //Menghapus Posisi "Bebek" yang pertama
        int bebek=0;
        for (int i=0 ; i < NamaHewan.size() ; i++){
            if(NamaHewan.get(i).equals("Bebek")){
                bebek++;
                if(bebek==1){
                    NamaHewan.remove(i);
                    break;
                }
            }
        }
        System.out.println("");
        System.out.println(NamaHewan);

        //Menampilkan elemen  pada index ke-0 dan ke-2, dan menghapus index ke-0.
        System.out.println("");
        String elemen1 = NamaHewan.get(0);
        String elemen2 = NamaHewan.get(2);
        System.out.println("Index ke-0: "+elemen1);
        System.out.println("Index ke-2: "+elemen2);
        NamaHewan.remove(0);
        System.out.println(NamaHewan);

        //Mengubah element "Cicak" menjadi "Ular" dan menambah elemen "Itik" Pada index ke 2
        System.out.println("");
        NamaHewan.set(0,"Ular");
        System.out.println(NamaHewan);
        NamaHewan.add(2,"Itik");
        System.out.println(NamaHewan);

        //Menghapus elemen diantara index ke 2 dan ke 5
        System.out.println("");
        NamaHewan.subList(2,5).clear();
        System.out.println(NamaHewan);

        //Menampilkan elemen pertama dan terakhir
        System.out.println("");
        String First = NamaHewan.get(0);
        String Last = NamaHewan.get(NamaHewan.size()-1);
        System.out.println("Elemen Pertama : "+First);
        System.out.println("Elemen Terakhir : "+Last);

        //Menampilkan jumlah elemen
        System.out.println("");
        System.out.println("Jumlah elemen"+NamaHewan.size());

        //Mncari posisi index dari badak
        System.out.println("");
        System.out.println("Posisi Index Badak adaah :  "+NamaHewan.indexOf("Badak"));













    }
}
