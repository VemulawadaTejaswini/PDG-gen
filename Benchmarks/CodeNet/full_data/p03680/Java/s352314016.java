import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int []po=new int[n];
  boolean b=true;
  for(int i=0;i<n;i++){
  	po[i]=sc.nextInt();
    if(po[i]==i+1){b=false;break;}
  }
  if(!b){
  	System.out.println(-1);
  }
  else{
    b=false;
    int num=0;
    int i=0;
    for(;i<n;i++){
    	num=po[num]-1;
      if(num==1){b=true;break;}
    }
    System.out.println(b?i+1:-1);
  
  }
}
}
