public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        int syukudai = 0;
      	int asobi = 0;
      for(int i = 0; i < m ; i++){
      	syukudai += sc.nextInt();
      }
      asobi = n - syukudai;
		if(asobi < 0){
			System.out.println(-1);
		}else{
			System.out.println(asobi);
		}
	}
}
