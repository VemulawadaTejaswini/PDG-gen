import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String []data=String.valueOf(n).split("");
    boolean p = true;

    if (data[0].equals(data[1])) {
      p=false;
    }
    if (data[1].equals(data[2])) {
      p=false;
    }

    if (data[2].equals(data[3])) {
      p=false;
    }

    if(p){
      System.out.println("Good");
    }else{
    System.out.println("Bad");
    }

  }
}