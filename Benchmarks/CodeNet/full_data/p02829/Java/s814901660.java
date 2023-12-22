import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int  A = sc.nextInt();
      int B = sc.nextInt();
      if(A==1&&B==2||A==2&&B==1){
        System.out.println("3");
      }else if(A==2&&B==3||A==3&&B==2){
        System.out.println("1");
      }else if(A==3&&B==1||A==1&&B==3){
        System.out.println("2");
      }
    }
}