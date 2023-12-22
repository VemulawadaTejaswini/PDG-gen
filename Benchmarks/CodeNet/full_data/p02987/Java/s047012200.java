import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        String hoge = sc.next();
        String[] input = hoge.split("",0);
        String[] moji = new String[4];;
        Integer[] count = new Integer[4];;

        moji[0] = input[0];
        count[0] = 1;

        if (Arrays.asList(moji).contains(input[1]))
        {
            count[0]=2;
        }
        else
        {
            moji[1] = input[1];
            count[1] = 1;
        }

        if (Arrays.asList(moji).contains(input[2]))
        {
            if(count[0] == 2) 
            {
                System.out.println("No");
                System.exit(0);
            }
            else if(input[2] == moji[0])
            {
                count[0]+=1;
            }
            else if(input[2] == moji[1])
            {
                count[1]+=1;
            }

        }

        if (Arrays.asList(moji).contains(input[3]))
        {
            if(count[0] == 2) 
            {
                System.out.println("No");
                System.exit(0);
            }
            else if(count[1]==2)
            {
                System.out.println("No");
                System.exit(0);
            }
            System.out.println("YES");
            System.exit(0);

        }
        else
        {
            System.out.println("No");
            System.exit(0);
        }
	}
}