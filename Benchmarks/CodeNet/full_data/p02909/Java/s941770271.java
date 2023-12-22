import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String Q[] = {"Sunny","Cloudy","Rainy"};
      int P = Arrays.asList(Q).indexOf(S);
      if(P==2){
        System.out.println("sunny");
      }else{
        System.out.println(Q[P+1]);
      }
    }
}