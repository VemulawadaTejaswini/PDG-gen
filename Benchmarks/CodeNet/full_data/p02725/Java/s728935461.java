import java.io.*;

class Main{
	public static void main(String []args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int K, N, i, j, minDist = Integer.MAX_VALUE;
      String str = br.readLine();
      
      K = Integer.parseInt(str.substring(0, str.indexOf(" ")));
      N = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
      
      int A[] = new int[N];
      str = br.readLine();
      String s[] = str.split(" ");
      
      for(i = 0; i < s.length; i++)
      {
        A[i] = Integer.parseInt(s[i]);
      }
      
      for(i = 0; i < N; i++)
      {
        int sum = 0;
        for(j = 0; j < N - 1; j++)
        {
          if(A[j + 1] == 0)
          {
            sum = sum + Math.abs(A[j] - K);
          }
          else
       		 sum = sum + Math.abs(A[j + 1] - A[j]); 
        }
        if(sum < minDist)
          minDist = sum;
        int temp = A[0];
        for(j = 0; j < N - 1; j++)
        {
          A[j] = A[j + 1];
        }
        A[j] = temp;
      }
      
      System.out.println(minDist);
    }
}