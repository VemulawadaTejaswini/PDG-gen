import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        String[] acard = a.split("",0);
        String[] bcard = b.split("",0);
        String[] ccard = c.split("",0);
        String temp = acard[0];
        Int al = acard.length;
        Int bl = bcard.length;
        Int cl = ccard.lenght;
        boolean alo = false;
        boolean blo = false;
        boolean clo = false;
        Int acount = 1;
        Int bcount = 0;
        Int ccount = 0;
        Int breakcount = 0;
        while(true)
        {
            switch(temp)
            {
                case "a":
                    if(alo==false)
                    {
                        if(al != acount)
                        {
                            temp = acard[acount];
                            acount = acount + 1;
                        }
                        else
                        {
                            alo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                case "b":
                    if(blo == false)
                    {
                        if(bl != bcount)
                        {
                            temp = bcard[bcount];
                            bcount = bcount + 1;
                        }
                        else
                        {
                            blo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                case "c":
                    if(clo == false)
                    {
                        if(cl != ccount)
                        {
                            temp = ccard[ccount];
                            ccount = ccount + 1;
                        }
                        else
                        {
                            clo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                default:
                break;
            }
            if(breakcount =< 2)
            {
                break;
            }
        }
        if(alo == false)
        {
            System.out.println("A");
        }
        if(blo == false)
        {
            System.out.println("B");
        }
        if(clo == false)
        {
            System.out.println("C");
        }
    }
}