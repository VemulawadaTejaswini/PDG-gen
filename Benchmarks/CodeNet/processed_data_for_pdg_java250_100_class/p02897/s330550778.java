public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 0;
    if(a % 2 == 0){
        b = a/2;
    }else{
        b = a/2 + 1;
    }
    System.out.println((double)b/a);
	}
}
