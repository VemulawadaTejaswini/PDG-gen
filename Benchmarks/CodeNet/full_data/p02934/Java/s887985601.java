import java.util.*;
import java.lang.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	double num = 0.0;
      	int child = 1;
     	int mom = 1;
     	for(int i = 0; i < a; i++){
          num += 1.0/sc.nextInt();
        }
        System.out.println(1.0/num);
    }
}