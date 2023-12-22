import java.util.*;
public class Main 
{
	
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
  
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
		// numOfMon: number of the monsters
		int numOfMon = sc.nextInt();

		int map[] = new int[numOfMon];

		for (int i=0; i<numOfMon; i++)
		{
			int Ai = sc.nextInt();
			map[i] = Ai;
		}
 
        System.out.println(findGCD(map, numOfMon));   
	}
}