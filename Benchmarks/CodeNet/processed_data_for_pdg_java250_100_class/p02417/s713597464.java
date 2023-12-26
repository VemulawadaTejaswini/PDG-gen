public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=new String();
		int[] a = new int[26];
		String[] eng = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n"
				      ,"o","p","q","r","s","t","u","v","w","x","y","z"};
		do{
			str = scan.next();
			for(int i=0;i<str.length() ;i++){
				for(int j = 0 ; j < eng.length ;j++ ){
					if( eng[j].equalsIgnoreCase(String.valueOf(str.charAt(i)))){
						a[j]++;
					}
				}
			}
		}while(scan.hasNext());
		for(int j = 0 ; j < eng.length ;j++ ){
			System.out.println(eng[j]+" : "+a[j]);
			}
	}
}
