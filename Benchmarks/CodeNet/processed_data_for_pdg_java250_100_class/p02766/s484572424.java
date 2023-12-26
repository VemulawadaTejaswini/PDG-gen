public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int r = sc.nextInt();
    long r2 = r;
    int count = 1;
    boolean a = true;
    while(a==true){
        if(n >= r2){
            count++;
        }else{
            a = false;
        }
        r2 = r2 * r;
    }
    System.out.println(count);
    }
}
