import java.util.Scanner;
public class Main {
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String checker = "abcdefghijklmnopqrstuvwxyz";
      int leng = checker.length();
      String answer="None";

      String checks[] = new String[leng];
      for(int i=0;i<leng;i++){
         checks[i] = checker.substring(i,i+1);
      }
      
      for(int i=0;i<leng;i++){
         if(s.indexOf(checks[i])==-1){

            answer = checks[i];
            break;
         }else{
            continue;
         }
      }
      System.out.println(answer);
}
}