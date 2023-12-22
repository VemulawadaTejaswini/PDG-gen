import java.util.*;

public class Main {
	int [] dx = {0,1,0,-1};
	int [] dy = {1,0,-1,0};
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			StringBuilder s = new StringBuilder(sc.next());
			int pos = 0;
			
			while(true){
				if(s.length() == pos){
					System.out.println("YES");
					break;
				}
				if(s.toString().startsWith("dream", pos)){
					if(s.toString().startsWith("dreamer", pos)){
						if(s.toString().startsWith("dreamera", pos)){
							pos += 5;
						}
						else{
							pos += 7;
						}
					}
					else{
						pos += 5;
					}
				}
				else if(s.toString().startsWith("erase", pos)){
					if(s.toString().startsWith("eraser",pos)){
						pos += 6;
					}
					else{
						pos += 5;
					}
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
