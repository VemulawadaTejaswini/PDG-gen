import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     int a,b,i,j;
     int ans=0,first=0,last=0,flag=1,count=1;
     int[] p = {1,11,111,1111,11111};
     int[][] num = new int[10][10];
     if(n<10){
       first=n;
       flag=0;
     }
     last = n%10;
     first=n;
     while(flag==1){
       first=first/10;
       count++;
       if(first<10){
         flag=0;
       }
     }
     
     for(i=1;i<10;i++){
      for(j=1;j<10;j++){
        if(i<first){
           if(count>=2){
             num[i][j]=p[count-2];
           }
         }else if(i>first){
           if(count>=3){
             num[i][j]=p[count-3];
           }
         }else if(j>last){
           if(count>=3){
             num[i][j]=p[count-3];
           }
         }else{
           if(count>=2){
             num[i][j]=p[count-2];
           }
         }
         if(i==j&&i<=n){
           num[i][j]++;
         }
      }
     }
     for(i=1;i<10;i++){
       for(j=1;j<10;j++){
         ans+=num[i][j]*num[j][i];
       }
     }
     System.out.println(ans);
   }
}
