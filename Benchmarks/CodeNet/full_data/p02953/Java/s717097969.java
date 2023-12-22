import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String result = "Yes";
		int n = s.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i]=s.nextInt();
			
		}
		for(int i =0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(h[i]>(h[j]+1)) {
					result="No";
					i = n+1;
					break;
				}
			}
			
		}
		
		System.out.println(result);
		}
		
		
			
		
	}

