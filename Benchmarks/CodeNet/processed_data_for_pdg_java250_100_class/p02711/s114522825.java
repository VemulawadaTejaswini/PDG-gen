public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean found = false;
		Scanner input = new Scanner(System.in);
		String s = input.next();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='7'){
		        System.out.println("Yes");
		        found = true;
		    }
		    if(found){
		        break;
		    }
		}
		if(!found){
		    System.out.println("No");
		}
	}
}
