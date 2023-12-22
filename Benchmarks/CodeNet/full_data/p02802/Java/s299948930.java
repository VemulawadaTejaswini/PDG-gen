import java.uitl.*;
public class Main{
 public static void main(String[] args) {
   Scannner s = new Scanner(System.in);
   int probs = s.nextInt();
   int verdicts = s.nextInt();
   HashSet<Integer> ac = new HashSet<>();
   //HashSet<Integer> wa = new HashSet<>();
   int correct = 0;
   int penalty = 0;
   for (int i = 0; i < verdicts; i++) {
   	 int n = s.nextInt();
     String str = s.next();
     if(str.equals("AC")) {
       if (!ac.contains(n)) {
       	 correct++;
         ac.add(n);
       }
     } else {
     	if (!ac.contains(n)) {
          penalty++;
        }
     }
   }
   
   System.out.println(correct + " " + penalty);
 } 
}