class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s1 = sc.next();
			int m = Integer.parseInt(s1);
			String s2 = sc.next();
			int f = Integer.parseInt(s2);
			String s3 = sc.next();
			int r = Integer.parseInt(s3);
			if(m == -1 && f == -1){
				if(r == -1){
					break;
				}
			}
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			else if(80 <= m + f){
				System.out.println("A");
			}
			else if(65 <= m + f && m + f < 80){
				System.out.println("B");
			}
			else if(50 <= m + f && m + f < 65){
				System.out.println("C");
			}
			else if(30 <= m + f && m + f < 50){
				if(50 <= r){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else{
				System.out.println("F");
			}
		}
	}
}
