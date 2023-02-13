package modell;
public abstract class Jarmu {
    protected boolean beinditva = false;
    protected boolean uzemanyag = true;
    protected boolean megerkezett = false;
    
    public void beindit()
    {
        if(!beinditva)
        {
            beinditva = true;
        }
    }
    
    public void leallit()
    {
        if(beinditva)
        {
            beinditva = false;
        }
    }
    
    public boolean tankol()
    {
        if(!beinditva && !uzemanyag)
        {
            uzemanyag = true;
        }
        return uzemanyag;
    }
    
    public boolean halad()
    {
        if(!megerkezett && uzemanyag && beinditva)
        {
            megerkezett = true;
            uzemanyag = false;
        }
        return megerkezett;
    }
}