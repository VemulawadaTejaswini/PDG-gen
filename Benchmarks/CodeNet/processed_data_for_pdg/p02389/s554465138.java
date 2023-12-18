class Main{
  public static void main(String[] args)throws IOException{
  BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
  String str=mBufferedReader.readLine();
  String[] arr=str.split(" ");
  int a=Integer.parseInt(arr[0]);
  int b=Integer.parseInt(arr[1]);
  System.out.println((a*b)+" "+(a+b)*2);
 }
}
