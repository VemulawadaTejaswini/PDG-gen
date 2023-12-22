import java.util.Scanner;
public class Main {

    static int countDivisors(int n)
    {
    	int count=0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i) {
                	if(i%2!=0)
                		count++;
                }
                    
      
                else {
                	if (i%2!=0) count++;
                	if ((n/i)%2!=0) count++;
                } 
                    
            }
        }
        return count;
    }
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int count=0;
		if (A==105) System.out.println(1);
		else if(A>105) {
			while(A>105) {
				if(countDivisors(A)==8) {
					count++;
				}
				A--;
			}
			System.out.println(count+1);
		}
		else System.out.println(0);
		
	}

}
