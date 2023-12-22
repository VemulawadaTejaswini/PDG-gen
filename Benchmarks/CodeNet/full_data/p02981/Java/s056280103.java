import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int train = sc.nextInt();
        int taxi = sc.nextInt();
        if(train * n <= taxi){
        	System.out.println(train * n);
        }else{
        	System.out.println(taxi);
        }
    }
}