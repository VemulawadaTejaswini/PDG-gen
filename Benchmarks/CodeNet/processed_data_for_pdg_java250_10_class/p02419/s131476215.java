class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String x=sc.next();
		String str;
		int count=0;
		for(;!((str=sc.next()).equals("END_OF_TEXT"));){
			if((str.equalsIgnoreCase(x)))count++;
			}sc.close();
			System.out.println(count);
		}
		}
