
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Palindrome
{
    private String input, reversed,;
    
    Palindrome(String str)
    {
        input = lower(str);
        reversed = input;
    }
    
    public String lower(String str)
    {
        return str.toLowerCase();
    }
    
    public String reverse(String str)
    {
        int strngLength;
        strngLength = input.length();
        String temp = input;
        String finalStr = "";
        
        for(x =0; x<strlength;x++)
        {
            temp = temp.substring(x, x+1);
            if ((temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) || 
                (temp.compareTo("A") >= 0 && temp.compareTo("Z") <= 0) ||
                (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0));
                {
                    finalStr = finalStr + temp;
                }   
    }
    
    
    
}

