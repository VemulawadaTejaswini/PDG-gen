import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int data[] = new int[n+1];
      int count = 0;
      data[0]= 1000000;



      for (int i = 1;i<n+1 ;i++ ) {
        data[i] = sc.nextInt();
      }
      int max = data[1];

      for(int i = 1;i<n+1;i++){
        boolean pre = false;
        if (max<data[i]) {
          count++;
          pre = true;
        }
        for(int j = i-1;j>0;j--){
          if(pre==false){
            if(data[i]>data[j]){
              count++;
              pre = true;
              max = Math.max(max,data[i]);
          }else{
            continue;
          }
          }
          if (pre) {
            break;
          }
      }
    }

System.out.println(n-count);


  }
}
