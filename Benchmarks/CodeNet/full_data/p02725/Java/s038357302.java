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
      int dist[] = new int[N];
      int max = 0;
      boolean flag = true;
      for(i = 0; i < N; i++)
      {
        if(A[(i + 1) % N] == 0)
          dist[i] = Math.abs(K - A[i % N]);
        else
        	dist[i] = Math.abs(A[(i + 1) % N] - A[i % N]);
        if(dist[i] > dist[max])
          max = i;
      }
      minDist = 0;
      for(i = 0; i < N; i++)
      {
        if(flag && i == max)
        {
          flag = false;
        }
        else
        //if(!flag || i != max)
          minDist = minDist + dist[i];
      }
      System.out.println(minDist);
    }
}