package arcade;



public class Terminals {
        private String cat1 = "Candy Bar";
        private int c1Cost = 100;
        private int stock1 = 20;
        
        private String cat2 = "Teddy Bear";
        private int c2Cost = 1500;
        private int stock2 = 8;
        
        private String cat3 =" Xbox One";
        private int c3Cost = 12000;
        private int stock3 = 5;
    
        private boolean noBal = false;
        
    //Methods
    public void convMoney(TestArcade tA, int dollAmt, int cardN){
        Cards ja = tA.getJack();
        Cards jl = tA.getJill();
        if(cardN == ja.getNum()){
            dollAmt = dollAmt * 2;
            int creds = ja.getCred() + dollAmt;
            ja.setCred(creds);
        }else if(cardN == jl.getNum()){
            dollAmt = dollAmt * 2;
            int creds = jl.getCred() + dollAmt;
            jl.setCred(creds);    
        }else;
        
    }
    public void checkBal(TestArcade tA, int cardN){
        Cards ja = tA.getJack();
        Cards jl = tA.getJill();
        if(cardN == ja.getNum()){
            System.out.println("Balances for Card No. " + ja.getNum());
            System.out.println("Credit Bal: " + ja.getCred());
            System.out.println("Ticket Bal: " + ja.getTick());
        }else if(cardN == jl.getNum()){
            System.out.println("Balances for Card No. " + jl.getNum());
            System.out.println("Credit Bal: " + jl.getCred());
            System.out.println("Ticket Bal: " + jl.getTick());
        } 
        System.out.println("");
        System.out.println("");
        
    }
    public void transfBal(TestArcade tA, String type, String giv, String rec, int amt){
        Cards ja = tA.getJack();
        Cards jl = tA.getJill();
        
        int jack = 0;
        int jill = 0;
        
        if(type.equals("Credits")){
            if(giv.equals("Jack")){
                jack = ja.getCred() - amt;
                ja.setCred(jack);
                jill = jl.getCred() + amt;
                jl.setCred(jill);
            }else{
                jack = ja.getCred() + amt;
                ja.setCred(jack);
                jill = jl.getCred() - amt;
                jl.setCred(jill);
            }
        }else if(type.equals("Tickets")){
            if(giv.equals("Jack")){
                jack = ja.getTick() - amt;
                ja.setTick(jack);
                jill = jl.getTick() + amt;
                jl.setTick(jill);
            }else{
                jack = ja.getTick() + amt;
                ja.setTick(jack);
                jill = jl.getTick() - amt;
                jl.setTick(jill);
            }
        }else;
        
    }
    public void prizes(TestArcade tA, String prizeSelect, int cardN){
        Cards ja = tA.getJack();       
        Cards jl = tA.getJill();
        
        if(cardN == ja.getNum()){
            prizeSelect(prizeSelect, ja.getCred(), ja.getNum());
            if(noBal == true){
                System.out.println("Insufficient funds for that prize!");
            }else{
                
            }
        }else if(cardN == jl.getNum()){
            prizeSelect(prizeSelect, jl.getCred(), jl.getNum());
            if(noBal == true){
                System.out.println("Insufficient funds for that prize!");
            }else{
                
            }
        }else;
        
        
    }
    public void prizeSelect(String prize, int credits, int idNum){
        if(prize.equals(cat1)){
            if(credits >= c1Cost){
                stock1 = stock1 - 1;
                System.out.println("Prize Purchased By Card" + idNum +": " + prize);
                System.out.println();
                System.out.println("Remaining stock of " + prize + ": " + stock1);
            }else{
                noBal = true;
            }
        }else if(prize.equals(cat2)){
            if(credits >= c2Cost){
                stock1 = stock1 - 1;
                System.out.println("Prize Purchased By Card" + idNum +": " + prize);
                System.out.println();
                System.out.println("Remaining stock of " + prize + ": " + stock2);
            }else{
                noBal = true;
            }
        }else if(prize.equals(cat3)){
            if(credits >= c3Cost){
                stock1 = stock1 - 1;
                System.out.println("Prize Purchased By Card" + idNum +": " + prize);
                System.out.println();
                System.out.println("Remaining stock of " + prize + ": " + stock3);
            }else{
                noBal = true;
            }
        }else;
    }
}
