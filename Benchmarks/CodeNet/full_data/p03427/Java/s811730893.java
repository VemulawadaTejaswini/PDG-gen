import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String N =sc.next();
    int n =N.length();
    String M[]=N.split("",0);
    int x=0;
    for(int i=0;i<n;i++){
      if(!(M[i].equals("9"))){x=-1;break;}}
    long m =Integer.parseInt(M[0]);
    long ans ;
    if(x==-1){ans=m-1+(n-1)*9;}
    else{ans =m+(n-1)*9;}
    System.out.println(ans);
  }
}