package tugas2;

import java.util.ArrayList;
import java.util.List;

public class Tugas2 {

    public static void main(String[] args) {
        List<Hewan> hewan = new ArrayList<>();
        hewan.add(new Hewan("Buaya", "Putih"));
        hewan.add(new Hewan("Kumbang", "Hitam"));
        hewan.add(new Hewan("Kambing", "Abu"));
        hewan.add(new Hewan("Harimau", "Coklat"));
        hewan.add(new Hewan("Salamender", "Pink"));

        List<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Hitam");
        deleteHewan.add("Abu");
        deleteHewan.add("Coklat");

        System.out.println("Hewan yang tersisa sebelum penghapusan: ");
        for (Hewan h: hewan){
            System.out.println(h.getJenis()+ " " +h.getWarna());
        }

        System.out.println("Warna Hewan yang akan dihapus : ");
        for (String h: deleteHewan){
            System.out.println(h);
        }

        for (int i = hewan.size() - 1; i > 0; i--){
            Hewan h = hewan.get(i);
            if(deleteHewan.contains(h.getWarna())){
                hewan.remove(h);
            }
        }

        System.out.println("Hewan yang tersisa setelah penghapusan: ");
        for (Hewan h: hewan){
            System.out.println(h.getJenis()+ " " +h.getWarna());
        }
    }
    
}
