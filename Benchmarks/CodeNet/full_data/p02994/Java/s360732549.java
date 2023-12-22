import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int l=sc.nextInt();
  System.out.println(n*(n-1)/2+((l>=0)?(n-1)*l:(n+l>=0)?n*l:(n-1)*(l-1)));
}
}
