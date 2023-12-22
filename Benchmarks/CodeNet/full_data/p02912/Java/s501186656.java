import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int m =  Integer.parseInt(sc.next());
		int a[] = new int[n];
		Long ans = 0l;
		int arrayLength = a.length -1;
		
		for (int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);

		int cnt = 0;
		if(n != 1) {
			while(cnt < m) {
				if (a[arrayLength] == 0) {break;}
				a[arrayLength] /= 2;
				cnt++;
	
				if(a[arrayLength] == 0) {
					Arrays.sort(a);
					continue;
				}
				
				if(a[arrayLength]/2 < a[arrayLength -1]) {
					for(int i = arrayLength ; 0 < i ; i--) {
	
						int tmp;
						if(a[arrayLength] < a[arrayLength -1]) {
							tmp = a[arrayLength];
							a[arrayLength] = a[arrayLength -1];
							a[arrayLength -1] = tmp;
	
						}
	
					}
	
				}
			}
		}else {
			while(cnt < m) {
				if(a[0] == 0) {
					break;
				}
				
				a[0] /= 2;
				cnt++;
			}
		}

		for(int value : a) {
			ans += value;

		}

		System.out.println(ans);

	}



}