import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
String S=sc.next();
String S1,S2;
int WL,ER;
int min=N-1;
for(int i=0;i<N;i++){
S1=S.substring(0,i+1);
String S3=S1.replaceAll("E","");
S2=S.substring(i+1, N);
String S4=S2.replaceAll("W","");
min=Math.min(S3.length()+S4.length(),min);
}
System.out.println(min);
}
}
