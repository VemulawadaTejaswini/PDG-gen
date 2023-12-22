import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
      	int addNum = sc.nextInt();
      	int end = sc.nextInt();
		int total = 0;
      	for(int i = start; i <= end; i += start) {
        	total += addNum;  
        }
      	System.out.println(total);
    }
}