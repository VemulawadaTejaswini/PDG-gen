public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=0,h=0;
		int n=Integer.parseInt(br.readLine());			
		for(int i=0;i<n;i++){
			String [] card=br.readLine().split(" ");
			if(card[0].compareToIgnoreCase(card[1])==0){
				t++;h++;
			}else if(card[0].compareToIgnoreCase(card[1])<0){
				h +=3;
			}else t+=3;
		}
		System.out.println(t+" "+h);
	}
}
