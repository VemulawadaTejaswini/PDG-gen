import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int time[] = new int[5];
		int min = 9;
		int minN = 0;
		
		for(int i = 0; i < 5; i++){
			time[i] = sc.nextInt();
			int a = time[i] % 10;
			if((a <= min) && (a != 0)){
				min = a;
				minN = i;
			}if(a == 0){
				time[i] -= 10;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 5; i++){
			if(i != minN){
				answer += time[i] / 10 * 10 + 10;
			}else{
				answer += time[i];
			}
		}
		
		System.out.println(answer);
	}
}