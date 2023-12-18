class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int a, b, c, 一, ニ, 三;
		a = sin.nextInt();
		b = sin.nextInt();
		c = sin.nextInt();
		if(a < b){
			if(b < c){
				一 = a;
				ニ = b;
				三 = c;
			}else if(a < c){
				一 = a;
				ニ = c;
				三 = b;
			}else{
				一 = c;
				ニ = a;
				三 = b;
			}
		}else{ 
			if(c < b){
				一 = c;
				ニ = b;
				三 = a;
			}else if(c < a){ 
				一 = b;
				ニ = c;
				三 = a;
			}else{ 
				一 = b;
				ニ = a;
				三 = c;
			}
		}
		System.out.println(一 +" "+ ニ +" "+ 三);
	}
}
