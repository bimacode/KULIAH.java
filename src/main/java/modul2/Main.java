package modul2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        // Membuat objek DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        // Menghapus data dari objek Hewan yang sama dengan data warna yang terdapat pada objek DeleteHewan
        Iterator<String> iterator = hewan.iterator();
        while(iterator.hasNext()){
            String animal = iterator.next();
            if(deleteHewan.contains(animal)){
                iterator.remove();
            }
        }

        // Menampilkan hasil penghapusan data
        System.out.println("Hasil penghapusan data:");
        for(String animal : hewan){
            System.out.println(animal);
 }
}
}
