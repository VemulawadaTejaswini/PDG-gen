import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String S =sc.next();
    int s =S.length();
    String P[] =S.split("");
    String Q[] ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String R[] =new String[s+1];
    R[0]="";
    for(int i=0;i<s;i++){
      for(int j=0;j<26;j++){
      if(P[i].equals(Q[j])){R[i+1]=R[i]+Q[(j+N)%26];}}}
    
    System.out.println(R[s]);
  }
}