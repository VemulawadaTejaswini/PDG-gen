import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N,K,count = 0,number = 0,count2 = 0,count3 = 0;
        int Max = 0,Max_number = 0;
        String S;
        N = Integer.parseInt(scan.next());
        K = Integer.parseInt(scan.next());
        S = scan.next();
        int str[] = new int[N];
        for(int i = 0;i < N;i++){
            if(count == 0){
                number = Integer.parseInt(S.substring(i,i+1));
                count++;
            }else if(number != Integer.parseInt(S.substring(i,i+1))){
                if(number == 0){
                    str[count2] = -count;
                }else{
                    str[count2] = count;
                }
                
                count = 1;
                count2++;
                number = Integer.parseInt(S.substring(i,i+1));
            }else{
                count++;
            }
        }
        str[count2] = count;


        for(int r = 0;r < K;r++){
            for(int l = 0;l < count2;l++){
                if(l > 0 && l < count2-1){
                    if(str[l] < 0 && Max < str[l-1] + Math.abs(str[l]) + str[l+1]){
                        Max = str[l-1] + Math.abs(str[l]) + str[l+1];
                        Max_number = l;
                    }
                }else if(l == 0){
                    if(str[l] < 0 && Max <  + Math.abs(str[l]) + str[l+1]){
                        Max =  Math.abs(str[l]) + str[l+1];
                        Max_number = l;
                    }
                }else if(l == count2-1){
                    if(str[l] < 0 && Max < str[l-1] + Math.abs(str[l])){
                        Max = str[l-1] + Math.abs(str[l]);
                        Max_number = l;
                    }
                }
                
            }

            str[Max_number] *= -1;
            count3 = count2;

            if(Max_number == 0 || Max_number == count2){
                count2--;
            }else{
                count2 -= 2;
            }

            int m = 0;
            for(int l = 0;l < count2;l++){
                if(m == Max_number || (m == Max_number-1 && Max_number == count3)){
                    str[l] = str[m] + str[m+1];
                    m++;
                }else if(m == Max_number-1){
                    str[l] = str[m] + str[m+1] + str[m + 2];
                    m += 2;
                }
                str[l] = str[m];
                m++;
            }
            
        }

        System.out.println(Max);

    }



}