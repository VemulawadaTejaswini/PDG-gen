   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         char val = st.nextToken().charAt(0);
         if(val >= 'A' && val <= 'Z')
            System.out.println('A');
         else
            System.out.println('a');
      }
   }
