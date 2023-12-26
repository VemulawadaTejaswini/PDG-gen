public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String[] a=s.split(" ");
		for(int i=a.length;i>0;i--){
			System.out.print(a[i-1]);
			if(i!=1)System.out.print(" ");
		}br.close();System.out.println();
}}
