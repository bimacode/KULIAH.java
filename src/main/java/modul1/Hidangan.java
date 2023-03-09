package modul1;

import java.util.ArrayList;

public class Hidangan {
    protected String namaHidangan;

    public String getNamaHidangan() {
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
    }
    public String  disantap(){
        return "Makanan dihidangkan";
    }



        public class Makanan extends Hidangan{
            public String disantap() {
                return this.getNamaHidangan()+"Dimakan";
            }


        }
    }

