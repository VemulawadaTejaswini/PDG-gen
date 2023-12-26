public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strin=br.readLine();
		String[] str=strin.split("");
		for(String i:str){
			if(i.equals(i.toLowerCase())){
				System.out.print(i.toUpperCase());
			}else System.out.print(i.toLowerCase());
		}
		System.out.println();
		}}
