public class Search {
    
    
    // Seiriaki anazitisi me pedio kleidi ton Gumnasti.

    public static int seqSearch1 (Athlisi[] a, String key1, String key2, String key3) 
    { 
        for (int i=0; i< TestMain.athlimaNo; i++)
	{
            if (a[i].getGumnastis().equals(key1) && a[i].getHmera().equals(key2) && a[i].getOra().equals(key3))
            {
                return i;
            } 
	}
	return -1;
    }

    // Seiriaki anazitisi me pedio kleidi aithousa.

    public static int seqSearch2 (Athlisi[] a, int key1, String key2, String key3) 
    {
	for (int i=0; i< TestMain.athlimaNo; i++)
	{
            if (a[i].getAithousa() == key1 && a[i].getHmera().equals(key2) && a[i].getOra().equals(key3))
            {
                return i;
            }
	} 
	return -1;
    }
}
