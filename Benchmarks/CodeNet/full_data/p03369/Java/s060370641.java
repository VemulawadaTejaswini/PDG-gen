import java.io.*;
class Sample1
{
public static void main(String[] args) throws IOException
{
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
int num = Integer.parseInt(str);
if(num == "ooo");{
System.out.println("1000");
}
if(num == "oox");{
System.out.println("900");
}
if(num == "oxo");{
System.out.println("900");
}
if(num == "oxx");{
System.out.println("800");
}
if(num == "xoo");{
System.out.println("900");
}
if(num == "xox");{
System.out.println("800");
}
if(num == "xxo");{
System.out.println("800");
}
if(num == "xxx");{
System.out.println("700");
}
}
}