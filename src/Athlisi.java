public class Athlisi {
    
    private String athlima;
    private String gumnastis;
    private int aithousa;
    private String hmera;
    private String ora;
    
    public Athlisi()
    {
        this("","",0,"","");
    }
    
    public Athlisi(String Ath, String Gum, int aith, String day, String time)
    {
        athlima = Ath;
        gumnastis = Gum;
        aithousa = aith;
        hmera = day;
        ora = time;
    }
    
    public String getAthlima()
    {
        return athlima;
    }
    public String getGumnastis()
    {
        return gumnastis;
    }
    public int getAithousa()
    {
        return aithousa;
    }
    public String getHmera()
    {
        return hmera;
    }
    public String getOra()
    {
        return ora;
    }
    
    public void setAthlima(String Ath)
    {
        athlima = Ath;
    }
    public void setGumnastis(String Gum)
    {
        gumnastis = Gum;
    }
    public void setAithousa(int aith)
    {
        aithousa = aith;
    }
    public void setHmera(String day)
    {
        hmera = day;
    }
    public void setOra(String time)
    {
        ora = time;
    }
    
    public String toString() 
    {
	String  mes="\n\tAthlima: "+athlima+"          Gumnastis: "+gumnastis+"          Aithousa: "+aithousa;
        mes += "          Hmera: "+hmera+" kai ora: "+ora+"\n";
	return mes;
    }
}