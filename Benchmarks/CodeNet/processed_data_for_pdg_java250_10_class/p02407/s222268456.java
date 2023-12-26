class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine()); 
    String array[] = br.readLine().split(" "); 
    sb.append(array[n-1]);
    for(int i = n-2; i >= 0; i--) sb.append(" " + array[i]);
    System.out.println(sb);
  }
}
