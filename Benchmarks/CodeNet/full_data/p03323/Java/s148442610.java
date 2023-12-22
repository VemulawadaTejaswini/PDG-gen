import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int d = sc.nextInt();
    	int n = sc.nextInt();
    	int reg =1;
    	for(int i=0;i<d;i++){
    		reg*=100;
    	}
    	System.out.println(reg*n);
    }
}
