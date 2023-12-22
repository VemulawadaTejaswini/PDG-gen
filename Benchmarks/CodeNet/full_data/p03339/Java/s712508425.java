import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] vec=new int[N];
String S=sc.next();
int WL,ER,min1;
min1=N-1;
String S1 = null,S2;
for(int i=0;i<N;i++)
S1=S.substring(0,N/2);
S2=S.substring(N/2, N);
String S3=S1.replaceAll("E","");
String S4=S2.replaceAll("W","");
if(S3.length()>S4.length()){
for(int i=0;i<N/2;i++){
S1=S.substring(0,i);
S3=S1.replaceAll("E","");
S2=S.substring(i+1, N);
S4=S2.replaceAll("W","");
min1=Math.min(S3.length()+S4.length(), min1);
}}else{
for(int i=N/2;i<N;i++){
S1=S.substring(0,i);
S3=S1.replaceAll("E","");
S2=S.substring(i+1, N);
S4=S2.replaceAll("W","");
min1=Math.min(S3.length()+S4.length(), min1);
}

}

System.out.println(min1);
}
}
