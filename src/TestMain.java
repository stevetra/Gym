public class TestMain {
    
    static int athlimaNo=0;
    
    public static void main (String args[]) 
    {
        int choice;

	Athlisi[] a = new Athlisi[10];

	do {
            
            ListDisplays.displayListChoice();
            choice = UserInput.getInteger();
            
            switch (choice) 
            {
                case 1: 
                    insertAthlisi(a);
                    break;
                
                case 2:
                    displayPinakas(a);
                    break;
                
                case 3:
                    System.out.println("\n\t ... TERMATISMOS PROGRAMMATOS ...\n");
                    break;
                
                default:
                    System.out.println("\tLanthasmeni epilogi -- Eisagete arithmo 1-3\n");
            }       
        } while (choice != 3);
    }
    
    public static void insertAthlisi (Athlisi[] a)
    {
        int ch1,ch2,ch3,ch4,ch5;
        int elegxos1;
        int elegxos2;
        String timi1,timi2,timi4,timi5;
        int timi3;
        
        do{
            elegxos1 = 0;
            elegxos2 = 0;
            timi1 = "";
            timi2 = "";
            timi3 = 0;
            timi4 = "";
            timi5 = "";
            ++athlimaNo;
            
            System.out.println("\nEisagogi Stoixeiwn " + athlimaNo + "ou athlimatos ");
            --athlimaNo;

            do {
                ListDisplays.displayAthlimata();
                ch1 = UserInput.getInteger();

                switch (ch1) 
                {
                    case 1: 
                        timi1 = "BOSU";
                        break;
                    case 2: 
                        timi1 = "CIRCUIT TRAINING";
                        break;
                    case 3:
                        timi1 = "TRX";
                        break;
                    case 4:
                        timi1 = "STEP FESTIVAL";
                        break;
                    case 5:
                        timi1 = "CORE CONCEPT";
                        break;
                    case 6:
                        timi1 = "NRG YOGA";
                        break;
                    case 7:
                        timi1 = "X-CROSS";
                        break;
                    case 8:
                        timi1 = "X-FIGHT";
                        break;
                    case 9:
                        timi1 = "X-RIDE";
                        break;
                    case 10:
                        timi1 = "CARDIO FESTIVAL";
                        break;

                    default:
                        System.out.println("\tLanthasmeni epilogi -- Dwste epilogi (1-10):\n");
                }
            } while (ch1<1 || ch1>10);

            do {
                ListDisplays.displayGymnastes();
                ch2 = UserInput.getInteger();

                switch (ch2) 
                {
                    case 1: 
                        timi2 = "Konstantinou Nikos";
                        break;
                    case 2: 
                        timi2 = "Panagiotidis Xrusostomos";
                        break;
                    case 3:
                        timi2 = "Xristopoulos Denvriskoname";
                        break;
                    case 4:
                        timi2 = "Xristoforidou Marianthi";
                        break;
                    case 5:
                        timi2 = "Papanikolaou Maria";
                        break;

                    default:
                        System.out.println("\tLanthasmeni epilogi -- Dwste epilogi (1-5):\n");
                }
            } while (ch2<1 || ch2>5);

            do {
                ListDisplays.displayAithouses();
                ch3 = UserInput.getInteger();

                switch (ch3) 
                {
                    case 1: 
                        timi3 = 1;
                        break;
                    case 2: 
                        timi3 = 2;
                        break;
                    case 3:
                        timi3 = 3;
                        break;
                    case 4:
                        timi3 = 4;
                        break;
                    case 5:
                        timi3 = 5;
                        break;

                    default:
                        System.out.println("\tLanthasmeni epilogi -- Dwste epilogi (1-5):\n");
                }
            } while (ch3<1 || ch3>5);

            do {
                ListDisplays.displayMeres();
                ch4 = UserInput.getInteger();

                switch (ch4) 
                {
                    case 1: 
                        timi4 = "Deutera";
                        break;
                    case 2: 
                        timi4 = "Triti";
                        //a[athlimaNo-1].setHmera("Triti");
                        break;
                    case 3:
                        timi4 = "Terarti";
                        break;
                    case 4:
                        timi4 = "Pempti";
                        break;
                    case 5:
                        timi4 = "Paraskeui";
                        break;
                    case 6:
                        timi4 = "Savvato";
                        break;

                    default:
                        System.out.println("\tLanthasmeni epilogi -- Dwste epilogi (1-6):\n");
                }
            } while (ch4<1 || ch4>6);

            do {
                ListDisplays.displayOres();
                ch5 = UserInput.getInteger();

                switch (ch5) 
                {
                    case 1: 
                        timi5 = "9:30-10:30";
                        break;
                    case 2: 
                        timi5 = "11:00-12:00";
                        break;
                    case 3:
                        timi5 = "15:30-16:30";
                        break;
                    case 4:
                        timi5 = "16:30-17:30";
                        break;
                    case 5:
                        timi5 = "17:30-18:30";
                        break;
                    case 6:
                        timi5 = "18:30-19:30";
                        break;
                    case 7:
                        timi5 = "19:30-20:30";
                        break;
                    case 8:
                        timi5 = "20:30-21:30";
                        break;
                    case 9:
                        timi5 = "21:30-22:30";
                        break;

                    default:
                        System.out.println("\tLanthasmeni epilogi -- Dwste epilogi (1-9):\n");
                }
            } while (ch5<1 || ch5>9);
            
            // Elegxos....
            elegxos1 = Search.seqSearch1(a, timi2, timi4, timi5);
            elegxos2 = Search.seqSearch2(a, timi3, timi4, timi5);
            
           if (elegxos1 != -1)
               System.out.println("\n\tO Gumnastis tin Imera: "+timi4+" kai ora: "+timi5+" paradidei allo athlima!!!\n\tEisagete ksana ta dedomena:");
                      
           if (elegxos2 != -1)
              System.out.println("\n\tI Aithousa tin Imera: "+timi4+" kai ora: "+timi5+" einai katoxuromeni!!!\n\tEisagete ksana ta dedomena:");
           
           if (elegxos1 == -1 && elegxos2 == -1)
           {
               ++athlimaNo;
               a[athlimaNo-1] = new Athlisi ();
               a[athlimaNo-1].setAthlima(timi1);
               a[athlimaNo-1].setGumnastis(timi2);
               a[athlimaNo-1].setAithousa(timi3);
               a[athlimaNo-1].setHmera(timi4);
               a[athlimaNo-1].setOra(timi5);
               System.out.println("\nEpitixis kataxwrisi!!");
           }
        } while (elegxos1 != -1 || elegxos2 != -1);
    }
    
    
    public static void displayPinakas(Athlisi[] a)
    {
        {
            System.out.println("\tEmfanisi "+athlimaNo+" athlimaton pou exoyn kataxorithei:");
            for (int i=0; i<athlimaNo; i++)
            {
                System.out.println(a[i]);
            }
	}
    } 
}