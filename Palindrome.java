
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Palindrome
{
    String input, reversed;
    
    Palindrome(String str)
    {
        input = str;
        
    }
    
    public String lower()
    {
        reversed = input.toLowerCase();
        return reversed;
    }
    
}
