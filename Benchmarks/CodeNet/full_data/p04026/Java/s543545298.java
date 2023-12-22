class Main{
  public static void main(String[] args) throws Exception{
    int a = System.in.read();
    int b = System.in.read();
    int count = 0;

    while(b != -1) {
      if(a==b) {
        System.out.println(count+" "+(count+1));
        return;
      }
      count++;
      a = b;
      b = System.in.read();
    }
    System.out.println("-1 -1");
  }
}
