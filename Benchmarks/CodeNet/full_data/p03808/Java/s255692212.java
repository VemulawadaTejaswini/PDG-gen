import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sub=0l;
int t1;
int t2;
t1=sc.nextInt();
sub-=t1;
for(int i=0;i<n-1;i++){
t2=sc.nextInt();
sub+=(long)(t2-t1);
t1=t2;
}
if(sub%(long)(2n-2)==0l){System.out.println("YES");}else{System.out.println("NO");}
}
}