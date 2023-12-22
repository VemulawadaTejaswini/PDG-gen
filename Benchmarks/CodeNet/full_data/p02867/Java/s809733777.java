import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> Ai = new ArrayList<Integer>();
		ArrayList<Integer> Bi = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 0;
		while(N!=i) {
			i++;
			Ai.add(sc.nextInt());
		}
		i=0;
		while(N!=i) {
			i++;
			Bi.add(sc.nextInt());
		}
		sc.close();
		i = 0;
		int tmp1,tmp2,nb;
		while(N-1!=i) {
			i++;
			nb=1;
			while(nb!=N) {
			if(Ai.get(nb-1)>Ai.get(nb)) {
				tmp1 = Ai.get(nb-1);
				tmp2 =Ai.get(nb);
				Ai.set(nb, tmp1);
				Ai.set(nb-1, tmp2);
			}nb++;
			}
			
		}
		i=0;
		while(N-1!=i) {
			i++;
			nb=1;
			while(nb!=N) {
			if(Bi.get(nb-1)>Bi.get(nb)) {
				tmp1 = Bi.get(nb-1);
				tmp2 =Bi.get(nb);
				Bi.set(nb, tmp1);
				Bi.set(nb-1, tmp2);
			}nb++;
			}
			
		}
		i=0;
		while(N!=i) {
			if(Ai.get(i)>Bi.get(i)) {
				System.out.println("Yes");
              break;
			}
			i++;
		}
      System.out.println("No");
	}
}
