import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
long x=sc.nextLong();
long ans=(long)(x/11l);
if(x-11l*ans>6l)ans++;
ans++;
System.out.println(ans);
}
}