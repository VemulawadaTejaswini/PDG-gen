import java.util.*;
public class Main {
  	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int house = sc.nextInt();
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      if(b - a <= 0){
        System.out.println(0);
      } else {
        System.out.println(b - a);
      }	
    }
}