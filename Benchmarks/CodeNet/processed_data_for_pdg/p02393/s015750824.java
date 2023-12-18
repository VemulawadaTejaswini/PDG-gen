public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
   try{
     String str=mBufferedReader.readLine();
     String[] arr=str.split(" ");
     int a=Integer.parseInt(arr[0]);
     int b=Integer.parseInt(arr[1]);
     int c=Integer.parseInt(arr[2]);
     int x;
     if(a>b){
       x=b;
       b=a;
       a=x;
     }if(b>c){
       x=c;
       c=b;
       b=x;
     }if(a>b){
       x=b;
       b=a;
       a=x;
     }
       System.out.println(a+" "+b+" "+c);
    }catch(IOException e){
      System.out.println("Error");
    }
  }
}
