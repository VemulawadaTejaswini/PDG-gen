public class Main {
    public static void main(String[] args) throws IOException {
	int height;                                         
	int width;                                          
	int area;                                           
        int l;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
        String[] x = buf.split(" ",0);
    	height=Integer.parseInt(x[0]);
    	width=Integer.parseInt(x[1]);
	    area = height*width;
	    l = height + width+height + width;
	    System.out.println(area +" "+ l );
    }
}
