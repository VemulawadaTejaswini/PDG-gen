public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int intArray[] = new int[4];
		for(int i = 0 ;i < 4;i++){
			intArray[i] = a % 10;
			a = a / 10;
		}
		for(int i = 0 ;i < 3;i++){
			if(intArray[i] == intArray[i+ 1]){
				System.out.println("Bad");
				return ;
			}	
		}
		System.out.println("Good");
   		sc.close();
        return ;
    }
}
