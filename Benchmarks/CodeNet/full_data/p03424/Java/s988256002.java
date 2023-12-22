import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	private static String FOUR = "Four";
	private static String THREE = "Three";
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String number = sc.nextLine();
			List<String> arares = Arrays.asList(sc.nextLine().split(" "));
			for(String mark : arares) {
				if(isYellow(mark)) {
					System.out.println(FOUR);
					return;
				};
			}
			System.out.println(THREE);
		}
	}
	
	private static boolean isYellow(String mark) {
		return mark.equals(HinaArareKind.YELLOW.getMark());
	}
	
	private enum HinaArareKind {
		PINK("P"),WHITE("W"),GREEN("G"),YELLOW("Y");
		
		private String mark;
		
		private HinaArareKind(String mark) {
			this.mark = mark;
		}
		
		private String getMark() {
			return mark;
		}
	}
}