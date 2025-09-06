
/**
 * Write a description of class Lua here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BagOfRiceScript
{
    public BagOfRiceScript(int cost)
    //this is a constructor. it does not have a data type
    //(int cost) is the parameter
    //(int cost) is also where the user inputs the price of a bag of rice
    {
        price = cost;
        //somehow, typing "cost = price;" makes the code print 0 dollars
        //maybe the process is: "price," THIS NEW VARIABLE, stores the value of "cost"
    }

    private int price;
    //this is a field. this exists to establish the data type the variable is
    public void showPrice()
    //this is a method
    {
        System.out.println("A bag of rice costs " + price + " dollars");
    }
    
    public int Silver_Coin;
    public int Gold_Coin;
    public void buyABagOfRice()
    {
        if (Silver_Coin + Gold_Coin > price){
            System.out.println("You have bought a bag of rice for " + price + " dollars.");
        }
        else{
            System.out.println("You do not have enough dollars to buy the item.");
        }
    }
}