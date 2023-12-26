public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int b = sc.nextInt();
  int c = sc.nextInt();
  int num = b*c%2;
 	if(num == 0){
 		 	 System.out.println("Even");
 	}else{
 		 	 System.out.println("Odd");
 	}
 }
}
