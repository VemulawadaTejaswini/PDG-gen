class Main{
   public static void main(String[] args)throws IOException{
      int x;
         BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
         x = Integer.parseInt(d.readLine());
         System.out.println(x*x*x);
   }
}
