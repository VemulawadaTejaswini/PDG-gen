import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)
                sum += 1.0;
        }
        System.out.println(sum / n);
    }
}