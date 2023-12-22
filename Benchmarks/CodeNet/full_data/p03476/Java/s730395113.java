import java.util.Scanner;
public class Main{
	
	static int p = 100000;
	
	static boolean prime(int num) {
		if (num < 2) return false;
	    else if (num == 2) return true;
	    else if (num % 2 == 0) return false; 

	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		
		int []a = new int [p+1];
		
		for(int i = 0; i < p ; i++) {
			if(i % 2 == 0) {
				a[i+1] += a[i];
				continue;
			}
			if(prime(i)&&prime((i+1)/2)) {
				a[i]++;
			}
			a[i+1] += a[i];
		}
		int []ans = new int [q];
		for(int j = 0; j < q ; j++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			ans[j] = a[r] - a[l-1];
		}
		
		for(int i = 0 ; i < q ;i++) {
			System.out.println(ans[i]+" ");
		}
	

	}

}
