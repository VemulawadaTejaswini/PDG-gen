import java.util.*;
 
public class Main {
	public static void main(String[] args) {
      	int res = 0;
		Scanner sc = new Scanner(System.in);
		String input_line = sc.nextLine();
        int num = Integer.parseInt(input_line);
      
        if(num ==1){
          res = 1;
        }
        else if(num % 2 == 0){
          res = num / 2;
        }
        else{
          res = (int)num / 2 + 1;
        }
        System.out.println(res);
    }
}