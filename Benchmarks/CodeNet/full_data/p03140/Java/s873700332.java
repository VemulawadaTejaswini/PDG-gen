import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
          
          Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			
			int r = 0;
			
			for (int i = 0; i < n ; i++) {
				String a2 = a.substring(i, i+1);
				String b2 = b.substring(i, i+1);
				String c2 = c.substring(i, i+1);
				
				r = r + replace(a2, b2, c2);
			}
			System.out.println(r);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println(replace("1", "2", "3"));
		
	}
	
	private static int replace(String a, String b ,String c){
		int result = 0;
		
		if(!a.equals(b)){
			result++;
		}
		if(!b.equals(c)){
			result++;
		}
		if(!c.equals(a)){
			result++;
		}
		
		if(result>0){
			result--;
		}
		
		return result;
	}

}