public class Tv extends SprzetRTV{
    private int maxKanal, aktualnyKanal, maxJasnosc, aktualnaJasnosc, przekatna;
    private String rozdzielczosc;

    public Tv(String nazwa, String model, String producent, boolean czyWlaczony, int maxGlosnosc, int aktualnaGlosnosc, int maxKanal, int aktualnyKanal, int maxJasnosc, int aktualnaJasnosc, int przekatna, String rozdzielczosc) {
        super(nazwa, model, producent, czyWlaczony, maxGlosnosc, aktualnaGlosnosc);
        this.maxKanal = maxKanal;
        this.aktualnyKanal = aktualnyKanal;
        this.maxJasnosc = maxJasnosc;
        this.aktualnaJasnosc = aktualnaJasnosc;
        this.przekatna = przekatna;
        this.rozdzielczosc = rozdzielczosc;
    }

    public Tv(String nazwa, String model, String producent, int maxGlosnosc, int aktualnaGlosnosc, int maxKanal, int aktualnyKanal, int maxJasnosc, int aktualnaJasnosc, int przekatna, String rozdzielczosc) {
        super(nazwa, model, producent, maxGlosnosc, aktualnaGlosnosc);
        this.maxKanal = maxKanal;
        this.aktualnyKanal = aktualnyKanal;
        this.maxJasnosc = maxJasnosc;
        this.aktualnaJasnosc = aktualnaJasnosc;
        this.przekatna = przekatna;
        this.rozdzielczosc = rozdzielczosc;
    }


    public void zmienKanal(int kanal){
        if(kanal > 0 && kanal <= maxKanal){
            this.aktualnyKanal = kanal;
        }else {
            System.out.println("Niepoprawny kanał");
        }
    }
    public void zwiekszKanal(){
        if(this.aktualnyKanal + 1 <= this.maxKanal){
            this.aktualnyKanal++;
        }
    }
    public void zmniejszKanal(){
        if(this.aktualnyKanal - 1 > 0){
            this.aktualnyKanal--;
        }
    }

    public void rozjasnij(){
        if(this.aktualnaJasnosc + 1 <= this.maxJasnosc){
            this.aktualnaJasnosc++;
        }
    }
    public void przyciemnij(){
        if(this.aktualnaJasnosc - 1 >= 0){
            this.aktualnaJasnosc--;
        }
    }


    @Override
    public String toString() {
        return "Tv{" +
                "maxKanal=" + maxKanal +
                ", aktualnyKanal=" + aktualnyKanal +
                ", maxJasnosc=" + maxJasnosc +
                ", aktualnaJasnosc=" + aktualnaJasnosc +
                ", przekatna=" + przekatna +
                ", rozdzielczosc='" + rozdzielczosc + '\'' +
                '}';
    }

    public int getMaxKanal() {
        return maxKanal;
    }

    public void setMaxKanal(int maxKanal) {
        this.maxKanal = maxKanal;
    }

    public int getAktualnyKanal() {
        return aktualnyKanal;
    }

    public void setAktualnyKanal(int aktualnyKanal) {
        this.aktualnyKanal = aktualnyKanal;
    }

    public int getMaxJasnosc() {
        return maxJasnosc;
    }

    public void setMaxJasnosc(int maxJasnosc) {
        this.maxJasnosc = maxJasnosc;
    }

    public int getAktualnaJasnosc() {
        return aktualnaJasnosc;
    }

    public void setAktualnaJasnosc(int aktualnaJasnosc) {
        this.aktualnaJasnosc = aktualnaJasnosc;
    }

    public int getPrzekatna() {
        return przekatna;
    }

    public void setPrzekatna(int przekatna) {
        this.przekatna = przekatna;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public void setRozdzielczosc(String rozdzielczosc) {
        this.rozdzielczosc = rozdzielczosc;
    }
}
