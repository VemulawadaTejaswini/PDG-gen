import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long answer = 0;
		while(A%2 == 1){
            answer^=(A-1);
            A--;
        }
        while((B-A)%4!=3){
            answer^=(B+1);
            B++;
        }
        System.out.println(answer);
    }

}