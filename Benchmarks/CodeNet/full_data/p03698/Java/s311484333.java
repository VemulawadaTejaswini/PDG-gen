import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			String result = "yes";
			first : for(int i = 0 ; i < input.length()-1 ; i++){
				for(int j = i+1; j < input.length(); j++){
					if(input.charAt(i) == input.charAt(j)){
						result = "no";
						break first;
					}
				}
			}
			System.out.println(result);
		}catch(Exception e){
			e.getMessage();
		}
	} 
}