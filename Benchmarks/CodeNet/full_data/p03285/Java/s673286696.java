import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
            
    int cou = 0;
      for(int i=0; i<=n; i++) {
    	for(int j=0; j<=n; j++) {
    		if(i*4+j*7==n) {
    	cou++;
    		}
    	}
    }
      if(cou>0){
      System.out.println("Yes");
      }else{
      System.out.println("No");
    }
}
}