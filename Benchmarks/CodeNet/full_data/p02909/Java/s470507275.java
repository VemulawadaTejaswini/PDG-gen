import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String A = "Sunny";
        String B = "Cloudy";
        String C = "Rainy";
      String N = "a";
      if(S.equals(B)) N = "Rainy";
      if(S.equals(C)) N = "Sunny";
      if(S.equals(A)) N = "Cloudy";
      
        System.out.println(N);
    }
}