

import java.util.Scanner;

public


class Main {

static int getfirst(int nu)
{
    return (int)(nu+"").charAt(0)-'0';
}



public
static
void
main(String[]
args) {
Scanner
sc = new
Scanner(System. in);
int
val, count = 0, a, b;
val = sc.nextInt();

int
af, al, bf, bl;
for (a=1;a <= val;a++)
    {
    for (b=0;b <= val;b++)
    {
        af=getfirst(a);
    al=a % 10;
    bf=getfirst(b);
    bl=b % 10;
    if (af == bl && al == bf)
    {
    count++;
    // System.out.println("\na: "+a+"	b: "+b);
    }
    }
    }
System.out.println(count);
}
}
