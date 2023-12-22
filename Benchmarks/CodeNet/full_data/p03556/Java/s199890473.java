import java.util.Scanner;

public class Main {
	  public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int hoge = 1;
            for(int i = 0; i < Math.pow(n,0.5); i++){
                if(i * i <= n){
                    hoge = i;
                }
            }            
            System.out.println(hoge);
            sc.close();
		  }
}