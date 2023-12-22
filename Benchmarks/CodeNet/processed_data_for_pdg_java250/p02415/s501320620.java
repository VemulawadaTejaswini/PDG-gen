public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split("");
		for (int i = 0; i < strArray.length; i++) {
			if(Character.isUpperCase(str.charAt(i))){
				strArray[i] = strArray[i].toLowerCase();
			}else{
				strArray[i] = strArray[i].toUpperCase();
			}
		    System.out.print(strArray[i]);
		}
		System.out.println();
	}
}
