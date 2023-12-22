public class Main {
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				int intA = sc.nextInt();
				int intB = sc.nextInt();
				double dbF; 
				 dbF = (double) intA /  (double) intB;
				 String f2 = String.format("%.5f", dbF);
				System.out.println(intA / intB + " " + intA % intB + " " + f2);
	}
}
