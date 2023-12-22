import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cubeSize = S.length();

		Pattern p = Pattern.compile("01|01");

		while (true) {
			S = replaceAll(S,"01", "");
			S = replaceAll(S,"10", "");
			if (!p.matcher(S).find()) {
				break;
			}
		}

		System.out.println(cubeSize - S.length());
	}

	public static String replaceAll(final String str, final String searchChars, String replaceChars)
	{
	  if ("".equals(str) || "".equals(searchChars) || searchChars.equals(replaceChars))
	  {
	    return str;
	  }
	  if (replaceChars == null)
	  {
	    replaceChars = "";
	  }
	  final int strLength = str.length();
	  final int searchCharsLength = searchChars.length();
	  StringBuilder buf = new StringBuilder(str);
	  boolean modified = false;
	  for (int i = 0; i < strLength; i++)
	  {
	    int start = buf.indexOf(searchChars, i);

	    if (start == -1)
	    {
	      if (i == 0)
	      {
	        return str;
	      }
	      return buf.toString();
	    }
	    buf = buf.replace(start, start + searchCharsLength, replaceChars);
	    modified = true;

	  }
	  if (!modified)
	  {
	    return str;
	  }
	  else
	  {
	    return buf.toString();
	  }
	}
}