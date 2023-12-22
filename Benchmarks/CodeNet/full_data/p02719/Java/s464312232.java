import java.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		long number = Long.parseLong(sc.next());
      	long constNum = Long.parseLong(sc.next());
      	long answer=number%constNum;
      	while(true){
        	long afterNum=Math.abs(answer-constNum);
          	if(answer<=afterNum){
              	break;
            }
          	answer=afterNum;
        }
      System.out.println(answer);
    }
}