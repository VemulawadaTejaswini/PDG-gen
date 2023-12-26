public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split("/");
		int y = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		if(y>2019 || (y<=2019 && m>4)){
			System.out.println("TBD");
		}else{
			System.out.println("Heisei");
		}
	}
}
