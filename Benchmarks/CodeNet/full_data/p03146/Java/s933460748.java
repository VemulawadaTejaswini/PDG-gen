import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int i = 0;
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
			if(hairetu[i] == 4){
				ans = i;
				break;
			}
			else if(hairetu[i] == 2){
				ans = i;
				break;
			}
			else if(hairetu[i] == 1){
				ans = i;
				break;
			}
			else{
				continue;
			}
		}
		System.out.println(ans + 4);
	}
}
