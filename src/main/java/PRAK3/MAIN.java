package PRAK3;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BALOK cube = new BALOK();
        System.out.print("Masukkan Panjang Balok : ");
        cube.setPanjang(in.nextInt());
        System.out.print("Masukkan Lebar Balok : ");
        cube.setLebar(in.nextInt());
        System.out.print("Masukkan Tinggi Balok : ");
        cube.setTinggi(in.nextInt());
        cube.hasil();
    }

}
