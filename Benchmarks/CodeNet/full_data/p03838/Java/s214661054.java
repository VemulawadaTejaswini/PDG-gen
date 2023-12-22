import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int answer;
		if(x >= 0){
			if(y >= 0){
				if(y >= x){
					answer = y-x;
				}else{
					answer = y+x+1;
				}
			}else{
				if(-y >= x){
					answer = -y-x+1;
				}else{
					answer = 1+x+y;
				}
			}
		}else{
			if(y >= 0){
				if(y >= -x){
					answer = 1+y+x;
				}else{
					answer = y-x;
				}
			}else{
				if(y >= x){
					answer = -x+y;
				}else{
					answer = 2-y+x;
				}
			}
		}

		System.out.println(answer);
	}
}
