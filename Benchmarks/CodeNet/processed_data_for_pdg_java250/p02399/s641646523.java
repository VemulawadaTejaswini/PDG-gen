public class Main {
    public static void main (String args[]){
    	Scanner str =new Scanner(System.in);
    	StringBuffer buf =new StringBuffer();
    	    int a = str.nextInt();
    	    int b = str.nextInt();
    	    int d = a/b;
    	    int r = a%b;
    	    double f =(double) a/b;
    	    buf.append(d).append(" ").append(r).append(" ").append(String.format("%6.5f",f));
    	System.out.println(buf);
    }
}
