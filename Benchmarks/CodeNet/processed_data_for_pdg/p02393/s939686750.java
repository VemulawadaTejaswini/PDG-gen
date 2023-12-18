class Main{
  public static void main(String[] args) {
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    try{
      String[] str = br.readLine().split(" ");
      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);
      int c = Integer.parseInt(str[2]);
      int s = 0;
      if(a > b){
        s = a;
        a = b;
        b = s;
      }
      if(b > c){
        s = b;
        b = c;
        c = s;
      }
      if(a > b){
        s = a;
        a = b;
        b = s;
      }
      System.out.println(a+" "+b+" "+c);
    }
    catch(IOException e) {
            e.printStackTrace();
    }
  }
}
