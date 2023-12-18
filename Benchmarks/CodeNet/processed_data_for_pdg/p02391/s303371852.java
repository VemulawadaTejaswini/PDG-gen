class Main
{
 public static void main(String[] args) throws IOException
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     String[] ab = str.split(" ", 0);
     int a = Integer.parseInt(ab[0]);
     int b = Integer.parseInt(ab[1]);
     if(a<b){
         System.out.println("a < b");
     }else if(a>b){
         System.out.println("a > b");
     }else if(a==b){
         System.out.println("a == b");
 }
}
}
