public class Main {
    public static void main(String[] args){
        SprzetRTV rtv = new SprzetRTV("Telewizor", "750", "LG", true, 50, 25);

        System.out.println(rtv);
        rtv.wlaczWylacz();
        System.out.println(rtv);
        rtv.wlaczWylacz();
        System.out.println(rtv);

        rtv.przycisz();
        rtv.przycisz();
        rtv.przycisz();
        System.out.println(rtv);

        Tv tv = new Tv("Telewizor", "750", "LG", 50, 25, 10, 2, 100, 75, 15, "1920x1080");

        tv.zwiekszKanal();
        tv.zwiekszKanal();
        System.out.println(tv);

        tv.zmienKanal(13);
        System.out.println(tv);
        tv.zmienKanal(3);
        System.out.println(tv);

        tv.przyciemnij();
        System.out.println(tv);
        tv.rozjasnij();
        System.out.println(tv);
    }
}
