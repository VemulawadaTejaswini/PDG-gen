class Main{
  public static void main(String[] args) throws Exception{
    int a = System.in.read();
    int b = System.in.read();
    int c = 0;
    int count = 1;

    do {
      c = System.in.read();
      if(a==b && c!=-1) {
        System.out.println(count+" "+(count+1));
        return;
      }else if(a==c) {
        System.out.println(count+" "+(count+2));
        return;
      }
      count++;
      a = b;
      b = c;
    } while(c != -1);
    System.out.println("-1 -1");
  }
}
