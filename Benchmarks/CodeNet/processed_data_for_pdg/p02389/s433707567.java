class Main{		
	public static void main(String[ ] args)throws java.lang.Exception {	
		Scanner reader = new Scanner(System.in);
		int iLength = reader.nextInt();
		int iSide = reader.nextInt();
		reader.close();
		int iMenseki = iLength * iSide;
		int iMawari = (iLength + iSide) * 2;
		System.out.println(iMenseki + " " + iMawari);
	}	
}		
