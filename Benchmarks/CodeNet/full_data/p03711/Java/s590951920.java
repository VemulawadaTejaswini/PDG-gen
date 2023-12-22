import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x =sc.nextInt();
int y=sc.nextInt();
String ans;
if(x==2) {
	ans = x==y?"Yes":"No";
}
else if(x==4||x==6||x==9||x==11) {
	ans = (y==4||y==6||y==9||y==11)?"Yes":"No";
}
else {
	ans=(y!=2&&y!=4&&y!=6&&y!=9&&y!=11)?"Yes":"No";
}
System.out.println(ans);
 }
}