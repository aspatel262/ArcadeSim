package arcade;



public class Cards {
    private int creditBal;
    private int tickBal;
    private int cardNum;
    
    Cards(int cB, int tB, int cN){
        creditBal = cB;
        tickBal = tB;
        cardNum = cN;
    }
    
    public int getCred(){
        return creditBal;
    }
    public int getTick(){
        return tickBal;
    }
    public int getNum(){
        return cardNum;
    }
    public void setCred(int cred){
        creditBal = cred;
    }
    public void setTick(int tick){
        tickBal = tick;
    }
}
