import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
String ans="";
//int[] a=new int[n];
if((n%7)%4==0||(n%4)%7==0||n%4==0||n%7==0){ans="Yes";}else{ans="No";}
System.out.println(ans);
}}