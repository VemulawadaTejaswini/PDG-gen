import java.util. Scanner; 
 public class double  
{ 
     public static void main(String[] args){
    static int findTrailingZeros(int n)  
    {  
      Scanner scan=new Scanner( System.in);
      int n=scan.nextInt;
        if ((n & 1) == 1)  
            return 0;  
      
        // If n is even  
        else 
        {  
            int ans = 0;  
             int n;
            // Find the trailing zeros  
            // in n/2 factorial  
            n /= 2;  
            while (n != 0) 
            {  
                ans += n / 5;  
                n /= 5;  
            }  
      
            // Return the required answer  
            return ans;  
        }  
    }  
     
        System.out.println(findTrailingZeros(n));  
    }  