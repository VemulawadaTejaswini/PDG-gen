import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int K = sc.nextInt();
     String str = sc.next();
     String[] s = new String[N];
     String ans ="";
     String[] strArraySub = str.split("");
     String A = "A", B = "B",C = "C";
     String[] strArray = new String[str.length()];

     for (int i = 1; i < strArraySub.length; i++) {
      strArray[i - 1] = strArraySub[i];
     }
          if(strArraySub[K-1].equals(A)){
            strArraySub[K-1] ="a";
         }else if(strArraySub[K-1].equals(B)){
            strArraySub[K-1] ="b";
         }else if(strArraySub[K-1].equals(C)){
            strArraySub[K-1] = "c";
         }else{
           strArraySub[K-1] = "e";
         }

     for(int j =0;j<N;j++){
       ans += strArraySub[j];
     }
     System.out.println(ans);
   }
}
