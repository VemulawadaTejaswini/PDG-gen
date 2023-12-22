import java.util.Scanner;
public class Main{
static Scanner scan=new Scanner(System.in);
  static int memo[]=new int[1000000];
  static int fact(int i){
  if(i==0)return 0;
    if(memo[i]!=0)return memo[i];
    int inf=i;
    for(int pow6=1;pow6<i;pow6*=6)inf=Math.min(inf,fact(i-pow6)+1);
    for(int pow9=1;pow9<i;pow9*=9)inf=Math.min(inf,fact(i-pow9)+1);
    return memo[i]=inf;
 }
  public static void main(String[]args){
  int a=scan.nextInt();
    System.out.println(fact(a));
  }
}
