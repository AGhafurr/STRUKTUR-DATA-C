public class Hidangan {
    protected String NamaHidangan;
    public String getNamaHidangan() {
        return NamaHidangan;
    }

    public void setNamaHidangan(String namaHidangan) {
        NamaHidangan = namaHidangan;
    }

    public String Disantap(){
        return "Makanan Dihidangkan";
    }
}

class Minuman extends Hidangan{
    public String Disantap(){
        return this.getNamaHidangan() + " Diminum";
    }
}

class Makanan extends Hidangan{
    public String Disantap(){
        return this.getNamaHidangan() + " Dimakan";
    }
}