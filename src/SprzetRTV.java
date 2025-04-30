public class SprzetRTV {
    private String nazwa, model, producent;
    private boolean czyWlaczony;
    private int maxGlosnosc, aktualnaGlosnosc;

    public SprzetRTV(String nazwa, String model, String producent, boolean czyWlaczony, int maxGlosnosc, int aktualnaGlosnosc) {
        this.nazwa = nazwa;
        this.model = model;
        this.producent = producent;
        this.czyWlaczony = czyWlaczony;
        this.maxGlosnosc = maxGlosnosc;
        this.aktualnaGlosnosc = aktualnaGlosnosc;
    }

    public SprzetRTV(String nazwa, String model, String producent, int maxGlosnosc, int aktualnaGlosnosc) {
        this.nazwa = nazwa;
        this.model = model;
        this.producent = producent;
        this.czyWlaczony = false;
        this.maxGlosnosc = maxGlosnosc;
        this.aktualnaGlosnosc = aktualnaGlosnosc;
    }

    public void wlaczWylacz(){
        this.czyWlaczony = !this.czyWlaczony;
    }

    public void przycisz(){
        if(this.aktualnaGlosnosc - 1 >= 0){
            this.aktualnaGlosnosc--;
        }else {
            System.out.println("Nie poprawna wartość");
        }
    }
    public void podglos(){
        if(this.aktualnaGlosnosc + 1 <= maxGlosnosc){
            this.aktualnaGlosnosc++;
        }else {
            System.out.println("Nie poprawna wartość");
        }
    }

    @Override
    public String toString(){
        return nazwa + " " + model + " " + producent + " status: " + (czyWlaczony ? "włączony" : "wyłączony") + " max głośność: " + maxGlosnosc + " aktualna głośność: " + aktualnaGlosnosc;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public boolean isCzyWlaczony() {
        return czyWlaczony;
    }

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }

    public int getAktualnaGlosnosc() {
        return aktualnaGlosnosc;
    }

    public void setAktualnaGlosnosc(int aktualnaGlosnosc) {
        this.aktualnaGlosnosc = aktualnaGlosnosc;
    }

    public int getMaxGlosnosc() {
        return maxGlosnosc;
    }

    public void setMaxGlosnosc(int maxGlosnosc) {
        this.maxGlosnosc = maxGlosnosc;
    }
}
