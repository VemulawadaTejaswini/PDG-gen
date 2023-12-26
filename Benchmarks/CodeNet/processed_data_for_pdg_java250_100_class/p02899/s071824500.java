class Main {
        public static void main(String arts[]) {
											 int N;
											 Scanner sc = new Scanner(System.in);
											 N = sc.nextInt();
											 int a[] = new int[N]; 
											 for(int i = 0 ; i < N ; i++ ){
															 a[i] = sc.nextInt();
											 }
											 int b[] = new int[N];
											 for(int i = 0 ; i < N ; i++){
															 b[a[i]-1] = i + 1;
											 }
											 for(int i = 0 ; i <N; i ++){
															 System.out.print(b[i]+" ");
											 }
											 System.out.println();
               }
		}
