import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a!=b && a!=c && b!=c){
       System.out.println(3);
    }
    if(a!=b && a==c && b==c){
       System.out.println(2);
    }
    if(a==b && a!=c && b==c){
       System.out.println(2);
    }
    if(a==b && a==c&& b!=c){
       System.out.println(2);
    }
    if(a!=b && a!=c && b==c){
       System.out.println(1);
    }
    if(a!=b && a==c && b!=c){
       System.out.println(1);
    }
    if(a==b && a!=c && b!=c){
      System.out.println(1);
    }
  }
}