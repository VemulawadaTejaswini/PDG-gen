import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int lengthOfS = sc.nextInt();
   int lengthOfT = sc.nextInt();
   sc.nextLine();
   String s = sc.nextLine();
   String t = sc.nextLine();
   
   if(s.charAt(0) != t.charAt(0)){
     System.out.println(-1);
     return;
   }
   
   int kouyakusuu = soChecker(lengthOfS,lengthOfT);
   
   if(kouyakusuu == 1){
     System.out.println(lengthOfS * lengthOfT);
   }else{
     final int skipS = lengthOfS / kouyakusuu;
     final int skipT = lengthOfT / kouyakusuu;
     int goal = 1;
     while(goal < kouyakusuu){
       if(s.charAt(goal * skipS) == t.charAt(goal * skipT)){
         goal ++;
         continue;
       }else{
         System.out.println(-1);
         return;
       }
     }
     System.out.println(lengthOfS * lengthOfT / kouyakusuu);
   }
 }
  
  public static int soChecker(int a,int b){
    int x = Math.max(a,b);
    int y = Math.min(a,b);
    int tmp;
    while ((tmp = x % y) != 0) {
        x = y;
        y = tmp;
    }
    return y;
  }
}