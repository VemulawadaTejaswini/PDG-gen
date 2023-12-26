   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         int sum = 0;
         for(int x: arr)
            sum += x;
         double lim = 1.0/(4*M);
         lim *= sum;
         int cnt = 0;
         for(int x: arr)
            if(x >= lim)
               cnt++;
         if(cnt >= M)
            System.out.println("Yes");
         else
            System.out.println("No");
      }
   }
