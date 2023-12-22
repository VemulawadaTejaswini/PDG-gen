import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = GetInput.getInputString();
        if (stringBuilder.length()%2 == 0){
            System.out.println("NO");
            return;
        }
        if (isPalindrome(stringBuilder, 0, stringBuilder.length())
                && isPalindrome(stringBuilder, 0, ((stringBuilder.length()-1)/2))
                && isPalindrome(stringBuilder, ((stringBuilder.length()+3)/2) -1, (stringBuilder.length())))
        {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }

    private static boolean isPalindrome(StringBuilder stringBuilder, int start, int length) {
        for (int i = start; i < length; i++){
            if (stringBuilder.charAt(i) == stringBuilder.charAt(length-i-1)){
                continue;
            }
            else return false;
        }
        return true;
    }



    private static long sumUpto(int n) {
        return (long) (Math.pow(2, n + 1) - 2);
    }

    private static long mod(long position, long position1) {
        if (position - position1 > 0) {
            return position - position1;
        }
        return position1 - position;
    }

}


class GetInput {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static char[] getCharArray() {
        char[] charArray;
        try {
            StringBuilder string = getInputString();
            charArray = new char[string.length()];
            for (int i = 0; i < string.length(); i++) {
                charArray[i] = string.charAt(i);
            }
            return charArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        charArray = new char[0];
        return charArray;
    }

    static int[] getArrayInt() {
        String[] string;
        int[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new int[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Integer.parseInt(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arra = new int[2];
        return arra;
    }

    static int getInt() {
        try {
            String string = bufferedReader.readLine();
            return Integer.parseInt(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static StringBuilder getInputString() {
        try {
            StringBuilder string = new StringBuilder();
            string.append(bufferedReader.readLine());
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringBuilder();
    }

    static long getLongInput() {
        try {
            String string = bufferedReader.readLine();
            return Long.parseLong(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static long[] getLongArrayInput() {
        String[] string;
        long[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new long[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Long.parseLong(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        long[] arra = new long[2];
        return arra;
    }
}
