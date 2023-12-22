import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt();
    int c = sc.nextInt(),d = sc.nextInt();
    int train,bus;
    if(a < b){
      train = b;
    }else{
      train = a;
    }
    if(c < d){
      bus = d;
    }else{
      bus = c;
    }
    System.out.println(train + bus);
  }
}
