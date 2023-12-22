import java.util.*;

public class Main {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    String[] Weather = {"Sunny","Cloudy","Rainy"};
    
    for(int i = 0; i < 3 ; i++) {
      if(Weather[i].equals(s)){
        if(i < 2 ){
          System.out.println(Weather[i + 1]);
        }else{
          System.out.println(Weather[0]);
        }
      }
    }
  }
}


