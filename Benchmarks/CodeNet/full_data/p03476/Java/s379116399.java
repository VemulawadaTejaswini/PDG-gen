import java.util.Scanner;

public class s3 {
static boolean pd(int t){
for(int i=2;i<=t/2;i++){
if(t%i==0)
	return false;
}	
return true;	
}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i = 0;i<n;i++){
int a,b,ans=0;
a=in.nextInt();
b=in.nextInt();
if(a%2==0){
	for(int j=a+1;j<=b;j+=2){
		if(pd(j)&&pd((j+1)/2)){
			ans++;
		}	
		}
}
else{
for(int j=a;j<=b;j+=2){
if(pd(j)&&pd((j+1)/2)){
	ans++;
}	
}}
System.out.println(ans);
ans=0;
}
}
}
