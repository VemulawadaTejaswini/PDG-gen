class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i=1;
		while(true){
        	String x=br.readLine();
        	if(x.equals("0")) break;
        	sb.append("Case "+i+": "+x+"\n");
        	if(i%2000==0){
        		System.out.print(sb.toString());
        		sb.setLength(0);
        	}
    		i++;
        }
		System.out.print(sb.toString());
	}
}
