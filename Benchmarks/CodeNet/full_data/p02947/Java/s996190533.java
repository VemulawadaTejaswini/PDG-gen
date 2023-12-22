import java.util.*;
import java.util.Arrays;

class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int F = 0;
String S[]=new String[a];
for(int i=0;i<a;i++){
String s = sc.next();
char[] c = s.toCharArray();
Arrays.sort(c);
S[i] = new String(c);
}
for(int i=0;i<a;i++){
for(int j=i+1;j<a;j++){
if(S[i]==S[j]){
F++;
}
}
}
System.out.println(F);
}}
