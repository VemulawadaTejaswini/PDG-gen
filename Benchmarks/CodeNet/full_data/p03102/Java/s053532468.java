import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = scan.nextInt();
        int total = 0;
        int ans =0;
        int s = 0;//forの回数
        int[] B = new int[m];
        int[] A1 = new int[m];
        int[] A2 = new int[m];
        int[] A3 = new int[m];
        int[] A4 = new int[m];
        int[] A5 = new int[m];
        int[] A6 = new int[m];
        int[] A7 = new int[m];
        int[] A8 = new int[m];
        int[] A9 = new int[m];
        int[] A10 = new int[m];
        int[] A11 = new int[m];
        int[] A12 = new int[m];
        int[] A13 = new int[m];
        int[] A14 = new int[m];
        int[] A15 = new int[m];
        int[] A16 = new int[m];
        int[] A17 = new int[m];
        int[] A18 = new int[m];
        int[] A19 = new int[m];
        int[] A20 = new int[m];
        for(int i=0;i<m;i++){
            A1[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A2[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A3[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A4[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A5[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A6[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A7[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A8[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A9[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A10[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A11[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A12[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A13[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A14[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A15[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A16[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A17[s] = scan.nextInt();
            
        }
        s=0;
        for(int i=0;i<m;i++){
            A18[s] = scan.nextInt();
            s += 1;
        }
        s=0;
        for(int i=0;i<m;i++){
            A19[s] = scan.nextInt();
            s += 1;
        }
        
        s=0;
        for(int i=0;i<m;i++){
            A20[s] = scan.nextInt();
            
        }
        s=0;

        for(int i=0;i<m;i++){
            total += A1[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A2[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A3[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A4[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A5[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A6[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A7[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A8[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A9[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A10[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A11[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A12[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A13[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A14[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A15[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A16[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A17[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A18[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A19[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        for(int i=0;i<m;i++){
            total += A20[i] * B[i];
        }
        if(0 < total+c){
            ans += 1;
        } 
        System.out.println(ans);













    }

}