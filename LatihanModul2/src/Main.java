import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        System.out.println("Inputkan nama Hewan " );
        Hewan.add("Sapi"); Hewan.add("Kelinci"); Hewan.add("Kambing"); Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println(Hewan);

        System.out.println("Hewan yang dihapus: ");
        DeleteHewan.add("Kelinci"); DeleteHewan.add("Kambing"); DeleteHewan.add("Unta");
        System.out.println(DeleteHewan);

        ArrayList<String> Delete = new ArrayList<>();
        for (String Jenis : DeleteHewan){
            Hewan.removeIf(H -> H.equals(Jenis));
            Delete.add(Jenis);
        }

        System.out.println("Output Hewan : \n"+Hewan);
    }
}