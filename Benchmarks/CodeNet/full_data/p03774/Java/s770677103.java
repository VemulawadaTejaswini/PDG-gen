public class Main {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int m = sc.nextInt();
				int a[]=new int[n];
				int b[]=new int[n];
				int c[]=new int[m];
				int d[]=new int[m];
				int e[]=new int[m];
				int min[]=new int[n];
				int minIdx[]=new int[n];
				
				for(int i=0;i<n;i++){
					a[i]=sc.nextInt();
					b[i]=sc.nextInt();
				}
				for(int k=0;k<m;k++){
					c[k]=sc.nextInt();
					d[k]=sc.nextInt();
				}
				
				for(int i=0;i<n;i++){
					for(int k=0;k<m;k++){
						e[k]=Math.abs(a[i]-c[k])+Math.abs(b[i]-d[k]);
					}
					min[i]=e[0];
					for(int k=0;k<m;k++){
						if(min[i]>e[k]){
							min[i]=e[k];
							minIdx[i]=k;
						}
					}
				}
				for(int i=0;i<n;i++){
					System.out.println(minIdx[i]+1);
				}
		}		
	}