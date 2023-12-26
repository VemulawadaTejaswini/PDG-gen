public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
      	int as = sc.nextInt();
      	int sum = 0;
      	for(int i = 0 ; i<as; i++) 
        {
          sum+= sc.nextInt();
        }
      	if(total-sum >= 0){
         System.out.println(total-sum); 
        }
      	else{
         System.out.println(-1); 
        }
	}
}
