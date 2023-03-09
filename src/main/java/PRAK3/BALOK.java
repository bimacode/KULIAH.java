package PRAK3;

public class BALOK {
    int panjang,lebar,tinggi;
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected void hasil(){
    PERHITUNGAN ph = new PERHITUNGAN();
        System.out.println("Luas Balok Adalah : "+ph.luas(panjang,lebar,tinggi));
        System.out.println("Volume Balok Adalah: "+ph.volume(panjang,lebar,tinggi));
        System.out.println("cube : "+ph.isCube(8));


    }


}
