class Main
{
  public static void main(String[] args) throws IOException
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      double rad = Double.parseDouble(str); 
      double space = rad * rad * Math.PI; 
      double cirf = 2 * rad * Math.PI; 
      System.out.printf("%.6f %.6f", space, cirf); 
      System.out.println("");
    } catch (Exception e){ 
      System.exit(-1);
    }
  }
}
