import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.io.*;
class Main{
        public static void main(String args[]){
                //Scanner sc = new Scanner(System.in);
                char[][] c = new char[3][3];
                int k;
                try{
                        for(int i=0;i<3;i++){
                                for(int j=0;j<3;j++){
                                        k = System.in.read();
                                        c[i][j] = (char)k;
                                }
                        }
                }catch(IOException e){
                        System.out.println("error");
                }
                for(int i=0;i<3;i++)System.out.print(c[i][i]);
        }
}
