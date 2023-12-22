import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();

int a=n/k;
int b=n%k;
int c=Math.min(b,k-b);


System.out.println(c);


}
}