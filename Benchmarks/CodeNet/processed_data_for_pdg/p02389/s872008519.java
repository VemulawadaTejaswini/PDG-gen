class Main{
  public static void main(String args[]){
	  Scanner s = new Scanner(System.in);
	  int[] string = new int[2];
	  string[0] = s.nextInt();
	  string[1] = s.nextInt();
	  System.out.print(string[0] * string[1] + " ");
	  System.out.println((string[0] * 2) + (string[1] * 2));
	  s.close();
  }
}
