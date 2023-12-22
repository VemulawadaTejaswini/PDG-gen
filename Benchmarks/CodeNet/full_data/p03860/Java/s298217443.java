import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    long a=sc.nextInt();
    long b=sc.nextInt();
    long x=sc.nextInt();
    int count=0;
    for(long i=a; i<=b; i++){
       if(i%x==0){
         count++;        
       }
    }
    System.out.println(count); 
  }
}