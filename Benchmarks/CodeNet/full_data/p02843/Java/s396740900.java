import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    
    int a=100;
    int b=101;
    int c=102;
    int d=103;
    int e=104;
    int f=105;
    int count=0;
    for(int h=0;h<=100000;h++){
     for(int i=0;h<=100000;i++){
       for(int j=0;h<=100000;j++){
         for(int k=0;h<=100000;k++){
           for(int l=0;h<=100000;l++){
             for(int n=0;h<=100000;n++){
               
    if(X==a*h+b*i+c*j+d*k+e*l+f*n){
      count=count+1;
    }else if(X!=a*h+b*i+c*j+d*k+e*l+f*n){
     count=count+0;
    }
             }
           }
         }
       }
     }
    }
    System.out.println("count");
  }
}

     