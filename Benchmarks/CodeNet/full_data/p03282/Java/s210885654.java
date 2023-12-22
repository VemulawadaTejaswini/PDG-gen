import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
String str  = sc.next();
//long K = sc.nextLong();
boolean ended = false;
int count=0;
while(!ended){
char value = str.charAt(count++);
if(value != '1'){
  System.out.println(value);
  ended=true;
}
}
if(!ended){
  System.out.println('1');
}

}
}
