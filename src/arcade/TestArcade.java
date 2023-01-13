package arcade;

import java.util.Scanner;


public class TestArcade {
   
    private static Cards Jack = new Cards(0, 0, 19478);
    private static Cards Jill = new Cards(0, 0, 20937);
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        TestArcade tA = new TestArcade();
        Terminals ter = new Terminals();
        Games gm = new Games();
        
        System.out.println("How much money to enter for credits for Jack?");
            int amtJack = sc.nextInt();
        System.out.println("How much money to enter for credits for Jill?");
            int amtJill = sc.nextInt();
        
        ter.convMoney(tA, amtJack, Jack.getNum());
        ter.convMoney(tA, amtJill, Jill.getNum());
        ter.checkBal(tA, Jack.getNum());
        ter.checkBal(tA, Jill.getNum());
        
        System.out.println("Enter how many credits to transfer.");
        int tran = sc.nextInt();
        ter.transfBal(tA, "Credits", "Jack", "Jill", tran);
        System.out.println("Transfer Complete");
        System.out.println("");
        ter.checkBal(tA, Jack.getNum());
        ter.checkBal(tA, Jill.getNum());
        System.out.println("");
        gm.RandGame(tA, Jack.getNum());
        gm.RandGame(tA, Jill.getNum());
        System.out.println("");
        gm.RandGame(tA, Jack.getNum());
        gm.RandGame(tA, Jill.getNum());
        System.out.println("");
        gm.RandGame(tA, Jack.getNum());
        gm.RandGame(tA, Jill.getNum());
        System.out.println("");
        ter.checkBal(tA, Jack.getNum());
        System.out.println("");
        ter.checkBal(tA, Jill.getNum());
        System.out.println("");
        System.out.println("Which prize would Jack like to purchase? The options are:");
        System.out.println("Candy Bar - 100 Tickets");
        System.out.println("Teddy Bear - 1,500 Tickets ");
        System.out.println("Xbox One - 12,000 Tickets");
        String choice = sc.nextLine();
        System.out.println("Which prize would Jill like to purchase? The options are:");
        System.out.println("Candy Bar - 100 Tickets");
        System.out.println("Teddy Bear - 1,500 Tickets ");
        System.out.println("Xbox One - 12,000 Tickets");
        String choice2 = sc.nextLine();
        
        
        ter.prizes(tA, choice, Jack.getNum());
        
        ter.prizes(tA, choice2, Jill.getNum());
        
        
    }
    
    
    public Cards getJack(){
        return Jack;
    }
    public Cards getJill(){
        return Jill;
    }
    
}
