import java.util.*;

import javax.swing.*;
import java.text.*;

public class test
{
	
	public static void main(String[] atgs) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		s=s.replace("eraser","");
		s=s.replace("erase","");
		s=s.replace("dreamer","");
		s=s.replace("dream","");
		if(s.length()==0)
			System.out.println("true");
		else System.out.println("false");
	}
}

