public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int n = c.length;
		int score = 0;
		int p = 0;
		
		for(int i=0; i<n; i++){
			if(p>0){
				if(c[i] == 'g'){
					score++;
					p--;
				}else{
					p--;
				}
			}else{
				if(c[i] == 'g'){
					p++;
				}else{
					p++;
					score--;
				}
			}
		}
		System.out.println(score);
	}

}