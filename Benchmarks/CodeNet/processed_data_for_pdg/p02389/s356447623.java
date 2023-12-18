public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
	    String s[]=str.split(" ");
	    int i1=Integer.parseInt(s[0]);
	    int i2=Integer.parseInt(s[1]);
	    int ss=i1*i2;
            System.out.println(ss+" "+(i1*2+i2*2));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
