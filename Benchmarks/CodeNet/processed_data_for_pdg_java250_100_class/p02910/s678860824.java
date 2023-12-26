class Main {
  public static void main (String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String result = "Yes";
	for (int i = 0; i < s.length(); i++) {
	  if ((i % 2 == 0 && s.charAt(i) == 'L') || (i % 2 == 1 && s.charAt(i) == 'R')) {
	  	result = "No";
	  	break;
	  }
	}
	System.out.println(result);
  }
}
