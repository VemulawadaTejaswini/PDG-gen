import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int N=sc.nextInt();
    String s=sc.next();
    int x=0;
    int max=0;
    for(int i=0; i<N; i++){
     if(s.charAt(i).equals('I')){
      x++;
     }else{
      x--;
     }
      if(max<x){
       max=x;
      }
    }
    System.out.println(max);
  }
}