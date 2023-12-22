import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int ans=0;
  for(ans=0;ans<10000;ans++){
  	if(((int)Math.floor(ans*0.08)==n)&&((int)Math.floor(ans*0.1)==m))break;
  }
  System.out.println(ans==10000?-1:ans);
}
}
