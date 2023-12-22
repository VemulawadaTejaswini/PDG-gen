public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		
		int ne = k/2;
		int no = k-ne;
 
		System.out.println(ne*no);
}