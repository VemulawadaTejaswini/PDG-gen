import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int v[]=new int[n];
		for(int i=0; i<n; i++) {
				v[i]=sc.nextInt();
		}

		int e[] = new int[250000];
		int o[] = new int[250000];
		//0:key 1:value
		int emax1[] = {0,0};
		int emax2[] = {0,0};
		int omax1[] = {0,0};
		int omax2[] = {0,0};

		for(int i=0; i<n; i++) {
			if(i%2==0) {
				e[v[i]]++;
				if(emax1[1] < e[v[i]]) {
					emax1[0]=v[i];
					emax1[1]=e[v[i]];
				} else 	if(emax2[1] < e[v[i]]) {
					emax2[0]=v[i];
					emax2[1]=e[v[i]];
				}
			} else {
				o[v[i]]++;
				if(omax1[1] < o[v[i]]) {
					omax1[0]=v[i];
					omax1[1]=o[v[i]];
				} else if(omax2[1] < o[v[i]]) {
					omax2[0]=v[i];
					omax2[1]=o[v[i]];
				}
			}
		}
		int ans = 0;
		if(emax1[0]!=omax1[0]) {
			ans = n-emax1[1]-omax1[1];
		}else {
			ans = Math.min(n-emax1[1]-omax2[1], n-emax2[1]-omax1[1]);
		}
		System.out.println(ans);
		sc.close();
	}
}
