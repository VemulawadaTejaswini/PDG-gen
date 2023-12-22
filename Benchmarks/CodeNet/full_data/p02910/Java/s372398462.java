import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(i%2 == 0 && c == 'L'){
                System.out.println("No");
                break;
            }
            if(i%2 == 1 && c == 'R'){
                System.out.println("No");
                break;
            }
            if(i == str.length()-1)
                System.out.println("Yes");
        }
    }
}