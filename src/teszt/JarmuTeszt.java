package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu
{}

public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt()
    {
//        mintaSablonTeszt();
        haladAutoBeinditasNlkTeszt();
        haladAutoBeinditassalTeszt();
        haladJarmuBeinditasNlkTeszt();
        haladJarmuBeinditassalTeszt();
        nemTankolJarmuBeinditvaTeszt();
        megtankolJarmuLeallitvaTeszt();
        nemTankolAutoBeinditvaTeszt();
        megtankolAutoLeallitvaTeszt();
//        megyAutoKerekcsereUtanTeszt();
    }
    
    public void mintaSablonTeszt()
    {
        int kapott = 4;
        int vart = 7;
        assert kapott == vart : "nem egyenlőek";
    }

    private void haladAutoBeinditasNlkTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "beindítás nélkül elindult az autó";
    }
    
    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "beindítással nem indult el az autó";
    }
    
    private void haladJarmuBeinditasNlkTeszt() {
        Hajo jarmu = new Hajo();
        boolean kapott = jarmu.halad();
        boolean vart = false;
        assert kapott == vart : "beindítás nélkül elindult a jármű";
    }
    
    private void haladJarmuBeinditassalTeszt() {
        Hajo jarmu = new Hajo();
        jarmu.beindit();
        boolean kapott = jarmu.halad();
        boolean vart = true;
        assert kapott == vart : "beindítással nem indult el a jármű";
    }
    
    private void megyAutoKerekcsereUtanTeszt() {
        Auto auto;
        boolean megerkezett = true;
        do
        {
            auto = new Auto();
            auto.beindit();
            megerkezett = auto.halad();
        }
        while(megerkezett);
        boolean kapott = auto.kereketCserel();
        boolean vart = true;
        assert kapott == vart : "nem lehetett kereket cserélni";
    }
    
    private void nemTankolAutoBeinditvaTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean haladt;
        do
        {
            haladt = auto.halad();
            auto.leallit();
            auto.kereketCserel();
        }
        while(!haladt);
        auto.beindit();
        boolean kapott = auto.tankol();
        boolean vart = false;
        assert kapott == vart : "megtankolt az auto beindítva";
    }
    
    private void megtankolAutoLeallitvaTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean haladt;
        do
        {
            haladt = auto.halad();
            auto.leallit();
            auto.kereketCserel();
        }
        while(!haladt);
        boolean kapott = auto.tankol();
        boolean vart = true;
        assert kapott == vart : "nem tankolt meg az autoleállítva";
    }
    
    private void nemTankolJarmuBeinditvaTeszt() {
        Hajo jarmu = new Hajo();
        jarmu.beindit();
        jarmu.halad();
        boolean kapott = jarmu.tankol();
        boolean vart = false;
        assert kapott == vart : "megtankolt a jármű beindítva";
    }
    
    private void megtankolJarmuLeallitvaTeszt() {
        Hajo jarmu = new Hajo();
        jarmu.beindit();
        jarmu.halad();
        jarmu.leallit();
        boolean kapott = jarmu.tankol();
        boolean vart = true;
        assert kapott == vart : "nem tankolt meg a jármű leállítva";
    }
}
