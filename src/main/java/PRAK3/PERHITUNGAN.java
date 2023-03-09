package PRAK3;

public class PERHITUNGAN {
    public int volume(int panjangv, int lebarv, int tinggiv) {
        return  4* panjangv * lebarv * tinggiv;
    }
    public int luas(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }
    static boolean isCube(long input){
        long ab = Math.round(Math.cbrt(input));
        return (ab * ab * ab) == input;
    }
}
