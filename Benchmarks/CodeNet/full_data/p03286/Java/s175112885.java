import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String output="";
  int i=1;
  while(n!=0){
    if(n%Math.pow(2,i)!=0){
      output="1"+output;
      n-=(int)Math.pow(2,i-1)*(i%2==1?1:-1);
    }else{
      output="0"+output;
    }
    i++;
  }
    System.out.println(output);
  }
}