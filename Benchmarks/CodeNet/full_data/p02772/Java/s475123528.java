import java.util.*;
public class Main {
	public static void main(String[] args){
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j = 0 ;j<i ;j++){
			int a = sc.nextInt();
			if(a%2 == 0){
				if(a%3 == 0 || a%5 == 0){
				}else{
					flag = 1;
				}
			}
		}
		if(flag == 0){
				System.out.println("APPROVED");
			}else{
				System.out.println("DENIED");
			}
	}
}