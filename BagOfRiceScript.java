
/**
 * Write a description of class Lua here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BagOfRiceScript
{
    private int price;
    //this is a field. this exists to establish the data type the variable is
    
    public BagOfRiceScript(int cost)
    //this is a constructor. it does not have a data type
    //(int cost) is the parameter
    //(int cost) is also where the user inputs the price of a bag or rice
    {
        price = cost;
        //somehow, typing "cost = price;" makes the code print 0 dollars
    }
    
    public void showPrice()
    {
        System.out.println("A bag of rice costs " + price + " dollars");
    }
    
    private int silver_coin;
    private int gold_coin;
}