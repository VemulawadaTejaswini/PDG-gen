import java.util.*;

public class SameIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();

        boolean isEvenA = false;
        boolean isEvenB = false;
        boolean isEvenC = false;

        int count = 0;

        if(a % 2 == 0){
            isEvenA = true;
            count++;
        }

        if(b % 2 == 0){
            isEvenB = true;
            count++;
        }

        if(c % 2 == 0){
            isEvenC = true;
            count++;
        }


        int ans = 0;

        switch (count){
            case 0:
                break;
            case 1:
                if(! isEvenA){
                    a++;
                }
                if(! isEvenB){
                    b++;
                }
                if(! isEvenC){
                    c++;
                }

                ans += 1;
                break;
            case 2:
                if(isEvenA){
                    a++;
                }
                if(isEvenB){
                    b++;
                }
                if(isEvenC){
                    c++;
                }

                ans += 1;
                break;
            case 3:
                break;
        }


        List<Integer> list = Arrays.asList(a, b, c);
        Collections.sort(list);


        System.out.println((((list.get(2) * 2) - (list.get(0) + list.get(1))) / 2) + ans);
    }
}
