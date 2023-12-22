
import java.util.*; 
  
class GFG 
{ 
     
static int no_of_characters(int M)  
{  
 
    int k = 1;  
    while (true) 
    {  
        if ((int)Math.pow(2, k + 1) - 2 < M)  
            k++;  
        else
            break;  
    }  
    return k;  
}   
static void print_string(int M)  
{  
    int k, num, N;   
    k = no_of_characters(M);   
    N = M - ((int)Math.pow(2, k) - 2);  
    while (k > 0)  
    {  
        num = (int)Math.pow(2, k - 1);  
  
        if (num >= N)  
            System.out.print("A");  
        else 
        {  
            System.out.print( "B");  
            N -= num;  
        }  
        k--;  
    }  
  
    System.out.println();  
}  
public static void main(String args[]) 
{  
  
    int M;  
  
    M = 30;  
    print_string(M);  
  
    M = 55;  
    print_string(M);  
  
    M = 100;  
    print_string(M);  
  
}  
} 
  