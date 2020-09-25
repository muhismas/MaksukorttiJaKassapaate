
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Maksukortti pekanKortti = new Maksukortti(10);

        System.out.println("rahaa " + pekanKortti.saldo());
        boolean onnistuiko = pekanKortti.otaRahaa(8);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());

        onnistuiko = pekanKortti.otaRahaa(4);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
        
        Kassapaate unicafeExactum = new Kassapaate();

        double vaihtorahaa = unicafeExactum.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        System.out.println(unicafeExactum);
    }
}

