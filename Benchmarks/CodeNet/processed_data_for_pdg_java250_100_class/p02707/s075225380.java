   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N-1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N-1; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         int[] cnt = new int[N+5];
         for(int x: arr)
            cnt[x]++;
         int ans = N;
         for(int i=1; i <= N; i++)
         {
            ans = cnt[i];
            System.out.println(ans);
         }
      }
   }
