class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		String str1 =scan.nextLine();
		String str2;
		int count =0;
		while (true) {
				str2 = scan.nextLine();
				if (str2.equals("END_OF_TEXT")) {
					break;
				}
				Scanner sb = new Scanner(str2);
					while(sb.hasNext()){
					if(sb.next().equalsIgnoreCase(str1)){
						count++;
					}
					}
		}
		System.out.println(count);
 }
}
