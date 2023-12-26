public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> strodd = new ArrayList<>();
		ArrayList<String> streve = new ArrayList<>();
		for(int i=1;i<=str.length();i++){
			if( i % 2 == 0){
				streve.add(str.substring(i-1,i));
			}else{
				strodd.add(str.substring(i-1,i));
			}
		}
		boolean abc = true;
		boolean abd = true;
		for(int k = 0;k<strodd.size();k++ ){
			if(!(strodd.get(k).contains("R") || strodd.get(k).contains("U") || strodd.get(k).contains("D"))){
				abc = false;
			}
		}
		for(int l = 0;l<streve.size();l++ ){
			if(!(streve.get(l).contains("L") || streve.get(l).contains("U") || streve.get(l).contains("D"))){
				abd = false;
			}
		}
		if(abc && abd){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
