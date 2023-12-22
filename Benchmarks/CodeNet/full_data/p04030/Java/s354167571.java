import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>textArray=new ArrayList<String>();
		int backPoint = 1;
		for(int i=0;i<10;i++){
			String text = sc.next();
			if(text.equals("B") && textArray.size()!=0){
				textArray.remove(textArray.size()-1);
				backPoint += 1;
			}else{
				textArray.add(text);
			}
			System.out.println(textArray);
		}
	}
}