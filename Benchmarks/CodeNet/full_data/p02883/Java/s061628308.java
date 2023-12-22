import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int d1[] = new int[n1];
		int d2[] = new int[n1];

		for(int i = 0; i < n1; i++){
			d1[i] = sc.nextInt();	
		}

		for(int j = 0; j < n1; j++){
			d2[j] = sc.nextInt();	
		}
	
		Arrays.sort(d1);
		Arrays.sort(d2);
		int t1 = 0;
		int m1 = 0;
		for(int k = 0; k < n2; k++){
			t1 = 0;
			m1 = 0;
			for (int l= 0; l < n1; l++){
				if(m1 < d1[l] * d2[n1 - l - 1]){
					m1 = d1[l] * d2[n1 - l - 1];
					t1 = l;
				}
			}
			d1[t1]--;
			Arrays.sort(d1);
			if (d1[n1 - 1] == 0){
				break;
			}
		}

		int m2 = 0;
		for (int m = 0; m < n1; m++){
			if (m2 < d1[m] * d2[n1 - m - 1]){
				m2 = d1[m] * d2[n1 - m - 1];
			}
		}

		System.out.println(m2);	
	}
}