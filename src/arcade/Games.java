package arcade;

import java.util.Random;


public class Games {
     
    private boolean enCred;
    
    //Methods
    public void RandGame(TestArcade tA, int cardN){
        Cards ja = tA.getJack();
        Cards jl = tA.getJill();
        Random rand = new Random();
        enCred = true;
        String person = "";
        reduceBal(tA, cardN);
        if(enCred == true){
            if(cardN == ja.getNum()){
                int tickets = rand.nextInt(100);
                tickets = ja.getTick() + tickets;
                ja.setTick(tickets);
            }else if(cardN == jl.getNum()){
                int tickets = rand.nextInt(100);
                tickets = jl.getTick() + tickets;
                jl.setTick(tickets);
            }else;
        }else;
    }
    
    public void reduceBal(TestArcade tA, int cardN){
        Cards ja = tA.getJack();
        Cards jl = tA.getJill();
        
        int creds;
        
        if(cardN == ja.getNum()){
            creds = ja.getCred() - 5;
                if(creds >= 0){
                    ja.setCred(creds);
                }else{
                    enCred = false;
                    System.out.println("Insufficent funds for card " + ja.getNum());
                }
        }else if(cardN == jl.getNum()){
            creds = jl.getCred() - 5;
                if(creds >= 0){
                    jl.setCred(creds);
                }else{
                    enCred = false;
                    System.out.println("Insufficent funds for card " + jl.getNum());
                }
        }else;
    }
    
}
