class Main{
  public static void main(String args[])throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String s = br.readLine();
       int x = Integer.parseInt(s);
       int a = x*x*x;
       System.out.println(a);
    }
}
