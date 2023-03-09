package modul1;

public class Kota <E>{
    private E element ;

    public Kota (E kota){
        element = kota ;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<>(9);
        Kota<String> namakota = new Kota<>(" Malang");
        System.out.println("Jumlah kota di    jawa timur : "+jumlahkota.getElement()+" kota");
        System.out.println("Salah satu kota di jawa timur : kota"+namakota.getElement());
    }
}
