import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A=sc.nextInt(),B=sc.nextInt();
int wa=A+B;
int sa=A-B;
int seki=A*B;
int max=0;
if(wa>=seki&&wa>=sa){max=wa;}
if(sa>=wa&&sa>=seki){max=sa;}
if(seki>=wa&&seki>=sa){max=seki;}
System.out.println(max);
}
}