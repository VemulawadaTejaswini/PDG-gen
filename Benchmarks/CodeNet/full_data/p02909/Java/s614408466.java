import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] w = {"Sunny","Cloudy","Rainy"};
    for(int i = 0;i<2;i++){
      if(s.compareTo(w[i])==0){
        System.out.println(w[i+1]);
      }
    }
    if(s.compareTo(w[2])==0){
      System.out.println(w[0]);
    }
  }
}
