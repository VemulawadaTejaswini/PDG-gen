import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static int N;
	static int[] monsters;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 monsters = new int[N];
		 Queue<Integer> monstersq = new ArrayDeque<>();


		 for(int i = 0 ; i < N ; i++){
			 monsters[i] = sc.nextInt();
		 }

		 sc.close();
		 Arrays.sort(monsters);

		 for(int i = 0 ; i < N ; i++){
			 monstersq.add(monsters[i]);
		 }
		 monstersq.add(200000000);

		 int min = monstersq.poll();

		 for(int k = 0 ; k < N ; k++){
			 int battle = monstersq.poll();
			 if(battle == 200000000){
				 System.out.println(min);
				 break;
			 }
			 int result = battlegame(battle,min);

			 if(result == 1){
				continue;
			 }else{
				 System.out.println(1);
				 break;
			 }
		 }
	}

	static int battlegame(int a,int b){
		int temp = 0;
		int p = 0;

		if(a%b==0){
			p = 1;
		}else{
			temp = a%b;
			a = b;
			b = temp;
			if(a%b==1){
				p = 2;
			}
			battlegame(a,b);
		}


		return p;
	}
}