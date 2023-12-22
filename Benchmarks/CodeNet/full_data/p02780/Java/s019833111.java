import java.util.*;

import java.io.*;
 
public class Main{

    public static int stringToInt(char i, int[] a){
        if(i == 'A') return a[0];
        if(i == 'B') return a[1];
        if(i == 'C') return a[2];
        return 0;
    }
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        double[] p = new double[N];
        for(int i = 0; i < N; i++){
            p[i] = s.nextDouble();
        }

        double exam = 0;
        for(int i = 0; i < K; i++){
            exam += (p[i]+1.0)/2.0;
        }
        
        double max = exam;
        for(int i = K; i < N; i++){
            double newExam = exam + (p[i]+1.0)/2.0 - (p[i-K]+1.0)/2.0;
            max = Math.max(exam, newExam);
            exam = newExam;
        }
        
        System.out.println(max);
        
        
	}
} 