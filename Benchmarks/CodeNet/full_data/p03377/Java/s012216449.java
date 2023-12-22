import java.util.Scanner;
public class prob_a{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int A,B,X;
A=sc.nextInt();
B=sc.nextInt();
X=sc.nextInt();
int sum=A+B;
if(sum>=X){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}