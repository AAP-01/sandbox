
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletScript
{
    public WalletScript(int silver_coin, int gold_coin)
    {
        Silver_Coin = silver_coin;
    }
    
    private int Silver_Coin;
    private int Gold_Coin;
    
    public void showWalletContents()
    //this is a method
    {
        if (Silver_Coin > 1){
        System.out.println("You have " + Silver_Coin + " silver coins");
        }
        else{
        System.out.println("You have " + Silver_Coin + " silver coin");
        }
        
        if (Gold_Coin > 1){
        System.out.println("You have " + Gold_Coin + " gold coins");
        }
        else{
        System.out.println("You have " + Gold_Coin + " gold coin");
        }
    }
}
