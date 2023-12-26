   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int res = N/500;
         res *= 1000;
         int lol = N%500-N%5;
         System.out.println(res+lol);
      }
   }
