import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
  int sum=0;
  int i=0;
  if(a<b){
    for(i=0;i<b;i++){
      sum=sum+a*(int)Math.pow(10,i);
    }
  }else{
    for(i=0;i<a;i++){
      sum=sum+b*(int)Math.pow(10,i);
    }
  }
  
System.out.println(sum);
}
}