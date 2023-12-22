import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      	boolean b = false;
        for(int i=0;i<=9;i++){
          for(int j=i;j<=9;j++){
            if(A==i*j){b=true;}
          }
        }
      	System.out.println((b)?"Yes":"No");
    }
}