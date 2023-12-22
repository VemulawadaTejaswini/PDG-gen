import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Coder {

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 1 ; i <= input ; i ++){
            result += i;
        }
        System.out.print(result);
    } 
}
