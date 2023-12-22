import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] a = new int[N+1];
   int[] b = new int[N];  
   for(int i = 0; i<N+1 ; i++){
   a[i] = sc.nextInt();
   }
   for(int i = 0; i<N ; i++){
   b[i] = sc.nextInt();
   }
   int tmpa1 = 0;
   int tmpa2 = 0;
   int tmpb1 = 0;
   long total = 0;
 for(int i=0;i<N;i++){
   if(i==0){
   tmpa1 = a[i];
   tmpa2 = a[i+1];
   tmpb1 = b[i];
   }else{
   tmpa1 = tmpa2;
   tmpa2 = a[i+1];
   tmpb1 = b[i];
   }
   if(tmpa1 >=tmpb1){
    total+=tmpb1; 
   }else{
     tmpb1 = tmpb1 - tmpa1 ;
     total+=tmpa1 ;
     if(tmpb1>=tmpa2){
      total+=tmpa2;
       tmpa2=0;
     }else{
      total +=tmpb1;
      tmpa2 -=tmpb1;
   }
   }
  }
   System.out.println(total);
 }
}