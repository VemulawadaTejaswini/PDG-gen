import java.util.*;
import java.io.*;

public class Main {

public static void main(String args[]) {

Scanner in = new Scanner(System.in);

int a = in.nextInt();
int b = in.nextInt();
int h = in.nextInt();

float area = (a+b)*h/2;
System.out.println(area);
}
}