import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
String ans;
  if(b-a<=0) {
    ans="delicious";
  }
  else if(b-a-x>0) {
    ans="dangerous";	
  }
  else {
	ans="safe";  
  }
       

System.out.println(ans);
 }
}
  