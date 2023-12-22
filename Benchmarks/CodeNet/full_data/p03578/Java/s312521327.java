import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		String a = scan.nextLine();
		a = scan.nextLine();
		
		int n1[] = spt(a,n);
		
		n = scan.nextInt();
		a = scan.nextLine();
		a = scan.nextLine();
		
		int n2[] = spt(a,n);
		
		boolean j = false;
		for(int i=0;i<n2.length;i++) {
			boolean k = true;
			
			for(int j1=0;j1<n1.length;j1++) {
				if(n1[j1] == n2[i]) {
					n1[j1] = -1;
					k = false;
					break;
				}
			}
			if(k) {
				j = true;
				break;
			}
			
		}
		
		if(j) {
			System.out.println("NO");
			
		}else {
			System.out.println("YES");
			
		}
		//System.out.println(a.substring(0,a.length()-8));
		
	}
	
	static int[] spt(String a,int n) {
		
		String aa[]=a.split(" ");
		int b[]= new int[n];
		
		for(int i=0;i<aa.length;i++) {
			b[i] = Integer.parseInt(aa[i]);
		}
		
		return b;
	}

}
