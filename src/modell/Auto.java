package modell;
public class Auto extends Jarmu{
    private boolean defekt;
    // Az autók haladás közben 25% eséllyel defektet kaphatnak. Ilyenkor ki lehet cserélni a kereket, különben nem tud haladni. Az üzemanyag ilyenkor nem fogy, csak haladáskor. Tehát defektnél nem érkezett meg, de nem is fogyott el az üzemanyag. 

    public Auto() {
        defekt = false;
    }
    
    @Override
    public boolean halad() {
        if(!megerkezett && uzemanyag && beinditva && !defekt)
        {
            uzemanyag = false;
            if(Math.random() < 0.25)
            {
                defekt = true;
            }
            else
            {
                megerkezett = true;
            }
        }
        return megerkezett;
    }
    
    public void kereketCserel()
    {
        if(defekt)
        {
            defekt = false;
        }
    }
}
