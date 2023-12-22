import java.util.Scanner;

public class Main{
  static String str; 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    str = sc.next();
    if(str=="A"){
      System.out.println(T);
    }
    else if(str=="T"){
		System.out.println(A);
    }
    else if(str=="G"){
      System.out.println(C);
    }
    else {
      System.out.println(G);
    }
  }
}
    