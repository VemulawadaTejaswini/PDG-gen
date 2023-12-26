public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String a = in.readLine();
		boolean playable = true;
		for(int i = 0; i < a.length(); i++) {
		    if(i%2==0) {
		        if(a.charAt(i)!='R' && a.charAt(i)!='U' && a.charAt(i)!='D'){
		            playable = false;
		            break;
		        }
		    } else {
		        if(a.charAt(i)!='L' && a.charAt(i)!='U' && a.charAt(i)!='D'){
		            playable = false;
		            break;
		        }
		    }
		}
		if(playable) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}
