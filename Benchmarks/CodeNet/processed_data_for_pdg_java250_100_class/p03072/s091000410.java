public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int cnt = 0;
      	int max = 0;
      	for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
          	if(num >= max) {
            	cnt++;
              	max = num;
            }
        }
      	System.out.println(cnt);
    }
}
