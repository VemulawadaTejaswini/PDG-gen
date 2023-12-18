class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br =
    		new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer st =
    		new StringTokenizer(str, " ");
    String tate = st.nextToken();
    String yoko = st.nextToken();  
    int tateNum = Integer.parseInt(tate);
    int yokoNum = Integer.parseInt(yoko);
    int men = tateNum * yokoNum;
    int enshu = (tateNum + yokoNum)*2;
    System.out.println(men + " " + enshu);
  }
}
