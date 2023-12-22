import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s=="Sunny"){
      System.out.println("Cloudy");
    }else if(s == "Cloudy"){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }
  }
}
