import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
            for(int i=2;i<=Math.sqrt(x);i++){
              if(x%i==0){
                x++;
                i=1;
              }
            }

    		System.out.println(x);
    	}
    }