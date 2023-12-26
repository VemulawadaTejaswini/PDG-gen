public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first_hits = sc.nextInt();
		int first_atk = sc.nextInt();
		int second_hits = sc.nextInt();
		int second_atk = sc.nextInt();
      	while( first_hits>=0 && second_hits>=0 ) {
          second_hits -= first_atk;
          if (second_hits <= 0) {
            break;
          }
		  first_hits -= second_atk;
          if (first_hits <= 0) {
            break;
          }
        }
      	if (second_hits <= 0) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
	}
}
