
public class test
{
	
	public static void main(String[] atgs) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		s=s.replace("eraser","");
		s=s.replace("erase","");
		s=s.replace("dreamer","");
		s=s.replace("dream","");
		if(s.equals(""))
			System.out.println("true");
		else System.out.println("false");
	}
}

