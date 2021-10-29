package fr.itakademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client john = new Client(132, "John", "Doe", 20, 120);
        BankAccount credit = new BankAccount(456, 1337, john);
    }
}
