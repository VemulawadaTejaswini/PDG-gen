import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int K = sc.nextInt();
     int[][][] table=new int[11][10][10];
     int[][] num = new int[11][10];
     int count=1,sum=0,exp=K;
     int i,j,k;
     long ans=0;
     for(i=1;i<10;i++){
         table[count][i][i]=1;
         num[1][i]=1;
     }
    
       for(count=2;count<11;count++){         
           for(i=0;i<10;i++){
             for(j=0;j<10;j++){
               if(j==0){
                 table[count][i][j]=table[count-1][i][j]+table[count-1][i][j+1];
               }else if(j==9){
                 table[count][i][j]=table[count-1][i][j-1]+table[count-1][i][j];
               }else{
                 table[count][i][j]=table[count-1][i][j-1]+table[count-1][i][j]+table[count-1][i][j+1];
               }
               num[count][i]+=table[count][i][j];
             }
           }
       }
     i=0;j=0;
     while(true){
       if(exp>num[i][j]){
         exp=exp-num[i][j];
         if(j==9){
           i++;
           j=0;
         }else{
           j++;
         }
         
       }else{
         ans += Math.pow(10,i-1)*j;
         if(i==1){
           break;
         }
         i=1;j=1;
       }
     }
     System.out.println(ans);
   }
}