import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int G=sc.nextInt();
		int[][] prob=new int[D][2];
		int[] fills=new int[D];

		for(int i=0; i<D; i++) {
			prob[i][0]=sc.nextInt();
			prob[i][1]=sc.nextInt();
		}

		int rui=1;
		for(int i=0; i<D; i++) {
			rui*=2;
		}

		int tmp=0;
		int select=0;
		int p_sum=0;
		int solves=Integer.MAX_VALUE;
		int tmp_solve=0;
		for(int i=0; i<rui; i++) {
			tmp=i;
			for(int j=0; j<D; j++) {
				fills[j]=tmp%2;
				tmp/=2;
			}
			for(int j=0; j<D; j++) {
				select=j;
				p_sum=0;
				tmp_solve=0;
				for(int k=0; k<D; k++) {
					if(k!=select) {
						p_sum+=fills[k]*((k+1)*100*prob[k][0]+prob[k][1]);
						tmp_solve+=prob[k][0]*fills[k];
					}
				}
				if(p_sum>=G) {
					solves=Math.min(solves, tmp_solve);
				}
				else if(p_sum<G) {
					int ps=(G-p_sum+(select+1)*100-1)/((select+1)*100);
					if(ps>prob[select][0]) {
						continue;
					}
					else if(ps==prob[select][0]) {
						p_sum+=ps*100*(select+1)+prob[select][1];
						tmp_solve+=prob[select][0];
					}
					else if(ps<prob[select][0]) {
						p_sum+=ps*100*(select+1);
						tmp_solve+=ps;
					}
					if(p_sum>=G) {
						solves=Math.min(solves, tmp_solve);
					}
				}
			}
		}
		System.out.println(solves);
	}
}