public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strmoji ;
		int intSuuji ;
		while(true ){
			strmoji = sc.next();
			if(strmoji.contains("-")){
                break;
			}
			intSuuji = sc.nextInt();
			for (int i = 0; i < intSuuji ; i ++){
				int intMawasu = sc.nextInt();
				String strirekae1 = strmoji.substring(0,intMawasu);
                String strirekae2 = strmoji.substring(intMawasu,strmoji.length());
                strmoji= strirekae2+strirekae1;
			}
			System.out.println(strmoji);
		}
	}
}
