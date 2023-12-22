import java.util.*;
class main
{
    public static void main()
    {
       String s;
       int c=0;
      Scanner in=new Scanner(System.in);
      for(int i=0 ; i<2 ; i++){
      s=in.nextLine();
      StringBuffer sb=new StringBuffer(s);
      if(!(sb.reverse().toString().equals(s)))
      {
          c=1;
      }  
    }
    if(c==0)
        System.out.println("YES\nThis grid remains the same when rotated 180 degrees.");
    else
            System.out.println("NO\nThis grid does not remain the same when rotated 180 degrees.");
}
}