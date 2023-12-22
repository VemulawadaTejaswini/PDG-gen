public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String temp = sc.next();
			if(temp.equals("0")){
				break;
			}
			int result = 0;
			char temp_2[] = temp.toCharArray();
			for(char c:temp_2){
				result += Character.getNumericValue(c);
			}
			System.out.println(result);
		}
	}
}
