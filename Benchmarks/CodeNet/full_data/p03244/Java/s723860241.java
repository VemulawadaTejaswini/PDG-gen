import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		
		int odd[] = new int[n / 2];
		int even[] = new int[n / 2];
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 1) {
				odd[i / 2] = v[i];
			} else {
				even[i / 2] = v[i];
			}
		}
		Arrays.sort(odd);
		Arrays.sort(even);
		
		int ans_even = 0;
		int ans_odd = 0;
		int temp_even = 0;
		int temp_odd = 0;
		int temp_even_num = 0;
		int temp_odd_num = 0;
		int odd_next = 0;
		int even_next = 0;
		for(int i = 0; i < n / 2; i++) {
			if(temp_even_num != even[i]) {
				//ans_even = Math.max(ans_even, temp_even);
				if(temp_even > ans_even) {
					even_next = ans_even;
					ans_even = temp_even;
				}
				temp_even = 1;
				temp_even_num = even[i];
			} else {
				temp_even++;
				if(i == n / 2 - 1) {
					if(temp_even > ans_even) {
						even_next = ans_even;
						ans_even = temp_even;
					}
				}
			}
			
			if(temp_odd_num != odd[i]) {
				if(temp_odd > ans_odd) {
					odd_next = ans_odd;
					ans_odd = temp_odd;
				}
				//ans_odd = Math.max(ans_odd, temp_odd);
				temp_odd = 1;
				temp_odd_num = odd[i];
			} else {
				temp_odd++;
				if(i == n / 2 - 1) {
					if(temp_odd > ans_odd) {
						odd_next = ans_odd;
						ans_odd = temp_odd;
					}
				}
			}
		}
		if(ans_even != ans_odd) {
			System.out.println(n - ans_even - ans_odd);
		} else {
			if(odd_next > even_next) {
				System.out.println(n - ans_even - odd_next);
			} else {
				System.out.println(n - even_next - ans_odd);
			}
		}
	}
}
