class Main
{
  public static void main(String[] args) throws IOException
  {
    int x;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    x=Integer.parseInt(br.readLine());
    System.out.println(x*x*x);
  }
}
