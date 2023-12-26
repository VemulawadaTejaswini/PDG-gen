public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] csen = s.toCharArray();
		for(int i = 0; i < csen.length; i++){
			if(Character.isUpperCase(csen[i])){
				csen[i] = Character.toLowerCase(csen[i]);
			}else{
				csen[i]=Character.toUpperCase(csen[i]);
			}
		}
		String ans = "";
		for(int i = 0; i < csen.length; i++){
			ans += csen[i];
		}
		System.out.println(ans);
		sc.close();
	}
}
