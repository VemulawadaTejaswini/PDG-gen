public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	char [] ch = scan.next().toCharArray();
    	if(Character.isLowerCase(ch[0])) System.out.println("a");
    	else System.out.println("A");
    } 	
}
