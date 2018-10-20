
/**
 * Methods for palindrome 
 *
 * @Anshul
 * @V1)
 */
class Palindrome
{
    private String input, reversed;
    private boolean check;
    
    //constructor
    Palindrome(String str)
    {
        input = lower(str);
        reverse();
    }
    
    //just a method to put all strings into lowercase
    private String lower(String str)
    {
        return str.toLowerCase();
    }
    
    //this eliminates all spaces and reverses the inputted string
    private void reverse()
    {
        int strngLength;
        strngLength = input.length();
        String temp ="", pali = "";
        String finalStr = "";
        
        for(int x =0; x<strngLength;x++)
        {
            temp = input.substring(x, x+1);
            if ((temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) || 
                (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0))
                {
                    finalStr = finalStr + temp;
                }   
    }
     strngLength = finalStr.length();
     
     pali = finalStr.substring(strngLength-1);
     for(int x = strngLength-1; x>0;x--)
     {
         temp = finalStr.substring(x-1,x);
         pali = pali+temp;
        
        }
       reversed = pali;
       check(finalStr);
    }
    
    //branching pathway for checks to avoid two returns
    private void check(String str)
    {
        if (reversed.equals(str))
        {
            check = true;
        }
        else 
        {
            check = false;
        }
   
    }
    
    /**
     * Way to check if the string was a palindrome in yuor driver
     * No parameters passed
     * 
     * @return            boolean which indicates if palindrome was achieved 
     */
    public boolean getCheck()
    {
        return check;
    }
}
