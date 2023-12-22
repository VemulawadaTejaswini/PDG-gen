import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  a=sc.nextInt();b=sc.nextInt();int k=sc.nextInt();
  int ans=0;
  for(int i=1;i<1000;i++){
  	if(a%i==0&&b%i==0){
    ans++;
    }
    if(ans==k){System.out.println(i);
              break;
              }
  }
}
}