import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int nn=scan.nextInt();
int kk=scan.nextInt();
  
int na=Math.max(a,b);
int nb=Math.min(a,b);

int sum=0;
int i=0;
for(i=0;i<na;i++){
  sum=sum+nb*Math.pow(10,i);
}
  
System.out.println(sum);
}
}