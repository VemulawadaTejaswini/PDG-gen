import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
int a=x/500;
int b=x%500;
int c=b/5;

System.out.println(a*1000+c*5);


}
}