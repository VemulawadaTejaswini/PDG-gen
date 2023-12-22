import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int A=sc.nextInt();
int num=0;

for(int n=0;n<M;n++){
int ans=A+n;
num=num+ans;
}
int days=N-num;

if(days>=0){
System.out.println(days);
}else if(days<0){
System.out.println(-1);
}
}
}