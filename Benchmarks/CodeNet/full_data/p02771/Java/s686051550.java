import java.util.*;
import java.lang.*;
class Strings{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();

if(a==b || a==c){
System.out.print("Yes");
}
else if(b==c || b==a){
System.out.print("Yes");
}
else{
System.out.print("No");
}

}
}