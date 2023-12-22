import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
 int a=scan.nextInt();
  int b=scan.nextInt();
  int c=scan.nextInt();
  int d[]=new int[a];
  for(int i=0;i<a;i++)d[i]-=c;
  for(int i=0;i<c;i++){
  int x=scan.nextInt();
  d[x-1]++;
  }
  for(int i=0;i<a;i++){
  if(d[i]>-1*b){System.out.println("Yes");}
  else{System.out.println("No");}
  }
}
}
