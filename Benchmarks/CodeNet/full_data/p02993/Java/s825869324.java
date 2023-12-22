import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String []data=String.valueOf(n).split("");

    if (data[0].equals(data[1]) || data[1].equals(data[2]) || data[2].equals(data[3]) ) {
      System.out.println("Bad");
    }else{
      System.out.println("Yes");
    }

  }
}
