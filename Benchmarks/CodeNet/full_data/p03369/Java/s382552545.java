import java.io.*;
class Sample1
{
public static void main(String[] args) throws IOException
{
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();

if(str == "ooo");{
System.out.println("1000");
}
if(str == "oox");{
System.out.println("900");
}
if(str == "oxo");{
System.out.println("900");
}
if(str == "oxx");{
System.out.println("800");
}
if(str == "xoo");{
System.out.println("900");
}
if(str == "xox");{
System.out.println("800");
}
if(str == "xxo");{
System.out.println("800");
}
if(str == "xxx");{
System.out.println("700");
}
}
}