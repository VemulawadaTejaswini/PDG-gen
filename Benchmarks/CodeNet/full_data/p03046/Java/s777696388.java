import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int m = sc.nextInt();
		int k = sc.nextInt();
		m = 1 << m;
		sc.close();
	
		StringBuilder fragment = new StringBuilder(m >> 1);
		StringBuilder ans;
		if(k>=m)
			ans = fragment.append(-1);
		else if(k==0) {
			for(int i=0;i<m;i++)
				fragment.append(i).append(" ");
			ans = new StringBuilder(fragment).append(fragment.reverse());
		}
		else if(m==2)
			ans = fragment.append(-1);
		else {
			for(int i=0;i<m;i++)
				if(i!=k)
					fragment.append(i).append(" ");
			ans = new StringBuilder(fragment).insert(0," ").insert(0,k).append(k).append(fragment.reverse());
		}
		System.out.print(ans.toString());
	}
}