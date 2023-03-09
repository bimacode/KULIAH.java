package Modu5;


import java.util.Arrays;
import java.util.Scanner ;
public class t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cari;
        int index=-1;

        int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.print("Data awal: ");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }
        Arrays.sort(data);
        System.out.print("\nData Sort: ");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }

        System.out.print("\nMasukkan angka yang akan dicari indexnya : ");
        cari = in.nextInt();
        for(int i=0; i<data.length; i++){
            if(data[i]==cari){index=i;
            break;}
        }
        System.out.println("Data ada di index "+index);
    }}








