import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
boolean yes = false;
for(int i=1;i<=9;i++){
for(int j=i;j<=9;j++){
if(i*j == N) yes= true;
}
}
String ans = yes ? "Yes" : "No";

System.out.println(ans);

} 
}