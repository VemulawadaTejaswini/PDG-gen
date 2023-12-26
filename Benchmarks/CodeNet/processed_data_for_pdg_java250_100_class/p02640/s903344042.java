class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		int intKazu = sc.nextInt();
     	int intAshi = sc.nextInt();
		int OKflag = 0;
        for(int i=0;i<(intKazu+1);i++){
			if ( ((intKazu * 2) + (i *2)) == intAshi ) {
			OKflag = 1;
			}
        }
		if ( OKflag == 1 ) {
	        System.out.println("Yes"); 
		} else {
	        System.out.println("No");
		}
	}
}
