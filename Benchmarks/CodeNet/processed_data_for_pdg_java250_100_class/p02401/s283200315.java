public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[];
        String str;
        String op;
        int ans = 0;
        while(true){
        	str = br.readLine();
            st = str.split(" ");
        	int a = Integer.parseInt(st[0]);
        	op = st[1];
        	int b = Integer.parseInt(st[2]);
        	if(op.equals("?")){break;}
        	if(op.equals("+")){
        		ans = a + b;
        	}else if(op.equals("-")){
        		ans = a - b;
        	}else if(op.equals("*")){
        		ans = a * b;
        	}else if(op.equals("/")){
        		ans = a / b;
        	}
        	System.out.println(ans);
        }
    }
}
