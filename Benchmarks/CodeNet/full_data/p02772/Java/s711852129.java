import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
     boolean b = true;
      for(int i=0;i<N;i++){
      int a =sc.nextInt();
      if(a%2==0 && a%3!=0 && a%5!=0){
      b=false;
      }
      }
        System.out.println(b?"APPROVED":"DENIED");
    }
}