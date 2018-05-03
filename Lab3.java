package parser;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult.*;
import java.util.regex.Pattern;

/**
 *
 * @author Rubel
 */


public class Lab3
{     
      
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = 0,m=0;
        System.out.println("Enter The number of Expression : ");
        n = s.nextInt();
        String[] pattern = new String[n];
        
        for (int i = 0; i < n; i++)
        {

            pattern[i] = s.next();

        }
        
        System.out.println("Enter No of String : ");
        n = s.nextInt();
        String[] exmp = new String[n];
        
        for (int i = 0; i < n; i++)
        {

            exmp[i] = s.next();

        }
        boolean isMatch = Pattern.matches(exmp[0], pattern[0]);
                if (isMatch != true){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
            }
        }
        
      
    }
}
