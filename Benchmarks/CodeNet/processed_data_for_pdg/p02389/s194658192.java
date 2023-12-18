public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
	int s = a * b;
	int l = 2 * (a + b);
        System.out.printf("%d %d%n", s,l);
    }   
}
