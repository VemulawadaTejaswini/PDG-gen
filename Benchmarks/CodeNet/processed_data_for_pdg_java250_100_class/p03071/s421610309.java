public class Main {
	public static void main(final String[] args){
    final Scanner sc = new Scanner(System.in);
    final List<Long> list = new ArrayList<>();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    if(a >= b){
        sum += a;
        a--;
    }else{
        sum += b;
        b--;
    }
    if(a >= b){
        sum += a;
    }else{
        sum += b;
    }
    System.out.println(sum);
}
}
