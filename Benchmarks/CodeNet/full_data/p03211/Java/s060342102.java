class Main{
  public static void main(String[] s) throws Exception{
    char[] x=new char[10];
    int i=0,l=new java.io.InputStreamReader(System.in).read(x,0,10),m=642,a=m+111*'1';
    while(i<l-2)m=Math.min(Math.abs(x[i]*100+x[i+1]*10+x[2+i++]-a),m);
    System.out.println(m);}}
