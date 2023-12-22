import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  long time=n-m*100;
  time+=1900*m;
  time*=(int)(Math.pow(2,m));
  System.out.println(time);
    

}
}