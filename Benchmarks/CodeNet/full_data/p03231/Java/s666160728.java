import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   final int lengthOfS = sc.nextInt();
   final int lengthOfT = sc.nextInt();
   sc.nextLine();
   final String s = sc.nextLine();
   final String t = sc.nextLine();
   
   if(s.charAt(0) != t.charAt(0)){
     System.out.println(-1);
     return;
   }
   
   final int kouyakusuu = soChecker(lengthOfS,lengthOfT);
   
   final int skipS = lengthOfS / kouyakusuu;
   final int skipT = lengthOfT / kouyakusuu;
   for(int i = 1;i<kouyakusuu;i++){
     if(s.charAt(i * skipS) != t.charAt(i * skipT)){
       System.out.println(-1);
       return;
     }
   }
   System.out.println(lengthOfS * lengthOfT / kouyakusuu);
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