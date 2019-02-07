import java.io.*;
class ShoppingPlaza
{
    double cart;
    String chh;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void main()throws Exception
    {
        String c;
        do
        {
            System.out.println("_______________________________________________________________________");
            System.out.println(".*.*.*.*.*.*.*.*.*.WELCOME TO THE GRAND PHOENIX MALL.*.*.*.*.*.*.*.*.*.");
            System.out.println("_______________________________________________________________________\n");
            System.out.println("TAKE A LOOK AT THE NEW STORES AT THE MALL.....");
            System.out.println("______________________________________________\n\n");
            
            
            System.out.println("**********************************************");
            System.out.println("\t1:SAFAL FRESH\n\t2:APSARA STATIONARY\n\t3:KIDS KEMP");
            System.out.println("\t4:ADIDAS\n\t5:ROYAL FURNITURE\n\t6:Hydrabad Biryani\n\t7:Sunny Flowers\n\t8:SONY WORLD");
            System.out.println("**********************************************");
                
            System.out.println("Type the number of the store you want to take a visit and shop.....");
            int ch=Integer.parseInt(br.readLine());
            if(ch==1)
                safal();
            else if(ch==2)
                apsara();
            else if(ch==3)
                kids();
            else if(ch==4)
                adidas();
            else if(ch==5)
                furniture();
            else if(ch==6)
                hyderabadBriyani();
            else if(ch==7)
                sunny();
            else if(ch==8)
                sony();                
                
            System.out.println("To continue shopping at phoenix mall type ....type:-'cont'-.....");
            c=br.readLine();
        }
        while(c.equalsIgnoreCase("cont"));
            
        System.out.println("**********************************************");
        System.out.println("Pay----********____- 'Rs."+cart+"'-___********");
        System.out.println("**********************************************");
        
        System.out.println("You will have to pay by credit card or debit card,\nselect:\n1:credit card\n2:debit card");
        int mon=Integer.parseInt(br.readLine());
        switch(mon)
        {
            case 1:
                System.out.println("\nChoose:\n1:visa\n2:Mastecard");
                int cred1=Integer.parseInt(br.readLine());
                System.out.println("Name on credit card");
                String crename=br.readLine();
                System.out.println("Enter credit card number");
                int crednum=Integer.parseInt(br.readLine());
                System.out.println("Enter credit card expiry month-year; Eg:march-2012");
                String creexp=br.readLine();
                System.out.println("Enter vBv password");
                int credvbv=Integer.parseInt(br.readLine());
            break;
            
            case 2:
                System.out.println("Enter your bank's name");
                String debitbank=br.readLine();
                System.out.println("Enter debit card number");
                int debitnumber=Integer.parseInt(br.readLine());
                System.out.println("Enter debit card expiry month-year; Eg:march-2012");
                String debitexp=br.readLine();
                System.out.println("Enter cardholders's name");
                String debitame=br.readLine();
                System.out.println("Enter PIN number");
                int pin=Integer.parseInt(br.readLine());
            break;
        }
        System.out.println("Rs."+cart+" has been taken from your credit/debit card");
        System.out.println("Enter address of delivery");
        String add=br.readLine();
        
        System.out.println("Thank You for visiting,Please visit Again");
    }
    public void safal()throws Exception
    {
        String choice;
        int ch,n,m;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("WELCOME TO Safal Fresh.....");
            
            System.out.println("**********************************************");
            System.out.println("\t1:BASIC KITCHEN");
            System.out.println("\t2:Vegetables");
            System.out.println("\t3:Fruits");
            System.out.println("\t4:Beaverges");
            System.out.println("**********************************************");
            System.out.println("It will be delivered before 24 hours");
            System.out.println("\n\nTYPE THE NUMBER 1-4 TO INDICATE THE CHOICE YOU INTEND TO BUY.....");
            ch=Integer.parseInt(br.readLine());
           
            switch(ch)
            {
                case 1:
                   String aaz;
                   do
                   {
                        System.out.println("_____________________________________________");
                        System.out.println("WELCOME TO BASIC KITCHEN Section.....");  
                        System.out.println("EACH DAL COSTS YOU RS.90 PER KG.\nRICE AND WHEAT RS.40PER KG.");
                        System.out.println("SPICES-RS.100(ALL ABOVE PER KG)");
                                        
                        System.out.println("**********************************************");
                        System.out.println("\t1:Rice");
                        System.out.println("\t2:WHEAT");
                        System.out.println("\t3:MOONG DAL");
                        System.out.println("\t4:TOOR DAL");
                        System.out.println("\t5.URAD DAL");
                        System.out.println("\t6.CHANNA DAL");
                        System.out.println("\t7.GRAM DAL"); 
                        System.out.println("\t8.SPICES");
                               
                        System.out.println("**********************************************");
                
                        System.out.println("TYPE THE NUMBER 1-8 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Enter the number of kgs you want");
                        m=Integer.parseInt(br.readLine());
                        if(n==3||n==4||n==5||n==6||n==7)
                            cart+=m*90;
                    
                        else if(n==1||n==2)
                            cart+=m*40;
                        
                        else
                            cart+=m*100;
                        System.out.println("The item has been added to your shopping cart");
                        System.out.println("To continue shopping at Basic kitchen type:-'cont'-.....");
                        aaz=br.readLine();
                   }
                   while(aaz.equalsIgnoreCase("cont"));
                
                break;    
                        
                case 2:
                    String aak;
                    do
                    {
                        System.out.println("_____________________________________________");
                        System.out.println("WELCOME TO Vegetables Section.....");  
                        System.out.println("EACH ITEM COSTS YOU RS.20 PER KG.");
                     
                                        
                        System.out.println("**********************************************");
                        System.out.println("\t1:Tomato");
                        System.out.println("\t2:Oninon");
                        System.out.println("\t3:Potato");
                        System.out.println("\t4:Carrot");
                        System.out.println("\t5.Cabbage");
                        System.out.println("\t6.Califlower");
                        System.out.println("\t7.Beetroot"); 
                        System.out.println("\t8.Bootle Guard");
                        System.out.println("\t9.Snake Guard");
                        System.out.println("\t10.Ridge Guard");
                        System.out.println("\t11.Lady Finger");
                        System.out.println("\t12.Capsicum");
                        System.out.println("\t13.Pumpkin");
                        System.out.println("\t14.Spinach");
                        System.out.println("\t15.Garlic");
                        System.out.println("\t16.Broccoli");
                        
                        System.out.println("**********************************************");
                
                        System.out.println("TYPE THE NUMBER 1-16 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Enter the number of kgs you want");
                        m=Integer.parseInt(br.readLine());
                        System.out.println("The item has been added to your shopping cart");
                        cart+=m*20;
                        System.out.println("The item has been added to your shopping cart");
                        System.out.println("To continue shopping at Vegetables section type:-'cont'-.....");
                        aak=br.readLine();
                    }
                    while(aak.equalsIgnoreCase("cont"));
                break;
                
                case 3:
                    String az;
                    do
                    {
                        System.out.println("_____________________________________________");
                        System.out.println("WELCOME TO Fruits Section.....");  
                        System.out.println("EACH ITEM COSTS YOU RS.80 PER KG.");
                     
                                        
                        System.out.println("**********************************************");
                        System.out.println("\t1:Gauva");
                        System.out.println("\t2:Chikko");
                        System.out.println("\t3:Apple");
                        System.out.println("\t4:Bannana");
                        System.out.println("\t5.Orange");
                        System.out.println("\t6.Musambi");
                        System.out.println("\t7.Grapes"); 
                        System.out.println("\t8.Custard apple");
                        System.out.println("\t9.Jackfroot");
                        System.out.println("\t10.Mango");
                        System.out.println("\t11.Pine apple");
                                                      
                        System.out.println("**********************************************");
                
                        System.out.println("TYPE THE NUMBER 1-11 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Enter the number of kgs you want");
                        m=Integer.parseInt(br.readLine());
                        System.out.println("The item has been added to your shopping cart");
                        cart+=m*80;
                        System.out.println("The item has been added to your shopping cart");
                        System.out.println("To continue shopping at Fruits section type:-'cont'-.....");
                        az=br.readLine();
                    }
                    while(az.equalsIgnoreCase("cont"));
                break;
                
                case 4:
                String aam;
                    do
                    {
                        System.out.println("_____________________________________________");
                        System.out.println("WELCOME TO Beaverges Section.....");  
                        System.out.println("EACH drink COSTS YOU RS.80,sauce/jam-Rs.100(ALL per ltr),canned items-Rs.50 per can");
                     
                                        
                        System.out.println("**********************************************");
                        System.out.println("\t1:Coca-Cola");
                        System.out.println("\t2:Mirinda");
                        System.out.println("\t3:Pepsi");
                        System.out.println("\t4:ThumbsUp");
                        System.out.println("\t5.pepsi can");
                        System.out.println("\t6.appy can");
                        System.out.println("\t7:maaza can"); 
                        System.out.println("\t8.frooti can");
                        System.out.println("\t9.Badam milk can");
                        System.out.println("\t10.Flavoured milk can");
                        System.out.println("\t11.Curd can");
                        System.out.println("\t12.Tomato sauce");
                        System.out.println("\t13.Chilli sauce");
                        System.out.println("\t14.Tomato jam");
                        System.out.println("\t15.Mixed jam");
                                                   
                        System.out.println("**********************************************");
                
                        System.out.println("TYPE THE NUMBER 1-15 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("Enter the number of ltr you want");
                        m=Integer.parseInt(br.readLine());
                        if(n==1||n==2||n==3||n==4)
                            cart+=m*80;
                        else if(n>=5&&n<=11)
                            cart+=m*50;
                        else if(n>=12&&n<=15)
                            cart+=m*100;
                        System.out.println("The item has been added to your shopping cart");
                        System.out.println("To continue shopping at Beverges section type:-'cont'-.....");
                        aam=br.readLine();
                    }
                    while(aam.equalsIgnoreCase("cont"));
                break;
                default:
                    System.out.println("INVALID CHOICE");
                break;
            }
                             
            System.out.println("Type -'cont'- to continue shopping in safal fresh......");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
    public void apsara()throws Exception 
    {
        String choice;
        int ch,n;
        String m;
        do
        {
            System.out.println("**********WELCOME TO THE APSARA STATIONARY SHOWROOM**********");
           
            System.out.println("**********************************************");
            System.out.println("\t1:Pencils");
            System.out.println("\t2:Pens");
            System.out.println("\t3:Scale");
            System.out.println("\t4:Scissor(cello tape free)");
            System.out.println("\t5.Erasor&Sharpnor");
            System.out.println("\t6.Pencil box");
            System.out.println("\t7.ColourPecils"); 
            System.out.println("\t8.SketchPens");
            System.out.println("\t9.Chart papers");
            System.out.println("\t10.India Map");
            System.out.println("\t11.World Map");
            System.out.println("\t12.Compass box");
            System.out.println("**********************************************");
            
            System.out.println("TYPE THE NUMBER 1-12 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
            ch=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of items you want");
            n=Integer.parseInt(br.readLine());
            if(ch==1||ch==3||ch==5||ch==10||ch==11)
                cart+=n*5;
            else if(ch==2||ch==7||ch==8||ch==9)
            {    
                System.out.println("Enter colour");
                m=br.readLine();
                cart+=n*15;
            }
            else
                cart+=n*75;
            System.out.println("The item has been added to your shopping cart");
                    
            System.out.println("Type -'cont'- to continue shopping in Apsara Stationary......");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
    public void kids()throws Exception
    {
        String choice,sz;
        int ch,n;
        double cost=0;
        System.out.println("**********WELCOME TO KIDS KEMP**********");
        do
        {
            System.out.println("**********************************************");
            System.out.println("\n\t1:INFANTS(0 to 1 YR.)");
            System.out.println("\n\t2:KIDS(1+ to 12 YRS.)");
            System.out.println("\n\t3:TEENAGERS(13 to 19 YRS)");
            System.out.println("**********************************************");
           
            System.out.println("Enter the section number you want to shop");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    do
                    {
                        System.out.println("WELCOME TO INFANTS SECTION");
                        System.out.println("1:Battery operated toys\n2:Manually operated toys\n3:Stroller\n4:Pram\n5:Crib\n6:Caps");
                        System.out.println("TYPE THE NUMBER 1-6 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        switch(n)
                        {
                            case 1:
                                cost=350;
                            break;
                            case 2:
                                cost=250;
                            break;
                            case 3:
                                cost=2500;
                            break;
                            case 4:
                                cost=2000;
                            break;
                            case 5:
                                cost=18000;
                            break;
                            case 6:
                                cost=50;
                            break;
                            default:
                                System.out.println("*****SORRY THE ITEMS YOU ORDERED ARE NOT AVAILABLE");
                            break;
                        }
                        System.out.println("Enter the number of items you want");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("The item has been added to your shopping cart");
                        cart+=n*cost;
                        System.out.println("Type -'cont'- to continue shopping in the INFANTS section");
                        choice=br.readLine();
                    }
                    while(choice.equalsIgnoreCase("cont"));
                break;
                
                case 2:
                    do
                    {
                        System.out.println("WELCOME TO KIDS SECTION");
                        System.out.println("1:Battery operated toys\n2:Remote controlled toys\n3:Lunch box or pencil box");
                        System.out.println("4:Water Bottle\n5:School Bag\n6:Story Books");
                        System.out.println("TYPE THE NUMBER 1-6 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        switch(n)
                        {
                            case 1:
                                cost=350;
                            break;
                            case 2:
                                cost=555;
                            break;
                            case 3:
                                cost=35;
                            break;
                            case 4:
                                cost=75;
                            break;
                            case 5:
                                cost=200;
                            break;
                            case 6:
                                cost=155;
                            break;
                            default:
                                System.out.println("*****SORRY THE ITEMS YOU ORDERED ARE NOT AVAILABLE");
                            break;
                        }
                        System.out.println("Enter the number of items you want");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("The item has been added to your shopping cart");
                        cart+=n*cost;
                        System.out.println("Type -'cont'- to continue shopping in the KIDS section");
                        choice=br.readLine();
                    }
                    while(choice.equalsIgnoreCase("cont"));
                break;
                
                case 3:
                    do
                    {
                        System.out.println("WELCOME TO TEENAGERS SECTION");
                        System.out.println("1:Digital Diary(Rs.850)\n2:Wallet(Rs.150)\n3:mobile phone(Rs.999)");
                        System.out.println("4:Trousers Belt(Rs.175)\n5:Braclets(Rs.100)");
                        System.out.println("TYPE THE NUMBER 1-6 THAT INDICATES YOUR CHOICE OF ITEM TO BUY");
                        n=Integer.parseInt(br.readLine());
                        switch(n)
                        {
                            case 1:
                                cost=850;
                            break;
                            case 2:
                                cost=150;
                            break;
                            case 3:
                                cost=999;
                            break;
                            case 4:
                                cost=175;
                            break;
                            case 5:
                                cost=100;
                            break;
                            default:
                                System.out.println("*****SORRY THE ITEMS YOU ORDERED ARE NOT AVAILABLE*****");
                            break;
                        }
                        System.out.println("Enter the number of items you want");
                        n=Integer.parseInt(br.readLine());
                        System.out.println("The item has been added to your shopping cart");
                        cart+=n*cost;
                        System.out.println("Type -'cont'- to continue shopping in the Teenagers section");
                        choice=br.readLine();
                    }
                    while(choice.equalsIgnoreCase("cont"));
                break;
                
                default:
                    System.out.println("INVALID CHOICE");
                break;
            }
            System.out.println("Type -'cont'- to continue shopping in  kids kemp........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
    public void adidas()throws Exception
    {
        String choice;
        int ch,n,sz,m;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("**********WELCOME TO ADIDAS SPORTS**********");
            
            System.out.println("**********************************************");
            System.out.println("\t1:Football");
            System.out.println("\t2:Cricket set");
            System.out.println("\t3:Cycle");
            System.out.println("\t4:Cycle set");
            System.out.println("\t5:Sports Shoes");
            System.out.println("\t6:Bats and rackets");
            System.out.println("\t7::Clothes and bands");
            System.out.println("**********************************************");
            
            System.out.println("Cricket set,Cycle,Cycle set cost Rs.1799");
            System.out.println("\n\nTYPE THE NUMBER 1-7 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
            ch=Integer.parseInt(br.readLine());
            
           
            switch(ch)
            {
                case 1:
                    System.out.println("**********************************************");
                    System.out.println("Enter Which Football:\n1:Turf ball\n\t2:EFA ball\n\t3:finale 11\n\t4:F-50");
                    int ftch=Integer.parseInt(br.readLine());
                    System.out.println("Each costs Rs.2699");
                    System.out.println("Enter the number of footballs you want");
                    n=Integer.parseInt(br.readLine());
                    cart+=n*2699;
                break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Enter size");
                    sz=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                    cart+=n*1799;
                    System.out.println("The item has been added to your shopping cart");
                break;
                
                case 5:
                String xxz;
                do
                {
                    System.out.println("Enter size");
                    sz=Integer.parseInt(br.readLine());
                    System.out.println("Enter:\n1:Track shoes(Rs.1999)\n2:Cricket studs(Rs.1999)");
                    System.out.println("3:Football studs(Rs.3499)\n4:Casual wear(Rs.199)");
                    m=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                    if(m==1||m==2)
                        cart+=n*1999;
                    else if(m==3)
                        cart+=n*3499;
                    else
                        cart+=n*499;
                    System.out.println("The item has been added to your shopping cart");
                    System.out.println("Type -'cont'- to continue shopping in  Shoes section........");
                    xxz=br.readLine();
                }
                while(xxz.equalsIgnoreCase("cont"));
                break;
                
                case 6:
                    System.out.println("Enter :\n1:Cricket bat\n2:Badminton racket\n\t3:Tennis racket");
                    System.out.println("\t4:Hocket stick\n\t5:boxing glouse");
                    int xyz=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                     switch(xyz)
                     {
                        case 1:
                        case 3:
                        case 4:
                            cart+=n*1500;
                        break;
                        case 2:
                        case 5:
                            cart+=n*1000;
                        break;
                    }
                break;            
                
                case 7:
                String zzx;
                do
                {
                    System.out.println("Enter:\n1:TrackPant(Rs.999)\n2:CasualShirts(Rs.999)\n3:FootballSocks(Rs.499)");
                    System.out.println("4:Socks(Rs.199)\n5:WristBands(Rs.199)\n6:HeadBands(Rs.199)");
                    m=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                    if(m==1||m==2)
                        cart+=n*999;
                    else if(m==3)
                        cart+=n*499;
                    else if(m==4||m==5||m==6)
                        cart+=n*199;
                    System.out.println("The item has been added to your shopping cart");
                    System.out.println("Type -'cont'- to continue shopping in  Clothes section........");
                    zzx=br.readLine();
                }
                while(zzx.equalsIgnoreCase("cont"));
                break;
                
                default:
                    System.out.println("INVALID CHOICE");
                break;
            }
            System.out.println("Type -'cont'- to continue shopping in the Adidas Showroom........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
    public void furniture()throws Exception
    {
        String choice;
        int ch,n,sz,m;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("WELCOME TO ROYAL FURNITURES.....");
            
            System.out.println("**********************************************");
            System.out.println("\t1:Chairs(Rs.1000)");
            System.out.println("\t2:Tables");
            System.out.println("\t3:Dining sets(Rs.25000)");
            System.out.println("\t4:Sofas");
            System.out.println("\t5:Cupboards");
            System.out.println("\t6:Wooden shelves and drawers(Rs.1000)");
            System.out.println("\t7:Dressing table");
            System.out.println("\t8:Beds");
            System.out.println("**********************************************");
            
            System.out.println("Tables,Sofas,Cupboards,Dressing tables,Beds cost Rs.15000 each");
            System.out.println("\n\nTYPE THE NUMBER 1-7 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
            ch=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of items you want");
            n=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                case 6:
                    cart+=n*1000;
                break;
                
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                    cart+=n*15000;
                break;
                
                case 3:
                    cart+=n*25000;
                break;
                
                default:
                    System.out.println("INVALID CHOICE");
                break;
            }
            System.out.println("The item has been added to your shopping cart");
            
            System.out.println("Type -'cont'- to continue shopping in ROYAL Furniture........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
     public void hyderabadBriyani()throws Exception
     {
        int j,n,ch;
        String choice;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("WELCOME TO Hyderabad Briyani.....");
            
            System.out.println("**********************************************");
            System.out.println("\t1:Starters\n\t2:indian curries");
            System.out.println("\t3:tandoori and kabab\n\t4:special briyani");
            System.out.println("**********************************************");
            
            System.out.println("\n\nTYPE THE NUMBER 1-4 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
            j=Integer.parseInt(br.readLine());
            switch(j)
            {
            case 1:
            do
            {
                System.out.println("welcome to starters section");
                System.out.println("**********************************************");
                System.out.println("The starters that we have are:\n\t1:chicken pepper salt\n\t2:chicken drumstick");
                System.out.println("\t3:chicken manchuria\n\t4:chicken roast\n\t5:mutton roast\n\t6:mutton kabab\n\t7:mushroom chilly\n");
                System.out.println("**********************************************");
            
                System.out.println("all starters from 1 to 5 cost 90 Rs");
                System.out.println("all starters from 6 to 7 cost 110 Rs");
                System.out.println("\n\nTYPE THE NUMBER 1-7 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
                ch=Integer.parseInt(br.readLine());
                System.out.println("Enter the number of items you want");
                n=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        cart+=n*90;
                    break;
                    case 6:
                    case 7:
                        cart+=n*110;
                    break;
                    default:
                        System.out.println("INVALID CHOICE");
                    break;
                }
                System.out.println("Type -'cont'- to continue shopping in the Starters section");
                choice=br.readLine();
            }
            while(choice.equalsIgnoreCase("cont"));
            break;
            case 2:
            do
            {
                System.out.println("welcome to indian curries section");
                System.out.println("**********************************************");
                System.out.println(" The indian curries that we have are:\n\t1:chicken curry\n\t2:ginger chicken");
                System.out.println("\t3:butter chicken\n\t4:chicken tikka\n\t5:mutton masala\n\t6:mutton curry");
                System.out.println("\t7:mutton pepper fry\n\t8:kadai mutton");
                System.out.println("**********************************************");
                System.out.println("all curries from 1 to 4 cost 120 Rs");
                System.out.println("all curries from 5 to 8 cost 149 Rs");
                System.out.println("\n\nTYPE THE NUMBER 1-7 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
                ch=Integer.parseInt(br.readLine());
                System.out.println("Enter the number of items you want");
                n=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        cart+=n*120;
                    break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        cart+=n*149;
                    break;
                    default:
                        System.out.println("INVALID CHOICE");
                    break;
                }
                System.out.println("Type -'cont'- to continue shopping in the indian curries section");
                choice=br.readLine();
            }
            while(choice.equalsIgnoreCase("cont"));
            break;
            case 3:
            do
            {
                System.out.println("welcome to tandoori and kabab section");
                System.out.println("**********************************************");
                System.out.println("The dishes that we have are:\n\t1:tandoori chicken\n\t2:tangdi kabab");
                System.out.println("\t3:kalmi kabab\n\t4:chicken tikka\n\t5:tandoori lemon tikka");
                System.out.println("**********************************************");
                System.out.println("all items from 1 to 2 cost 220 Rs");
                System.out.println("all curries from 3 to 5 cost 230 Rs");
                System.out.println("\n\nTYPE THE NUMBER 1-5 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
                ch=Integer.parseInt(br.readLine());
                System.out.println("Enter the number of items you want");
                n=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                    case 2:
                        cart+=n*220;
                    break;
                    case 3:
                    case 4:
                    case 5:
                        cart+=n*230;
                    break;
                    default:
                        System.out.println("INVALID CHOICE");
                    break;
                }
                System.out.println("Type -'cont'- to continue shopping in the tandoori and kabab  section");
                choice=br.readLine();
            }
            while(choice.equalsIgnoreCase("cont"));
            break;
            case 4:
            do
            {
                System.out.println("welcome to Special briyani section");
                System.out.println("**********************************************");
                System.out.println("the dishes that we have are:\n\t1:spl.hyd.mutton briyani");
                System.out.println("\t2:spl.hyd.chicken briyani\n\t3:spl.hyd.prawns briyani\n\t4:spl.hyd.veg.briyani");
                System.out.println("**********************************************");
                System.out.println("all items from 1 to 2 cost 250 Rs");
                System.out.println("all curries from 3 to 4 cost 210 Rs");
                System.out.println("\n\nTYPE THE NUMBER 1-4 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
                ch=Integer.parseInt(br.readLine());
                System.out.println("Enter the number of items you want");
                n=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                    case 2:
                        cart+=n*250;
                    break;
                    case 3:
                    case 4:
                        cart+=n*210;
                    break;
                    default:
                        System.out.println("INVALID CHOICE");
                    break;
                }
                System.out.println("Type -'cont'- to continue shopping in the tandoori and kabab  section");
                choice=br.readLine();
            }
            while(choice.equalsIgnoreCase("cont"));
            break;
            default:
            System.out.println("INVALID CHOICE");
            break;
            }
            System.out.println("Type -'cont'- to continue shopping in the hyderabad briyani........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
    public void sunny()throws Exception
    {
            String choice;
        int ch,n,sz,m;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("WELCOME TO SUNNY BOUQUET.....");
            System.out.println(" we have 7 varieties of flower");
            System.out.println("**********************************************");
            System.out.println("1:lily");
            System.out.println("2:sun flower");
            System.out.println("3:wild rose");
            System.out.println("4:red rose");
            System.out.println("5:white rose");
            System.out.println("6:virgin");
            System.out.println("7:daisy");
            System.out.println("\n\nTYPE THE NUMBER 1-7 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
            ch=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of items you want");
            n=Integer.parseInt(br.readLine());
            switch(ch)
            {
              
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                cart+=n*300;
                break;
                default:
                System.out.println("INVALID CHOICE");
                break;
            }
            System.out.println("The item has been added to your shopping cart");
            
            System.out.println("Type -'cont'- to continue shopping in SUNNY BOUQUET SHOP........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
     public void sony()throws Exception
    {
        String choice;
        int ch,n,sz,m;
        do
        {
            System.out.println("_____________________________________________");
            System.out.println("WELCOME TO SONY WORLD.....");
            
            System.out.println("**********************************************\n\t1:TELEVISIONs");
            System.out.println("\t2:COMPUTERs");
            System.out.println("\t3:LAPTOPs");
            System.out.println("\t4:NOTEBOOK/NETBOOKs");
            System.out.println("\t5:MUSIC PLAYERS");
            System.out.println("\t6:Home theatre system");
            System.out.println("\t7:Printers");
            System.out.println("\t8:Cameras");
            System.out.println("\t9:Play Stations");
            System.out.println("**********************************************");
            
            System.out.println("\n\nTYPE THE NUMBER 1-10 TO INDICATE THE CHOICE OF  YOU INTEND TO BUY.....");
            ch=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of items you want");
            n=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                    cart+=n*20000;
                break;
                
                case 5:
                    System.out.println("Enter :\n1:Mp3 player\n2:DVD player");
                    int xyz=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                     switch(xyz)
                     {
                        case 1:
                            cart+=n*2500;
                        break;
                        case 2:
                            cart+=n*6500;
                        break;
                    }
                break;            
                
                case 6:
                case 7:
                    cart+=n*3000;
                break;
               
                case 8:
                    System.out.println("Enter :\n1:Cyber shot wide shot\n2:NEX-5\n3:Bloggie MHS-PM5");
                    System.out.println("4:Mavica\n5:Alpha");
                    System.out.println("All cost Rs.2500");
                    int abc=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                    cart+=n*2500; 
                break;
                case 9:
                    System.out.println("Enter :\n1:PS-1\n2:PS-2\n3:PS-3(normal)\n4:PS-3(movement)\n5:PSP");
                    int aaa=Integer.parseInt(br.readLine());
                    System.out.println("Enter the number of items you want");
                    n=Integer.parseInt(br.readLine());
                    switch(aaa)
                    {
                        case 1:
                            cart+=n*2000;
                        break;
                        
                        case 2:
                        case 5:
                            cart+=n*8500;
                        break;
                        case 3:
                            cart+=n*20000;
                        break;
                        case 4:
                            cart+=n*30000;
                        break;
                        default:
                            System.out.println("INVALID CHOICE");
                        break;
                    }
                default:
                    System.out.println("INVALID CHOICE");
                break;
            }
            System.out.println("The item has been added to your shopping cart");
            
            System.out.println("Type -'cont'- to continue shopping in SONY WORLD........");
            chh=br.readLine();
        }
        while(chh.equalsIgnoreCase("cont"));
    }
}

                
                    
                    
                    
                    
                    
                    
                    
                    
                    
