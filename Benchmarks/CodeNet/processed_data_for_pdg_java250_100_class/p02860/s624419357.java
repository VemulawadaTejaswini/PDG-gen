public class Main {
	public static void main(String[] args) {
        boolean flag = false;
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
        String  y = sc.next();
        if (x % 2 == 0) {
          String firstHalf = y.substring( 0,  y.length()/2);
          String secondHalf = y.substring( y.length()/2,  y.length());
          if (firstHalf.equals(secondHalf)) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        } else {
          System.out.println("No");
        }
	} 
}
