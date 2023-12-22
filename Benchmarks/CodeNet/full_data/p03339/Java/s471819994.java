import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] vec=new int[N];
String S=sc.next();
int WL,ER;
for(int i=0;i<N;i++){
WL=0;ER=0;
for(int t=0;t<i;t++){
if(S.charAt(t)=='W')WL++;
}
for(int r=(i+1);r<N;r++){
if(S.charAt(r)=='E')ER++;
}
vec[i]=(WL+ER);
}
Arrays.sort(vec);
System.out.println(vec[0]);
}
}