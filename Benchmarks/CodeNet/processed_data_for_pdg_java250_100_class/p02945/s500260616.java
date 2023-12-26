public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    sum1 = a + b;
    sum2 = a - b;
    sum3 = a * b;
    if(sum1 >= sum2 && sum1 >= sum3){
        System.out.println(sum1);
    }else if(sum2 >= sum1 && sum2 >= sum3){
        System.out.println(sum2);
    }else{
        System.out.println(sum3);
    }
}
}
