class Main {
    public static void main(String args[]) throws IOException {
    	InputStreamReader br = new InputStreamReader(System.in);
    	BufferedReader is = new BufferedReader(br);
    	String[] str = is.readLine().split(" ");
    	int a = Integer.parseInt(str[0]);
    	int b = Integer.parseInt(str[1]);
    	System.out.println((a*b) + " " + 2*(a+b));
    }
}
