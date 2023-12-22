import java.util.*;
public class A{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt(),c=s.nextInt(),k=s.nextInt();
		boolean[] t = new boolean[1000001];
		for(int i=0;i<n;i++) t[s.nextInt()]=true;

		int result=0,bus;
		for(int i=0;i<t.length;i++) {
			if(t[i]) {
				result++;
				bus=0;
				for(int j=0;j<=k;j++) {
					if(t[i+j]) {
						bus++;
						t[i+j]=false;
					}
					if(bus==c)
						break;
				}
			}
		}
		System.out.println(result);
	}
}