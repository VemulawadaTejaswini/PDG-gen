class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
	String repeated = new String(new char[99]).replace("\0", "_");
	String v = s + repeated; 
	String x = v.substring(k,k+1); 
	if("_".equals(x)){ 
		System.out.println( s );
	}else{
        String r = s.substring(0,k); 
		System.out.println( r + "..."  );
	}
  }
}
