import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int[] data = new int[1000000];
		data[0] = s;
		int min = 100;

		for (int i = 1;i<1000000 ;i++ ) {
			if (data[i-1]%2==0) {
				data[i]=data[i-1]/2;
			}else{
				data[i]=3*data[i-1]+1;
			}
		}

		for (int i = 0;i<1000000 ;i++ ) {
			for (int j = i+1;j<1000000 ;j++ ) {
				if (data[i]==data[j]) {
					System.out.println(j+1);
					System.exit(0);
				}
			}
		}
		}
}
