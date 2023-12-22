package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

class Task3 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int N = in.nextInt();
        int a[] = in.nextIntArray(N);

        //Remove the incrementation from given array(the +1,+2,+3 part)
        for (int i = 0; i < N; i++) {
            a[i] -= (i+1);
        }

        //Sort the array
        Arrays.sort(a);
        int sumFromLeftSide[] = Arrays.copyOf(a,N);  //Summation of array a from left side
        for (int i = 1; i < N; i++) {
            sumFromLeftSide[i] += sumFromLeftSide[i-1];
        }
        int sumFromRightSide[] = Arrays.copyOf(a,N);  //Summation of array a from right side
        for (int i = N-2; i >= 0; i--) {
            sumFromRightSide[i] += sumFromRightSide[i+1];
        }

        //Divide the array into two parts and calculate minimum possible value of eqn A_1 - (b+1),  A_2 - (b+2)..
        long minAns = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int left = ((i+1)*a[i])-sumFromLeftSide[i];
            if(left < 0)
                throw new ArithmeticException("");
            int right = sumFromRightSide[i]-((N - i)*a[i]);
            minAns = Math.min(left+right,minAns);
        }
        out.println(minAns);
    }
}
