   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int M = Integer.parseInt(st.nextToken());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         long sum = 0L;
         for(int x: arr)
            sum += x;
         if(sum > M)
            System.out.println(-1);
         else
            System.out.println(M-sum);
      }
   }
