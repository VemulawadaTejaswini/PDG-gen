
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        int [][] array = new int [n][m];
        
        for(int i = 0 ; i < n ; i++)
        {
            String s = input.next();
            
            for(int j = 0 ; j < m ; j++)
            {
                char c = s.charAt(j);
                
                if(c == '#')
                    array[i][j] = -1;
            }
        }
        
        array[0][0] = 1;
        
        int mod = (int)1e9 + 7;
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(array[i][j] == -1)
                    continue;
                
                if(isValid(i-1) && array[i-1][j] != -1)
                    array[i][j] = ((array[i][j] % mod) + (array[i-1][j] % mod)) % mod;
                
                
                if(isValid(j-1) && array[i][j-1] != -1)
                    array[i][j] = ((array[i][j] % mod) + (array[i][j-1] % mod)) % mod;    
                 
            }
        }
        
        System.out.println(array[n-1][m-1]);
    }
    
    public static boolean isValid(int num)
    {
        if(num < 0)
            return false;
        else
            return true;
    }
    
}
