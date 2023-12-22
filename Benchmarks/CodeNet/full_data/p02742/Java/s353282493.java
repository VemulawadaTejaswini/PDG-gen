import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int check = h*w;

        if(check % 2 == 1){
            check = check / 2 + 1;
        }else{
            check = check /2;
        }

        System.out.println(check);

	}
}