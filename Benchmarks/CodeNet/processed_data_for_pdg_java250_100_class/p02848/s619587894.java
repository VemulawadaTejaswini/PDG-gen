public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
		String y = s.next();
        StringBuilder sb = new StringBuilder(); 
        for (int i=0; i<y.length();i++){
          if ((y.charAt(i) + x) > 90) {
            sb.append((char) (y.charAt(i) + x -26)); 
          } else {
            sb.append((char) (y.charAt(i) + x)); 
          }
        }
        System.out.println(sb); 
	} 
}
