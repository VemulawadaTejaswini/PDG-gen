public class Main {
    public static void main(String[] args) {
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String buf = br.readLine();
				StringTokenizer st=new StringTokenizer(buf," ");
				int H = Integer.parseInt(st.nextToken());
				int W = Integer.parseInt(st.nextToken());
				if(W==0 && H==0)	break;
				if(H>=300 && W>=300)	break;;
				for(int i=1;i<=H;i++){
					for(int j=1;j <= W;j++){
						if(i>1 && i<H && j>1 && j<W)	System.out.print(".");
						else
						System.out.print("#");
					}
				System.out.println();
				}
				System.out.println();
			}
		} catch(IOException e) {
    		System.err.println(e);
		}
    }
}
