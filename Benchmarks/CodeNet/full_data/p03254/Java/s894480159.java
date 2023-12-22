import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int kids[];
		kids = new int [N];
		
		int i = 0;
		
		for(i = 0; i < N; i++){
			kids[i]= sc.nextInt();
		}
		
		Arrays.sort(kids);
		int num = N;
		i = 0;
		
		int candy = X;
		
		while(candy > 0 && num >= 0){
			num = num - 1;
			candy = candy - kids[i];
			
			if(candy < 0){
				break;
			}else{
				i++;
			}
		}
		
		
		
		
		
		System.out.println(i);
	}
}