import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int A=1;A<=9;A++) { 
for(int B=1;B<=9;B++){
if(A*B==n){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
}
}
}
