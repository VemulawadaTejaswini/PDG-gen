import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int S=0,temp=N;
for(int i=0;i<String.valueOf(N).length();i++){
S+=temp%10;
temp=N/10;
}
if(N%S==0){System.out.println("Yes");}else{System.out.println("No");}
}
}