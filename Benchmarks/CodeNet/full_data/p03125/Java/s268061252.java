class Main {
    public static int canDivide(int a, int b) {
      return (b % a == 0) ? a + b / b - a;
    }
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      String line = scanner.nextLine();
      String values = line.split(" ", 0);
      
      int a = values[0];
      int b = values[1];
      
      System.out.println(canDivide(a, b));
    }
}