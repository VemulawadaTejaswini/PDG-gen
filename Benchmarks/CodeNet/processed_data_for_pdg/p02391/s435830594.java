class Main{
    public static void main(String[] args) throws IOException{
        int x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
	if(x>y){
        	System.out.println("a > b");
	}else if(x<y){
		System.out.println("a < b");
	}else{
		System.out.println("a == b");
	}
    }
}
