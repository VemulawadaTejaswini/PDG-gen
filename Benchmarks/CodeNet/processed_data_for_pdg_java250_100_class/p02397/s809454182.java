public class Main {
    public static void main(String[] args) {
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String buf = br.readLine();
				StringTokenizer st=new StringTokenizer(buf," ");
	    		int x = Integer.parseInt(st.nextToken());
	    		int y = Integer.parseInt(st.nextToken());
				if(x == 0 && y==0) break;
				if(x > y){
					int storage=y;
					y=x;
					x=storage;
				}
				System.out.println(x+" "+y);
    		}
    	} catch(IOException e) {
    		System.err.println(e);
		}
    }
}
