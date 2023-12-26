public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int result[] = new int[26];
		for (int i = 0; i < 26; i++){
			result[i] = 0;
		}
		while (sc.hasNext() == true){
			String temp = sc.nextLine().toLowerCase();
			for (int i = 0; i < temp.length(); i++){
				int ac = temp.charAt(i) - 97;
				if (ac < 0 || 26 <= ac){
					continue;
				}
				result[ac]++;
			}
		}
		char[] value = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < 26; i++){
			System.out.println(value[i] + " : " + result[i]);
		}
	}
}
