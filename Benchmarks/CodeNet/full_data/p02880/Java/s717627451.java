import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
  		if(N>81){
          System.out.println("No");
      	  return;
        }
		for(int i=1; i < 10; i++){
          if((N%i==0)&&((N/i)<10)){
          	System.out.println("Yes");
          	return;
          }
        }
		System.out.println("No");
      	return;
	}
}
