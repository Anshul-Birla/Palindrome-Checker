import apcslib.*;
import chn.util.*;
/**
 * Write a description of class PalinClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalinClient
{
    public static void main(String args[])
    {
        String input;
        ConsoleIO keyboard = new ConsoleIO();
        
        System.out.print("Enter your string: ");
        input = keyboard.readLine();
        
        Palindrome pali = new Palindrome(input);
        
        
        
        
    }
}
