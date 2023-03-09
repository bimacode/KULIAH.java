package Modu5;
import java.util.Arrays;
import java.util.Scanner ;
public class tugas3 {
    static int input;
    static float Positif;
    static float Negatif;
    static float Zero;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Banyak Data: ");
        input = in.nextInt();
        int [] data = new int[input];

        System.out.print("Input Data: ");
        for (int i = 0 ; i < data.length; i++){
            data[i] = in.nextInt();
        }

        Arrays.sort(data);
        System.out.print("\nResult: ");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }

        for(int i = 0 ; i < data.length ; i++){
            if (data[i] > 0){
                Positif++;
            }else if (data[i] < 0) {
                Negatif++;
            }else{
                Zero++;
            }
        }

        System.out.printf("\n\nPositive : %1.2f", Positif / data.length);
        System.out.printf("\nNegative : %1.2f", Negatif / data.length);
        System.out.printf("\nZero     : %1.2f", Zero / data.length);}}
