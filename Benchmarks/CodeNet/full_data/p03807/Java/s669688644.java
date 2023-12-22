import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
		}
		int l=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==1){
				l++;
			}
		}
		boolean asa = false;
		for(int i=0;i<n;i++){
			if(l%2==1){
				break;
			}else if(l/2==1){
				asa = true;
				break;
			}else{
				l = l/2;
			}
		}
		if(asa){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}