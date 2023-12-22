import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long count = 0;

        for(long i = 0;; i++){
            if(Judge(i) == true){
                System.out.println(i);
                count++
                if(count == K){
                    break;
                }
            }
        }

    }

    public double searchS (long i)
    {
        long k = 0;
        long n = i;
        do{
            k += (i % 10);
            i /= 10;
        }while(i > 0);
        return k / n;
    }

    public boolean Judge (long i)
    {
        double s = searchS(i);
        boolean bl = true;

        for(long k = i+1; k < s * Digit(i) * 9; k++){
            if(s > search(k)){
                bl = false;
                break;
            }
        }
        return bl;
    }
    public int Digit (long i)
    {
        long count = 0;
        do{
            count++;
            i /= 10;
        }while(i > 0);

        return count;
    }
}