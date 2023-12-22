import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   String word = sc.next(); 
   int wordlong = sc.nextInt();
   String catchspell = word.substring(wordlong-1,wordlong);
   word = word.replaceAll(catchspell,"100");
   word = word.replaceAll("[a-z]","*");

   word = word.replaceAll("100",catchspell);   
   System.out.print(word);
 }
}