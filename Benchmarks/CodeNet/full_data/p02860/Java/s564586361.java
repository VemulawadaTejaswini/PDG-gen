import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    sl = r.readLine().split(" ");
    int n = Integer.parseInt(sl[0]);
    s = r.readLine();

    if(s.length() % 2 == 1)
    {
      System.out.println("No");
      System.exit(0);
    }

    for(int i = 0; i < s.length() / 2; i++)
    {
      if(s.charAt(i) != s.charAt(i + s.length() / 2))
      {
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");

  }

}


class RemRing
{
 long module;
 public RemRing(long module)
 {
   this.module = module;
 }

 public long sum(long a, long b)
 {
   return (a + b + module) % module;
 }

 public long sub(long a, long b)
 {
   return (a - b + module) % module;
 }

 public long prod(long a, long b)
 {
   return (a * b) % module;
 }

 public long div(long a, long b)
 {
   return (a * inv(b)) % module;
 }

 public long inv(long a)
 {
   long b = this.module;
   long u = 1;
   long v = 0;
   while(b > 0)
   {
     long t = a / b;
     a -= t * b;
     u -= t * v;
     long z = a;
     a = b;
     b = z;
     z = u;
     u = v;
     v = z;
   }
   u %= this.module;
   if(u < 0) u += this.module;
   return u;
 }
}
