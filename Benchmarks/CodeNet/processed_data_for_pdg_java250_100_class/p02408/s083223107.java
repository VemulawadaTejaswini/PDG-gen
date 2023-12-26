class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String card = sc.next();
		int cn = Integer.parseInt(card);
		ArrayList<Integer> cardS = new ArrayList<Integer>();
		ArrayList<Integer> cardH = new ArrayList<Integer>();
		ArrayList<Integer> cardC = new ArrayList<Integer>();
		ArrayList<Integer> cardD = new ArrayList<Integer>();
		for(int i = 0; i < cn; i++){
			String kc = sc.next();
			String s2 = sc.next();
			int c = Integer.parseInt(s2);
			if(kc.equals("S")){
				cardS.add(c);
			}
			else if(kc.equals("H")){
				cardH.add(c);
			}
			else if(kc.equals("C")){
				cardC.add(c);
			}
			else if(kc.equals("D")){
				cardD.add(c);
			}
		}
		String cs = "S";
		int cb = 0;
		for(int i = 0; i < 4; i++){
			if(cs.equals("S")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardS.size(); k++){
						cb = cardS.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardS.size() - 1 && j != cb){
							System.out.println("S" + " " + j);
						}
					}
				}
				cs = "H";
			}
			else if(cs.equals("H")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardH.size(); k++){
						cb = cardH.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardH.size() - 1 && j != cb){
							System.out.println("H" + " " + j);
						}
					}
				}
				cs = "C";
			}
			else if(cs.equals("C")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardC.size(); k++){
						cb = cardC.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardC.size() - 1 && j != cb){
							System.out.println("C" + " " + j);
						}
					}
				}
				cs = "D";
			}
			else if(cs.equals("D")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardD.size(); k++){
						cb = cardD.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardD.size() - 1 && j != cb){
							System.out.println("D" + " " + j);
						}
					}
				}
			}
		}
	}
}
