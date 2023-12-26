class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		String word = "";		
		int[] shuffleBegin = new int[100]; 
		String targetText = "";
		String temp = "";
		String kansei = "";
		while(true){
			temp = scan.next();
			if(temp.equals("-")){
				break;
			}
			targetText = temp;
			char[] targetChar = targetText.toCharArray();
			int targetLength = targetText.length();
			int shuffleTimes = scan.nextInt();
			for(int i=0; i<shuffleTimes; i++){
				shuffleBegin[i] = scan.nextInt();
			}
			for(int i =0;i<shuffleTimes; i++){
				for(int ii=0; ii<(targetLength - shuffleBegin[i]) ; ii++){
					word = word + targetChar[ii + shuffleBegin[i]];
				}
				for(int ii=0; ii<shuffleBegin[i]; ii++){
					word = word + targetChar[ii];
				}
			targetChar = word.toCharArray();
			kansei = word;
			word = "";
			}
			System.out.println(kansei);		
		}
	}
}
