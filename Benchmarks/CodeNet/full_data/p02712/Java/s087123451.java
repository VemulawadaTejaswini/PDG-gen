import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long n;
    n = sc.nextInt();
    long x = 0;
    for(int i = 1 ; i < n ; i++){
      if(i%3 == 0 || i%5 == 0){continue;}else{
        x += i;
      }
    }
    System.out.println(x);
  }
}
