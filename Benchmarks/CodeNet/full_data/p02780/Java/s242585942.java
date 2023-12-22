import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      float[] p= new float[n];
      float max = 0;
      float sum = 0;
      for(int i = 0;i<n;i++){
        p[i] = (sc.nextInt())/2.0f + 0.5f;
      }
      for(int i = 0;i<n - k;i++){
          for(int j = i;j<i+k;j++){
            sum+=p[j];
          }
          if(sum>max){
            max=sum;
            sum=0;            
          }
      }
      System.out.println(sum);
    }
}