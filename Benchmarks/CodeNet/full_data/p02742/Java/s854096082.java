import java.util.Scanner;
public class Main{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
long int row=scan.nextInt();
long int col=scan.nextInt();
long int pro=row*col;
if (pro%2==0){
  System.out.println(pro/2);
}
else{
  System.out.println((pro/2)+1);
}
}
}
