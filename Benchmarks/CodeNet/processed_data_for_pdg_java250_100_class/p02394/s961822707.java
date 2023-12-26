public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		 String[] strAry = str.split(" ");
		 int W = Integer.parseInt(strAry[0]);
		 int H = Integer.parseInt(strAry[1]);
		 int x = Integer.parseInt(strAry[2]);
		 int y = Integer.parseInt(strAry[3]);
		 int r = Integer.parseInt(strAry[4]);
		 if(x-r<0 || y-r<0 || x+r>W || y+r>H){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	}
}
