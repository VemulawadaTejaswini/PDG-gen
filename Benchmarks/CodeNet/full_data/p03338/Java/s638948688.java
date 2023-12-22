import java.util.Scanner;
import java.util.HashSet;

class Main{
   public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     HashSet hs = new HashSet();

     int preCounter = 0;
     int counter = 0;
     int N = sc.nextInt();
     String S = sc.next();


     for(int i = 1; i < N; i++) {
     String front = S.substring(0, i);
     String back = S.substring(i, N);
     front = removeDup(front);
     back = removeDup(back);



     preCounter = 0;


     for(int n = 0; n < front.length(); n++) {

       char frontChar = front.charAt(n);

       for(int t = 0; t < back.length(); t++) {
         char backChar = back.charAt(t);
         if (frontChar == backChar) {
           preCounter++;
         }
       }
     }
     if(counter < preCounter) {
       counter = preCounter;
     }
   }
   System.out.println(counter);
   return;
 }

 private static String removeDup(String str){
   String result = new String("");

   for (int i = 0; i < str.length(); i++) {
       if (!result.contains("" + str.charAt(i))) {
           result += "" + str.charAt(i);
       }
   }

   return result;
  }
}
