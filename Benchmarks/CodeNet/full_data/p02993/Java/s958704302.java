import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String []data=String.valueOf(n).split("");
    boolean p = true;

    for (int i = 0 ; i < data.length - 1 ; i++ ) {

      if(data[i].equals(data[i+1])){
        p = false;
      }
    }

    if(p){
      System.out.println("Yes");
    }else{
      System.out.println("Bad");
    }

  }
}