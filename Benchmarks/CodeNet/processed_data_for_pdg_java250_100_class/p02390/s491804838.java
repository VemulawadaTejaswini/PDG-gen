public class Main {
	public static void main(String[] args)throws IOException{
		String a;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		a=buf.readLine();
		int x=Integer.parseInt(a);
		System.out.print(x/3600);
		System.out.print(":");
		int y;
		int g=x;
		g=g/60;
		while(true){
			if(g>=60){
				g-=60;
			}else{
				break;
			}
		}
		System.out.print(g);
		System.out.print(":");
		while(true){
			if(x>=60){
				x-=60;
			}else{
				break;
			}
		}
		System.out.println(x);
	}
}
