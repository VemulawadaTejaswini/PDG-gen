import java.util.*;
import java.lang.*;
class Strings{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
int a=5;
int b=6;
int c=5;

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