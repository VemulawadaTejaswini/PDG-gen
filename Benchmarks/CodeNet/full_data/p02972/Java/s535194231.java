import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		int pos;
      
		if (n % 2 == 0)pos = n / 2;
	    else pos = n / 2 + 1;
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if (i > pos)b[i] = a[i];
		}
		int cnt=0;
		for (int i = pos; i >=1; i--) {
			int ballCnt=0;
			for (int j = i; j <=pos; j+=i)ballCnt+=b[j];
			if(ballCnt%2!=a[i]) {
				b[i]=1;
				cnt++;
			}
		}
		System.out.println(cnt);
		for(int i=0;i<n;i++) {
			if(b[i]==1)System.out.println(i);
        }
    }
}