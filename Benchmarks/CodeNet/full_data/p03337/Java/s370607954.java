import java.util.*; 

class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  int a=sc.nextInt();
  int b=sc.nextInt();
  //int c=sc.nextInt();

  int sum=a+b; int sub = a-b; int mul = a*b;
  if(sum>sub && sum>mul) System.out.println(sum);
  if(sub>sum && sub>mul) System.out.println(sub);
  if(mul>sum && mul>sub) System.out.println(mul);
  if(sum==sub && sub==mul) System.out.println(sub);
}
}
