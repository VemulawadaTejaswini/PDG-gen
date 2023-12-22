import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int goal = sc.nextInt();
        int num1 = 1;
        int num2 = goal;
      
      	for(int i = 1; i < goal/1; i++){
        	if(goal % i == 0){
            	num1 = i;
                num2 = goal / i;
            }
		}
        System.out.println(num1 + num2 - 2);
     }
}