import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%2 == 0){
			System.out.println(N/2 + " " + N + " " + N);
		} else {
			boolean flag = false;
			for(int n = 1; !flag; n++){
				for(int h = 1; !flag; h++){
					for(int w = 1; w <= 3500; w++){
						if(4*n*h*w == N*(n+h+w)){
							System.out.println(n + " " + h + " " + w);
							flag = true;
							break;
						}
					}
				}
			}
		}
    }
}