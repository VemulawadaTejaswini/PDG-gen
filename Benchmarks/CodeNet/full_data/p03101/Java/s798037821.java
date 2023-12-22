//package Beginner121;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int W = s.nextInt();
        int h = s.nextInt();
        int w = s.nextInt();
        System.out.println(H*W + h*w - h*W - H*w);

    }
}