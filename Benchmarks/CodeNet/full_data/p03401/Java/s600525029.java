import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int st[] = new int[a];
		
		int la[] = new int[a+1];
		int lb[] = new int[a];
		
		for(int i=0;i<a;i++){
			st[i] = sc.nextInt();
		}
		
		la[0] = Math.abs(st[0]);
		la[a] = Math.abs(st[a-1]);
		
		for(int i=1;i<a;i++){
			la[i] = Math.abs(st[i-1]-st[i]);
		}
	
		lb[0] = Math.abs(st[1]);
		lb[a-1] = Math.abs(st[a-2]);
		
		for(int i=1;i<a-1;i++){
			lb[i] = Math.abs(st[i-1]-st[i+1]);
		}
		
		for(int i=0;i<a;i++){
			int sum = 0;
			for(int j=0;j<a+1;j++){
				if(j==i){
					sum += lb[j];
					j++;
				}else{
					sum += la[j];
				}
			}
			System.out.println(sum);
		}
	}
}