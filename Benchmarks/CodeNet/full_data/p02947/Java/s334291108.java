import java.util.Arrays;
import java.util.Scanner;
class Test {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String[] moji = new String[n];
   for(int i = 0; i < n; i++){
     moji[i] = sc.next();
   }
   int[][] koike = new int[n][26];
   for(int i = 0; i < n; i++){
     for(char c1 : moji[i].toCharArray()){
      koike[i][c1-97]++;
     }
   } 
   int a = 0;
   for(int i = 0; i < n; i++){
     for(int j = i + 1; j < n; j++){
       if(Arrays.equals(koike[i], koike[j])){
         a++;
       }
     }
   }
   System.out.println(a);
  }
}