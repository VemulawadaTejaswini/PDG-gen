import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
  int a=scan.nextInt();
  int min=1145141919;
  int max=0;
  for(int i=0;i<a;i++){
  int b=scan.nextInt();
    if(b>max){
    max=b;
    }
    if(b<min){min=b;}
  }
  System.out.println(max-min);
}
}