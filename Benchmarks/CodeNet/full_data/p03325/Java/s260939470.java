import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int number[] = new int[n];
        for(int i = 0; i < n; i++){
        	number[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
        	while(number[i] % 2 == 0){
            	number[i] = number[i] / 2;
                count ++;
            }
        }
        System.out.println(count);
     }
}