import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=1<<s.nextInt(),k=s.nextInt();
		StringJoiner sb = new StringJoiner(" ");

		if(n==2) {
			if(k==0)
				System.out.println("0 0 1 1");
			else
				System.out.println(-1);
			return;
		}

		if(k>=n) {
			System.out.println(-1);
			return;
		}

		for(int i=0;i<n;++i) {
			if(i!=k)
				sb.add(String.valueOf(i));
		}
		sb.add(String.valueOf(k));
		for(int i=n-1;i>=0;--i) {
			if(i!=k)
				sb.add(String.valueOf(i));
		}
		sb.add(String.valueOf(k));

		System.out.println(sb);
	}
}