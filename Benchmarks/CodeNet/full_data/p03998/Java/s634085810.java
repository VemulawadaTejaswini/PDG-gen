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
int[] n=new int[3];
n[0]=Sa.length();
n[1]=Sb.length();
n[2]=Sc.length();
int[] m=new int[3];
m[0]=Sa.length();
m[1]=Sb.length();
m[2]=Sc.length();
    for (int i = 0; i < n[0]; i++) {
        u[0][i]=Sa.charAt(i);
    }
    for (int i = 0; i < n[1]; i++) {
        u[1][i]=Sb.charAt(i);
    }
     for (int i = 0; i < n[2]; i++) {
        u[2][i]=Sc.charAt(i);
    }
n[0]--;
char p=Sa.charAt(0);
while(n[0]>0&&n[1]>0&&n[2]>0){
    int q=Character.getNumericValue(p)-1;
    n[q]--;
    p=u[q][m[q]-n[q]];
}
if(n[0]==0)out.println("A");
if(n[1]==0)out.println("B");
if(n[2]==0)out.println("C");
}}