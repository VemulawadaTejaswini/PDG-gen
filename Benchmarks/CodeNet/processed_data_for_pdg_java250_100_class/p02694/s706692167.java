   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         long N = Long.parseLong(infile.readLine());
         long bruh = 100;
         int res = 0;
         while(bruh < N)
         {
            bruh += bruh/100;
            res++;
         }
         System.out.println(res);
      }
   }
