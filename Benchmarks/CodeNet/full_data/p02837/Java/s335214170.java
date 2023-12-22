import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a;
   int[][] clue = new int[n][n];
   for(int i = 0; i < n; i++){
     for(int j = 0; j < n; j++){
       clue[i][j] = -1; 
     }
   }
   for(int i = 0; i < n; i++){
     a = Integer.parseInt(sc.next());
     for(int j = 0; j < a; j++){
       clue[i][Integer.parseInt(sc.next()) - 1] = Integer.parseInt(sc.next());
     }
   }

   int honest;
   int max = 0;
   boolean bl;

   for(int i = 0; i < (1<<n); i++ ){
     bl = true;
     for(int j = 0; j < n; j++){

       honest = ((i >> j) & 1);//no problem
       if(honest == 1){
         for(int k = 0; k < n;k++){
           if(clue[j][k] != -1 && clue[j][k] != ((i >> k) & 1)){
             bl = false;
             break;
           }
         }
       }
       if(!bl){
         break;
       }
    }
    if(!bl){
      continue;
    }
    max = Math.max(max,Integer.bitCount(i));//problem
  }
  System.out.println(max);
}
}

