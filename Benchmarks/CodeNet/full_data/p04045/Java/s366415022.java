import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static int next(List<Integer> arr, int target)
    {
        int start = 0, end = arr.size() - 1;

        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Move to right side if target is
            // greater.
            if (arr.get(mid) <= target) {
                start = mid + 1;
            }

            // Move left side.
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<Integer>(Arrays.asList(0,1, 2, 3, 4, 5, 6,7,8,9));
        List<Integer> excNumbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        in.nextLine();
        for (int i = 0; i< k ; i++){
            excNumbers.add(in.nextInt());
        }
        List<Integer> myNumbers = new ArrayList<Integer> ();
        myNumbers.addAll(allNumbers);
        myNumbers.removeAll(excNumbers);
//        System.out.println(allNumbers);
//        System.out.println(excNumbers);
//        System.out.println(myNumbers);
        String n1 = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        if(excNumbers.size() < 10){
            for (int i = 0; i< n1.length() ; i++){
                int number = Integer.parseInt(String.valueOf(n1.charAt(i)));
                if(number == 9 && i != 0 && excNumbers.contains(number)){
                    int number1 = Integer.parseInt(String.valueOf(n1.charAt(i-1)));
                    if(! excNumbers.contains(number1)){
                        int x = next(myNumbers,number1);
                        if(x == -1 && (i-1) == 0){
                            if(myNumbers.get(0) == 0){
                                result = new StringBuilder();
                                result.append ((char)(myNumbers.get(1) + '0'));
                                result.append( '0');
                            }else{
                                result = new StringBuilder();
                                result.append((char)(myNumbers.get(0) + '0'));
                                result.append((char)(myNumbers.get(0) + '0'));
                            }
                        }else if(x == -1){
                            result.setCharAt(i-1,(char)(myNumbers.get(0) + '0'));
//                            result.append((char)(myNumbers.get(0) + '0'));

                        }else{
                            result.setCharAt(i-1,(char)(myNumbers.get(x) + '0'));
//                            result.append((char)(myNumbers.get(x) + '0'));

                        }
                    }
                }
                if(excNumbers.contains(number)){
                    int x = next(myNumbers,number);
                    if(x == -1 && i == 0){
                        if(myNumbers.get(0) == 0){
                            result.append ((char)(myNumbers.get(1) + '0'));
                            result.append( '0');
                        }else{
                            result.append((char)(myNumbers.get(0) + '0'));
                            result.append((char)(myNumbers.get(0) + '0'));
                        }
                    }else if(x == -1){
                        result.append((char)(myNumbers.get(0) + '0'));

                    }else{
                        result.append((char)(myNumbers.get(x) + '0'));

                    }
                }
                else
                {
                    result.append(n1.charAt(i));
                }
            }
        }

        if(result.length() == 0){
            System.out.println(n);
        }else{
            int finalNumber = Integer.parseInt(result.toString());
            System.out.println(finalNumber);
            if(finalNumber < n){
                int firstNumber = Integer.parseInt(String.valueOf(n1.charAt(0)));
                char number=' ';
                int x = next(myNumbers,firstNumber);
                if(x == -1 ){
                    if(myNumbers.get(0) == 0){

                        StringBuilder replaced = new StringBuilder();
                        replaced.append((char)(myNumbers.get(1) + '0') );
                        replaced.append('0');
                        result = result.replace(0,1, replaced.toString());
                        number = '0';
                    }else{
                        StringBuilder replaced = new StringBuilder();
                        replaced.append((char)(myNumbers.get(1) + '0') );
                        replaced.append((char)(myNumbers.get(1) + '0'));
                        result = result.replace(0,1, replaced.toString());
                        number = (char)(myNumbers.get(1) + '0');

                    }
                }else{
                    result.setCharAt(0,(char)(myNumbers.get(x) + '0'));
                    number = (char)(myNumbers.get(x) + '0');
                }
                for (int i = 0; i< result.length() ; i++){
                    if(result.charAt(i) == n1.charAt(0)){
                        result.setCharAt(i,number);
                    }
                }
            }

            System.out.println(Integer.parseInt(result.toString()));
        }
    }
}
