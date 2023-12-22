import java.util.*;
public class Main
{
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= n; j++) {
        		for (int k = 1; k <= n; k++) {
        			sum += findGCD(new int[] {i, j, k} , 3);
        		}
        	}
        }
        System.out.println(sum);
    }
    
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    // Function to find gcd of array of 
    // numbers 
    static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    } 
}