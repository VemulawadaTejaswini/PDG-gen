import java.util.*;
public class Main {
	
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int array[] = new int[5];
			int plus = 0;
			int max = 0;
			for(int  i = 0;i<array.length;i++) {
				array[i] = sc.nextInt();
				if(array[i]%10!=0) {
					plus =10 - array[i]%10;
					array[i]+=plus;
					max = Math.max(max, plus);
				}
			}
			System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]-max);
			sc.close();
	}
	public static void main(String[] args) {
		solve();
	}

}
