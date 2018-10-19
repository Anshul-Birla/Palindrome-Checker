
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Palindrome
{
    private String input, reversed;
    
    Palindrome(String str)
    {
        input = lower(str);
        reverse();
    }
    
    private String lower(String str)
    {
        return str.toLowerCase();
    }
    
    public void reverse()
    {
        int strngLength;
        strngLength = input.length();
        String temp ="", pali = "";
        String finalStr = "";
        
        for(int x =0; x<strngLength;x++)
        {
            temp = input.substring(x, x+1);
            if ((temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) || 
                (temp.compareTo("A") >= 0 && temp.compareTo("Z") <= 0) ||
                (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0));
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
    }
    
    
   
}
