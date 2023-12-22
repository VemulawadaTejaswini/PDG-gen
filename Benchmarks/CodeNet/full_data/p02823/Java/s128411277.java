import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();//小さい
        long b = sc.nextLong();//大きい



        if ((b-a)%2 == 1)//奇数離れている
        {
            if (b-1 >= Math.abs(a-n))
            {
                if (b==n || a==1)
                {
                    if (b-a >= 3)
                    {
                        long c = (b-a-3)/2;
                        System.out.println(2+c);
                    }else
                    {
                        System.out.println(b-1);
                    }
                }
                else if (b-a >= 3)
                {
                    long c = ((b-a) - 3)/2;
                    System.out.println(3+c);
                }else
                {
                    System.out.println(Math.abs(a-n));
                }
            } else
            {
                if (b==n || a==1)
                {
                    if (b-a >= 3)
                    {
                        long c = (b-a-3)/2;
                        System.out.println(2+c);
                    }else
                    {
                        System.out.println(b-1);
                    }
                } else if (b-a >= 3)
                {
                    long c = ((b-a)-3)/2;
                    System.out.println(3+c);
                }else
                {
                    System.out.println(b-1);
                }
            }
        }else
        {
            System.out.println((b-a)/2);
        }
        sc.close();
    }

    public class Pair<F,S>
    {
        private final F first;
        private final S second;

        Pair(F first,S second)
        {
            this.first = first;
            this.second = second;
        }

        public void print() { System.out.println("("+this.first+","+this.second+")"); }

        //get
        public F first() {return this.first;}
        public S second() {return this.second;}

        @Override
        public boolean equals(Object object)
        {
            if (object instanceof Pair)
            {
                Pair pair = (Pair)object;
                return this.first==pair.first && this.second==pair.second;
            }else
            {
                return false;
            }
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(first,second);
        }
    }
}