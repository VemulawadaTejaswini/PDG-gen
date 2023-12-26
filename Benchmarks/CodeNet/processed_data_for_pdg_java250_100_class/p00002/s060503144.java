public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
		String temp;
		while((temp	=d.readLine())!= null){
			String array[]=temp.split(" ");
			int a=Integer.valueOf(array[0]).intValue(),b=Integer.valueOf(array[1]).intValue();
			String sum =String.valueOf(a+b);
			System.out.println(sum.length());
		}
	}
}
