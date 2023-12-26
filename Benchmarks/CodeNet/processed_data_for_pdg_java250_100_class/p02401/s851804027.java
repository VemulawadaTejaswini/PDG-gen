class Main
{
  public static void main(String[] args) throws IOException
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      for(;;){
        String str[] = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        if(str[1].equals("?")) break; 
        switch(str[1]){
          case "+":
            System.out.println(a + b);
            break;
          case "-":
            System.out.println(a - b);
            break;
          case "*":
            System.out.println(a * b);
            break;
          case "/":
            System.out.println(a / b);
            break;
          default:
            break;
        }
      }
      br.close();
    }catch(Exception e){
      System.exit(-1);
    }
  }
}
