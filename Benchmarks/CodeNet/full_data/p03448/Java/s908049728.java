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
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int cou = 0;
        
        for(int a = 0 ; a < A + 1 ; a++ ){
            for(int b = 0 ; b < B + 1 ; b++ ){
                int c = (X - 500 * a - 100 * b) / 50;
                if(0 <= c && c <= C){
                    cou++;
                }
            }
        }
        System.out.println(cou);
    }
  }
    

