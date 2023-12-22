import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int count = 1;
        if(n == 1 || n == 2){
        	System.out.println("4");
            return;
        }
        while(n != 4){
        	if(n % 2 == 0){
            	n = n / 2;
            }else{
            	n = n * 3 + 1;
            }
            count++;
        }
        System.out.println(count + 3);
    }
}