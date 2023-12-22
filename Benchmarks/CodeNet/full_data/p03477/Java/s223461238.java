/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        
        for(int i = 1 ; i <= N ; i++){
            int n = i;
            int digSum = 0;
            //合計が条件を満たすことを確認
            while(n > 0){
                digSum += n % 10;
                n /= 10;
            }
            if(A <= digSum && digSum <= B){
                sum += i;
            }
        }
        System.out.println(sum);
    }
  }
    

