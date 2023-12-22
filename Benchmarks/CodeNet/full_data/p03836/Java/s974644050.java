import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();
		
		int moveX = tx - sx, moveY = ty - sy;
		StringBuilder forwardX = new StringBuilder();
		StringBuilder forwardY = new StringBuilder();
		StringBuilder backwardX = new StringBuilder();
		StringBuilder backwardY = new StringBuilder();
		while(moveX != 0) {
			if(moveX < 0) {
				forwardX.append('L');
				backwardX.append('R');
				moveX++;
			} else {
				forwardX.append('R');
				backwardX.append('L');
				moveX--;
			}
		}
		while(moveY != 0) {
			if(moveY < 0) {
				forwardY.append('D');
				backwardY.append('U');
				moveY++;
			} else {
				forwardY.append('U');
				backwardY.append('D');
				moveY--;
			}
		}
		
		String firstPath = "", secondPath = "";
		if(!(tx - sx == 0 || ty - sy == 0)) {
			firstPath = forwardX.toString() + forwardY.toString() + backwardX.toString() + backwardY.toString();
			if(tx - sx > 0 && ty - sy > 0)
				secondPath = "D" + forwardX.toString() + "R" + forwardY.toString() + "ULU" + backwardX.toString() + "L" + backwardY.toString() + "DR";
			else if(tx - sx < 0 && ty - sy > 0)
				secondPath = "D" + forwardX.toString() + "L" + forwardY.toString() + "URU" + backwardX.toString() + "R" + backwardY.toString() + "DL";
			else if(tx - sx < 0 && ty - sy < 0)
				secondPath = "U" + forwardX.toString() + "L" + forwardY.toString() + "DRD" + backwardX.toString() + "R" + backwardY.toString() + "UL";
		} else if(tx - sx == 0) {
			firstPath = forwardY.toString() + "R" + backwardY.toString() + "L";
			if(ty - sy > 0)
				secondPath = "L" + forwardY.toString() + "RURR" + backwardY.toString() + "DDLLU";
			else
				secondPath = "L" + forwardY.toString() + "RDRR" + backwardY.toString() + "UULLD";
		} else if(ty - sy == 0) {
			firstPath = forwardX.toString() + "U" + backwardX.toString() + "D";
			if(tx - sx > 0)
				secondPath = "D" + forwardX.toString() + "URUU" + backwardX.toString() + "LLDDR";
			else
				secondPath = "D" + forwardX.toString() + "ULUU" + backwardX.toString() + "RRDDL";
		}
		System.out.println(firstPath + secondPath);
	}
	
}
