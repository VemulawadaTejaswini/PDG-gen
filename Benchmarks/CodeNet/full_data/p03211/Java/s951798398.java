import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x[] = {a};
        int z = 0;
        if(x[6] == 0 || x[7] ==0 || x[8] == 0){
        	System.out.println(0);
        }else{
        z = x[6]+x[7]+x[8];
        }
        int r = 753;
        int t = z - r;
        int y = 0;
	    		if(z == 0){
	    			System.out.println(0);
	    		}else if (t == 0){
	    			System.out.println(y);
	    		}else{
	    			System.out.println(t);
	    		}
	    		
	    }
	}
