public class oddprogram {

	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        System.out.println((((n+1)/2))/n);
        if(n%2==0){
            System.out.println(0.5);
        }
        else{
            System.out.println((((n+1)/2))/n);
        }
    }
};
      
		