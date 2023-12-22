import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=s.nextInt();
int y=s.nextInt();
int max=x>y?y:x;
int min=x+y-n>0?n-x-y:0;
System.out.println(max+" "+min);
}
}