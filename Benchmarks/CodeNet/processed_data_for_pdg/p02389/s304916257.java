class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata = s.next();
		int height = Integer.parseInt(indata);
		indata = s.next();
		int waid = Integer.parseInt(indata);
		System.out.println(height*waid +" "+ (height*2+waid*2));
	}
}
