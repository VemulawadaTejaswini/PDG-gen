public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] str = n.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int w;
        if(a>b){
        	w = a;
        	a = b;
        	b = w;
        }
        if(b>c){
        	w = b;
        	b = c;
        	c = w;
        }
        if(a>b){
        	w = a;
        	a = b;
        	b = w;
        }
        System.out.println(a+" "+b+" "+c);
	}
}
