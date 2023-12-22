import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str=sc.next();
int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0,I=0,J=0,K=0,L=0,M=0,N=0,O=0,P=0,Q=0,R=0,S=0,T=0,U=0,V=0,W=0,X=0,Y=0,Z=0;
int max=0;
for(int ii=0;ii<str.length();ii++){
if(str.charAt(ii)=='a')A+=1;
if(str.charAt(ii)=='b')B+=1;
if(str.charAt(ii)=='c')C+=1;
if(str.charAt(ii)=='d')D+=1;
if(str.charAt(ii)=='e')E+=1;
if(str.charAt(ii)=='f')F+=1;
if(str.charAt(ii)=='g')G+=1;
if(str.charAt(ii)=='h')H+=1;
if(str.charAt(ii)=='i')I+=1;
if(str.charAt(ii)=='j')J+=1;
if(str.charAt(ii)=='k')K+=1;
if(str.charAt(ii)=='l')L+=1;
if(str.charAt(ii)=='m')M+=1;
if(str.charAt(ii)=='n')N+=1;
if(str.charAt(ii)=='o')O+=1;
if(str.charAt(ii)=='p')P+=1;
if(str.charAt(ii)=='q')Q+=1;
if(str.charAt(ii)=='r')R+=1;
if(str.charAt(ii)=='s')S+=1;
if(str.charAt(ii)=='t')T+=1;
if(str.charAt(ii)=='u')U+=1;
if(str.charAt(ii)=='v')V+=1;
if(str.charAt(ii)=='w')W+=1;
if(str.charAt(ii)=='x')X+=1;
if(str.charAt(ii)=='y')Y+=1;
if(str.charAt(ii)=='z')Z+=1;
}
int[] vec={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
Arrays.sort(vec);
max=vec[25];
if(max>(str.length()/2)){
System.out.println(1+" "+str.length());
}else{System.out.println("-1 -1");}
}
}