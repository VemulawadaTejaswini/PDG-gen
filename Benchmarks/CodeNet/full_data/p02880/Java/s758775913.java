import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
for(int i=0;i<=9;i++){
for(int j=0;j<=9;j++){
if(i*j==N){
System.out.println("Yes");
}
}
}
}
}
