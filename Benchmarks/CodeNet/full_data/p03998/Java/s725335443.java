import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);

String Sa=sc.next();
String Sb=sc.next();
String Sc=sc.next();
Sa=Sa.replaceAll("a", "1");
Sa=Sa.replaceAll("b", "2");
Sa=Sa.replaceAll("c", "3");
Sb=Sb.replaceAll("a", "1");
Sb=Sb.replaceAll("b", "2");
Sb=Sb.replaceAll("c", "3");
Sc=Sc.replaceAll("a", "1");
Sc=Sc.replaceAll("b", "2");
Sc=Sc.replaceAll("c", "3");
char[][] u=new char[3][100];
int a=Sa.length();
int b=Sb.length();
int c=Sc.length();
    for (int i = 0; i < a; i++) {
        u[0][i]=Sa.charAt(i);
    }
    for (int i = 0; i < b; i++) {
        u[1][i]=Sb.charAt(i);
    }
     for (int i = 0; i < c; i++) {
        u[2][i]=Sc.charAt(i);
    }
char p=Sa.charAt(0);
while(a>0&&b>0&&c>0){
    int q=Character.getNumericValue(p)-1;
    switch (p) {
        case '1':
            a--;
            p=u[q][Sa.length()-a];
            break;
        case '2':
            b--;
            p=u[q][Sb.length()-b];
            break;
        case '3':
            c--;
            p=u[q][Sc.length()-c];
            break;
    }
}
if(a==0)out.println("A");
if(b==0)out.println("B");
if(c==0)out.println("C");
}}