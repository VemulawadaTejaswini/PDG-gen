import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int t = 0;
		int ans = 0;
		int[] hairetu = new int[1000000];
		hairetu[count - 1] = n;
		while(count < 1000000){
			if(hairetu[count-1]%2 == 0){
				hairetu[count] = hairetu[count-1] / 2;
			}
			else{
				hairetu[count] = 3 * hairetu[count-1] + 1;
			}
			count++;
		}
		
		for(i = 0; i < 1000000; i++){
			x = hairetu[i];
			for(j = i + 1; j < 1000000; j++){
				y = hairetu[j];
				if(y == 4){
					t = j;
					j = 0;
					break;
				}
			}
			if(x == 4 && y == 4){
				ans = t;
				break;
			}
		}
		System.out.println(ans + 1);
	}
}