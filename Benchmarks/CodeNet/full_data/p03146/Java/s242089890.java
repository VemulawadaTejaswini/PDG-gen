import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      while(true){
        count++;
      	if(n%2==0){
          n/=2;
        }
        else{
          n=3*n+1;
        }
        if(n==4||n==1||n==2)break;
      }
      System.out.println(count+3);
	}
}
