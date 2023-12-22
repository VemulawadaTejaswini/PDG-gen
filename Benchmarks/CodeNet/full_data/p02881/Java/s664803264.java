import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long a=scan.nextLong();
    int num=1;
    long n=num+(a/num), back=1000000000;
    while(true){
      if(a%num==0){
      if(back<n){
        break;
      }
    }
      back=num+(a/num);
      num++;
      n=num+(a/num);
    }
    System.out.println(n-2);
  }
}