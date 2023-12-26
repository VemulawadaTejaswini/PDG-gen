public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String r=br.readLine();
		double i=Double.parseDouble(r);
		double p =Math.PI;
		double s=i*i*p;
		double l=p*2*i;
		System.out.printf("%f %f",s,l);
	}
	}
