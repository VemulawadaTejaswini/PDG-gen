import java.util.*;
   public class Main {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int H= sc.nextInt();
				int W = sc.nextInt();
				int s=H*W;
				if(H==1||W==1) {
					System.out.println("1");
				}else if(H%2==0||W%2==0) {
					System.out.println(s/2);
				}else {
					System.out.println(s/2+1);
				}
			}
   }