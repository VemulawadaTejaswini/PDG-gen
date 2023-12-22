import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),q=sc.nextInt();
		char[] str = sc.next().toCharArray();
		int[] flag = new int[n];
		int count = 0;
		for(int i=1;i<n;i++) {
			if(str[i-1]=='A' &&  str[i]=='C') count++;
			flag[i]=count;
		}
		for(int i=0;i<q;i++) {
			int l = sc.nextInt()-1, r = sc.nextInt()-1, ans;
			ans=flag[r]-flag[l];
			//if(r<n-1 && str[r]=='A' && str[r+1]=='C') ans--;
          	//if(str[l]=='A') ans++;
			System.out.println(ans);
		}
	}
}