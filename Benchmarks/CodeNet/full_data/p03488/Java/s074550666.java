import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int x = sc.nextInt(), y = sc.nextInt();
		int dir = 1;
		//dir 1 pos x dir 2 neg x dir 3 pos y dir 4 neg y
		
		int cordX = 0, cordY = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'F') {
				if(dir == 1) cordX++;
				if(dir == 2) cordX--;
				if(dir == 3) cordY++;
				if(dir == 4) cordY--;
			}
			
			else {
				if(dir == 1 || dir == 2) {
					if(y > cordY) dir = 3;
					else dir = 4;
				}
				else {
					if(x > cordX) dir = 1;
					else dir = 2;
				}
			}
		}
		
		if(cordX == x && cordY == y) System.out.println("Yes");
		else System.out.println("No");
	}

}
