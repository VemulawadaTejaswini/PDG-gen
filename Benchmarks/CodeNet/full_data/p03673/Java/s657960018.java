import java.util.*;
public class Main{
public static void main(String[] args){
float n;
int i,j;
Scanner sc=new Scanner(System.in);
n=sc.nextFloat();
int[] a=new int[(int)n];
int[] b=new int[(int)n];
String rtn="";
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
j=(int)n;
for(i=0;i<n/2;i++){
b[i]=j;
j-=2;
}
j=(j==-1)?2:1;
for(;i<n;i++){
b[i]=j;
j+=2;
}
for(i=0;i<n;i++){
rtn+=a[b[i]-1];
if(i!=n-1)rtn+=" ";
}
System.out.println(rtn);
}
}