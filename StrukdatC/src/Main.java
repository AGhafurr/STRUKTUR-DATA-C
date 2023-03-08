import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> ListKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> Breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> Lunch = new Konsumsi<>();

        Makanan Roti = new Makanan();
        Roti.setNamaHidangan("Roti Tawar");

        Minuman Susu = new Minuman();
        Susu.setNamaHidangan("Susu Sapi");

        Breakfast.setKonsumsi(Roti, Susu);
        ListKonsumsi.add(Breakfast);

        Makanan Nasi = new Makanan();
        Nasi.setNamaHidangan("Nasi Putih");

        Minuman Air = new Minuman();
        Air.setNamaHidangan("Air Putih");

        Lunch.setKonsumsi(Nasi, Air);
        ListKonsumsi.add(Lunch);

        System.out.println("MENU KONSUMSI");
        for (Konsumsi<Makanan, Minuman> konsumsi : ListKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.Disantap());
            System.out.println(minuman.Disantap());
        }

    }
}
