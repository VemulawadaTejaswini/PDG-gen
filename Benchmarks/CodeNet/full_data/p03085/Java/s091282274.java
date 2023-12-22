import java.util.*;
import java.io.*;


public class Main {
    static char bondBase(char b){
        if(b=='A') return 'T';
        if(b=='T') return 'A';
        if(b=='C') return 'G';
        if(b=='G') return 'C';
        return '?';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char b = sc.next().charAt(0);
        System.out.println(bondBase(b));
    }
}