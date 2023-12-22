import java.util.*;

class Program
{
  static void Main(string[] args)
  {
    // get a char
    char a = str.charAt(args[0]);
    char val = 'C';
    if (a == 'A')
      val = 'T';
    else if (a == 'T')
      val = 'A';
    else if (a == 'C')
      val = 'G';
    else
      val = 'C';
    //output
		System.out.println(val);
  }
}