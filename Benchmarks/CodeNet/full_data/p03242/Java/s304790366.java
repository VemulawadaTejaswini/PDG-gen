import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int con = 0;
		int flag = 0;
		int i = 0;
		int num[];
		int ans = 0;
		num = new int[10];
		for(i = 0; i < 10; i++){
			num[i] = con;
			con = con + 111;
		}
		
		i = 0;
		while(i < 9 && flag == 0){
			if(num[i] < n && n <= num[i + 1]){
				ans = num[i + 1];
				flag = 1;
			}
			i++;
		}
		
		
		
		System.out.println(ans);
	}
}
