import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static int n;
    static String s ;
    static char []r1 ;
    static char []r2 ;
    static char []r3 ;
    static char []r4 ;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        n = in.nextInt();
        s = in.next();
        r1 = new char[n];
        r2 = new char[n];
        r3 = new char[n];
        r4 = new char[n];
        r1[0] = 'S';
        r2[0] = 'S';
        r3[0] = 'W';
        r4[0] = 'W';
        if(s.charAt(0)=='o'){
            r1[1]='S';r1[n-1]='S';
            r2[1]='W';r2[n-1]='W';
            r3[1]='W';r3[n-1]='S';
            r4[1]='S';r4[n-1]='W';
        }
        else {
            r1[1]='W';r1[n-1]='S';
            r2[1]='S';r2[n-1]='W';
            r3[1]='S';r3[n-1]='S';
            r4[1]='W';r4[n-1]='W';

        }
        factory(r1);
//        for(int i=0;i<n;i++){
//            System.out.print(r1[i]);
//        }
//        System.out.println();
        if(printOut(r1)){
            return;
        }
        factory(r2);
//        for(int i=0;i<n;i++){
//            System.out.print(r2[i]);
//        }
//        System.out.println();
        if(printOut(r2)){
            return;
        }
        factory(r3);
//        for(int i=0;i<n;i++){
//            System.out.print(r3[i]);
//        }
//        System.out.println();
        if(printOut(r3)){
            return;
        }
        factory(r4);
//        for(int i=0;i<n;i++){
//            System.out.print(r4[i]);
//        }
//        System.out.println();
        if(printOut(r4)){
            return;
        }
        System.out.println(-1);

    }
    static void factory(char[] arr){
        for(int i =1;i<=n-3;i++){
            if(s.charAt(i)=='o'){
                if(arr[i]=='S'){
                    if(arr[i-1]=='S'){
                        arr[i+1]='S';
                    }
                    else {
                        arr[i+1]='W';
                    }
                }
                else{
                    if(arr[i-1]=='S'){
                        arr[i+1]='W';
                    }
                    else {
                        arr[i+1]='S';
                    }
                }
            }
            else {
                if(arr[i]=='S'){
                    if(arr[i-1]=='S'){
                        arr[i+1]='W';
                    }
                    else {
                        arr[i+1]='S';
                    }
                }
                else{
                    if(arr[i-1]=='S'){
                        arr[i+1]='S';
                    }
                    else {
                        arr[i+1]='W';
                    }
                }

            }
        }
    }
    static boolean printOut(char[]arr){
        boolean pass = true;
        int idex = n-1;
        if(s.charAt(idex)=='o'){
            if(arr[idex]=='S'){
                if(arr[idex-1]==arr[0]){
                    pass = true;
                }
                else {
                    pass=false;
                }
            }
            else {
                if(arr[idex-1]!=arr[0]){
                    pass = true;
                }
                else {
                    pass=false;
                }
            }
        }
        else {
            if(arr[idex]=='S'){
                if(arr[idex-1]!=arr[0]){
                    pass = true;
                }
                else {
                    pass=false;
                }
            }
            else {
                if(arr[idex-1]==arr[0]){
                    pass = true;
                }
                else {
                    pass=false;
                }
            }

        }
//        ------------------------------------------------------------
        if(pass){
            idex=n-2;
            if(s.charAt(idex)=='o'){
                if(arr[idex]=='S'){
                    if(arr[idex-1]==arr[idex+1]){
                        pass = true;
                    }
                    else {
                        pass=false;
                    }
                }
                else {
                    if(arr[idex-1]!=arr[idex+1]){
                        pass = true;
                    }
                    else {
                        pass=false;
                    }
                }
            }
            else {
                if(arr[idex]=='S'){
                    if(arr[idex-1]!=arr[idex+1]){
                        pass = true;
                    }
                    else {
                        pass=false;
                    }
                }
                else {
                    if(arr[idex-1]==arr[idex+1]){
                        pass = true;
                    }
                    else {
                        pass=false;
                    }
                }

            }
        }

//        ------------------------------------------------------------

        if(pass){
            for(int i =0;i<n;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }
}
