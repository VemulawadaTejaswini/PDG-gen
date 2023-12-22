import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = Integer.parseInt(scan.nextLine());
    long tmp = 0;
    long max = 0;
    for(int i = 0;i < 5;i ++){
      tmp = Integer.parseInt(scan.nextLine());
      tmp = (tmp + n - 1) / n;
      if(tmp > max){
        max = tmp;
      }
    }
    System.out.println(max + 4);
  }
}