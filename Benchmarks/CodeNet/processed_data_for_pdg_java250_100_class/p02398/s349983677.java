public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		 String[] strAry = str.split(" ");
		 int a = Integer.parseInt(strAry[0]);
		 int b = Integer.parseInt(strAry[1]);
		 int c = Integer.parseInt(strAry[2]);
		 int i = 0;
		 int count = 0;
			 for(i=a; i<=b; i++){
				 if( c % i == 0){count = count +1;}
			 }
		 System.out.println(count);
    }
}
