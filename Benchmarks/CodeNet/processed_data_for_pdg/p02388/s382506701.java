public class Main  {
    public static void main (String[] args) {
    		try {
    			int i;
    			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    			i = Integer.parseInt(d.readLine());
    			System.out.println(i*i*i);
    		}catch(IOException e){
    		}
    }
}
