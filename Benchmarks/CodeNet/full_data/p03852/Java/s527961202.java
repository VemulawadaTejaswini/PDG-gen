import java.util.Scanner;

class Main{
public static void main(String args[]){
String c;
Scanner scan = new Scanner(System.in);
c = scan.next();
if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")){
System.out.println("vowel");
}else{
System.out.println("consonant");
}
}
}