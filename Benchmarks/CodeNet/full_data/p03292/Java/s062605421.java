import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=1000, max=0;
        for(int i=0;i<3;i++){
        	int task=sc.nextInt();
        	if(min>task) min=task;
        	if(max<task) max=task;
        }
        System.out.println(max-min);
    }
}