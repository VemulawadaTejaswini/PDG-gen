import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static void judge(String a, String b){
    if(a.equals(b)){
      System.out.println("Bad");
      System.exit(0);
    }
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;


    String[] s = sc.next().split("");
    //System.out.println(StringTolist(s));
    for(int i=0; i<s.length-1;i++){
      judge(s[i],s[i+1]);
    }

     System.out.println("Good");
   

  }
}