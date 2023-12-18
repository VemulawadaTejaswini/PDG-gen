class Main {
  public static void main(String[] args) {
	  String s = new java.util.Scanner(System.in).nextLine();
	  String[] ss = s.split(" ");
	  int a = Integer.parseInt(ss[0]);
	  int b = Integer.parseInt(ss[1]);
	  if (a < b) { System.out.println("a < b"); }
	  else if (a > b) { System.out.println("a > b"); }
	  else { System.out.println("a == b"); }
  }
}
