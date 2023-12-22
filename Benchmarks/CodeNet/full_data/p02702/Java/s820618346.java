import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
   for(int i = 6; i <= 1999999; i++) {
	   String judge = String.valueOf(2019*i);
	   if(s.contains(judge)) {
	   if(s.indexOf(judge)==s.lastIndexOf(judge)) {
		   count++;
	   }
	   else{
		   count +=2;
   }
	   }
   }
   System.out.println(count);
  }
}