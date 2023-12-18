public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String sdata = sc.nextLine();
		String []svdata = sdata.split(" ");
	    try{
	    	Integer i1data = Integer.parseInt(svdata[0]);
	    	Integer i2data = Integer.parseInt(svdata[1]);
	    	System.out.println(i1data*i2data + " " + ((i1data*2) + (i2data*2)));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
