import java.util.Scanner;
public class Main{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
int row=scan.nextInt();
int col=scan.nextInt();
int pro=row*col;
if (pro%2==0){
  System.out.println(pro/2);
}
else{
  System.out.println((pro+1)/2);
}
}
