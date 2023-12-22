import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      if(S.contains("Sunny")){
        System.out.println("Cloudy");
      }else if(S.contains("Cloudy")){
        System.out.println("Rainy");
      }else if(S.contains("Rainy")){
        System.out.println("Sunny");
      }
    }
}