class Main{
	  static public void main (String test[]) throws IOException {
	  	InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);                    
        String str = br.readLine();                                    
        int x=Integer.parseInt(str);
        System.out.println(x*x*x);
	}
}
