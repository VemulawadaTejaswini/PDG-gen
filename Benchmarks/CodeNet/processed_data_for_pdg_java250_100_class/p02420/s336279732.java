class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		String mot = "";
		String fro = "";
		String bac = ""; 
		String str;
		String shu = "";
		int count = 0;
		int i = 0;
		int h = 0;
		while(true){
			mot = as.next();
			if(mot.equals("-")){
				break;
			}
			shu = mot;
			count = as.nextInt();
			for(i=0;i<count;i++){
				h = as.nextInt();
				fro = shu.substring(0,h);
				bac = shu.substring(h);
				shu = bac + fro;
			}
			str = shu;
			System.out.println(str);
		}
	}
}
