import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=0;
int c=1;
int d=1;
int e=1;
int r;
for(int i=1;i<=a;i++){
   for(int j=1;j<=a;j++){
       for(int k=1;k<=a;k++){
while((r=c%d)!=0){
    c=d;
    d=r;
}
while((r=d%e)!=0){
    d=e;
    e=r;
}
b+=e;
c=k;
d=j;
e=i;
    c+=1;
}
       c=1;
    d+=1;
}
    d=1;
    e+=1;
}
System.out.println(b);
}
}