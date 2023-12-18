public class Main {
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cube = n * n * n;
        System.out.println(cube);
        scan.close();
	}
}
