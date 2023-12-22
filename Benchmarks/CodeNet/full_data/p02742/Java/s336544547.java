import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long result = 0;
    if(h%2 == 0){
      result = (h/2)*w;
    }
    else{
      for(long i = 1; i <= w; i++){
        if(i%2==1){
          result += (h/2) + 1;
        }
        else{
          result += h/2;
        }
      }
    }
    System.out.println(result);
  }
}