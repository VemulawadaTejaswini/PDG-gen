import java.util.Scanner;

public class Beginning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in,"UTF-8");
		int n[] = {1,9,7,4};

		String[] inp = new String[4];

		for(int i=0;i<4;i++) {
			inp[i] = sc.next();
		}

		int cont=0;

		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(n[i] == Integer.parseInt(inp[j])) cont++;
			}
		}

		if(cont == 4) {
			System.out.print("YES");

		}
		else if (cont != 4)
		{
			System.out.print("NO");
		}
		sc.close();
	}

}