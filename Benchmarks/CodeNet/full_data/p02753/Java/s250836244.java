import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char c1= sc.nextChar();
char c2= sc.nextChar();
char c3= sc.nextChar();
  
if(c1==c2&&c2==c3){
System.out.println("Yes");
}else{
System.out.println("No");
}
  
}
} 