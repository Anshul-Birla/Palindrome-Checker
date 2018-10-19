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
        int check;
        ConsoleIO keyboard = new ConsoleIO();
        
        do
        {   
            System.out.print("Enter your string: ");
            input = keyboard.readLine();
            check = input.length();
        
            Palindrome pali = new Palindrome(input);
            
            if(input.equals("Q"))
            {
                System.out.print("You have ended the program\n");
            }
            else
                if (check ==1)
                {
                    System.out.print("This is NOT a palindrome\n");
                }
                else 
                {
                    if (pali.getCheck())
                    {
                        System.out.print("Yes, this is a palindrome\n");
                    }
                        else 
                           {
                              System.out.print("No, this is not a palindrome\n");
                            }
                }     
           
    }while (!(input.equals("Q")));
    }
}

