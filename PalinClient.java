import apcslib.*;
import chn.util.*;
/**
 * Driver for Palindrome
 *
 * Anshul
 * @V1
 */
public class PalinClient
{
    public static void main(String args[])
    {
        //instantiation
        String input;
        int check;
        ConsoleIO keyboard = new ConsoleIO();
        
        //master do while loop
        do
        {   
            //user input
            System.out.print("Enter your string: ");
            input = keyboard.readLine();
            
            //used for failsafe later
            check = input.length();
        
            //constructor constructed later because of arguments necessary
            Palindrome pali = new Palindrome(input);
            
            
            //Failsafe for a Q input
            if(input.equals("Q"))
            {
                System.out.print("You have ended the program\n");
            }
            else
                
                //failsafe for a character being entered
                if (check ==1)
                {
                    System.out.print("This is NOT a palindrome\n");
                }
                else 
                {
                    //checks if palindrome was achieved
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

