class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      String str[] = br.readLine().split(" ");
      int height = Integer.parseInt(str[0]);
      int width = Integer.parseInt(str[1]);
      if(height == 0 && width == 0) break;
      if(height < 3 && width > 100) break;
      for(int i = 0; i < height; i++){ 
        for(int j = 0; j < width; j++){ 
          if(i == 0 || i == height-1){
            System.out.print("#");
          }else {
            if(j == 0 || j== width-1)
              System.out.print("#");
            else
              System.out.print(".");
          }
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}
