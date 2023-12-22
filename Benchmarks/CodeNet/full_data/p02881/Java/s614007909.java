import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int goal = sc.nextInt();
      	int i = 1;
      	int num1 = 1;
      	int num2 = goal;
      	int stack_num2;
      
      	while(i < num2){
          if(goal % i == 0) {
            num1 = i;
            num2 = goal/num1;
          }
          i++;
        }
 		
      	System.out.println(num1 + num2 - 2);
        
	}
}
