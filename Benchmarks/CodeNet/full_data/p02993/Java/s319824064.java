import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if((n%10)==(n/10%10)||(n/10%10)==(n/100%10)||(n/100%10)==(n/1000)){
        System.out.println("Bad");
    }else{
        System.out.println("Good");
    }
  }
}
