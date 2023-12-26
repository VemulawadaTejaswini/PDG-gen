class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> moji = new ArrayList<String>();
		String mm = "10";
		while(!mm.equals("0")){
			mm = scan.nextLine();
			moji.add(mm);
		}
		for(int i=0; i<moji.size()-1; i++){
			String henkan = moji.get(i);
			char[] ichimoji = henkan.toCharArray();
			long nagasa = henkan.length();
			long sum = 0;
			for(int ii=0; ii<nagasa; ii++){
					sum += Character.getNumericValue(ichimoji[ii]);
			}
			System.out.println(sum);
		}
	}
}
