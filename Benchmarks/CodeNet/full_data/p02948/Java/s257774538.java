import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] input = new int[n][2];

      for(int i=0;i<n;i++){
        input[i][0] = sc.nextInt();
        input[i][1] = sc.nextInt();
      }

      Arrays.sort(input, (a, b)->a[0]-b[0]);

      int[][] in = new int[n][2];
      for(int i=0;i<n;i++){
        in[i][0] = input[n-i-1][0];
        in[i][1] = input[n-i-1][1];
      }

      int ans = 0;

      if(in[0][0]>=m){
        ans = 0;
      }
else{
/////////////////////////////////////////////////////////////////
for(int i=0;i<m;i++){
  ans += in[i][1];
  for(int j=i;j<m;j++){
    if(in[i][0]==in[j][0]){
      in[j][1] = 0;
    }

  }
}

/////////////////////////////////////////////////////////////////
}

System.out.println(ans);

    }
}
