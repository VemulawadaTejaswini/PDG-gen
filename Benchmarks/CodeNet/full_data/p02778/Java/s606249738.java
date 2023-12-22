import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String s=scan.next();

String[] t=s.split("");
for(int i=0;i<t.length;i++){
    t[i]="x";
}
String u=String.join("",t);
System.out.println(u);
}
}
