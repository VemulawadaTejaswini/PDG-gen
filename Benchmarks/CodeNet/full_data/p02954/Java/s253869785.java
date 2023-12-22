import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();

      s = s + "R";

      int lng = s.length();

      char r = 'R';
      char l = 'L';

      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      int[] num = new int[lng];
      for(int i=0;i<lng;i++){
        num[i] = 1;
      }


      int flag=0;
      int cnt=0;

      for(int i=0;i<lng-1;i++){
        num[i] = 0;
        if(i==lng-2){
          cnt = i - flag+1;
          for(int j=flag;j<=i;j++){
            if(c[j]==r && c[j+1]==l){
              if(cnt%2==0){
                num[j]=cnt/2;
                num[j+1]=cnt/2;
                cnt=0;
                flag=i;
              }
              else if(i-j-1<(cnt-2)/2){
                num[j]=(cnt+1)/2;
                num[j+1]=(cnt-1)/2;
                cnt=0;
                flag=i;
              }
              else{
                num[j]=(cnt-1)/2;
                num[j+1]=(cnt+1)/2;
                cnt=0;
                flag=i;
              }
            }
          }
        }
        else if(c[i]==l && c[i+1]==r){
          cnt = i - flag +1;
          for(int j=flag;j<=i;j++){
            if(c[j]==r && c[j+1]==l){
              if(cnt%2==0){
                num[j]=cnt/2;
                num[j+1]=cnt/2;
                cnt=0;
                flag=i+1;
              }
              else if(i-j-1<(cnt-2)/2){
                num[j]=(cnt+1)/2;
                num[j+1]=(cnt-1)/2;
                cnt=0;
                flag=i+1;
              }
              else{
                num[j]=(cnt-1)/2;
                num[j+1]=(cnt+1)/2;
                cnt=0;
                flag=i+1;
              }
            }
          }
      }
    }




      for(int i=0;i<lng-1;i++){
        System.out.print(num[i]+" ");
      }



    }
}
