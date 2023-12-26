public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for(int i = 1; i < 10 ; i++){
        if(n % i == 0){
            if(n / i <= 9){
                count++;
            }
        }
    }
    if(count == 0){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
	}
}
