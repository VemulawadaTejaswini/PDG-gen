import java.util.*;
public class Main{
public static void main(String[] args){
int a,b,c,rtn;
Scanner sc=new scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b){
if(a>c)rtn=b+c;
else rtn=a+b;
}else{
if(b>c)rtn=a+c;
else rtn=a+b
}
System.out.println(rtn);
}
}