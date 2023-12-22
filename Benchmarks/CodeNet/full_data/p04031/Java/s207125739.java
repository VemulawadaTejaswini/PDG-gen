import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
  public static void main(String args[]){
    Scanner stdln = new Scanner(System.in);
    String str1 = stdln.nextLine(); //str1はデータの数
    String str2 = stdln.nextLine();
    int N = Integer.parseInt(str1);
    String strdata[] = str2.split(" ");
    int intdata[] = new int[strdata.length];
    intdata = changetoInt(strdata);
    int average = getAverage(intdata,N);
    int answer = getSubSquareSum(intdata,average,N);
    System.out.println(answer);
  }
  //String型の配列からint型の配列へと変更する関数
  public static int[] changetoInt(String array[]){
    int i = 0;
    int data[] = new int[array.length];
    while(i < array.length){
      data[i] = Integer.parseInt(array[i]);
      i++;
    }
    return data;
  }
  //配列と個数を受け取って平均を返す関数
  public static int getAverage(int array[],int n){
    int sum = 0;
    int i = 0;
    int N = n;
    while(n > 0){
      sum = sum + array[i];
      i++;
      n--;
    }
    double average = (double)sum / N;
    int nearaverage = (int)Math.round(average);
    return nearaverage;
  }
  //配列と平均と個数を受け取って差の二乗の和を返す関数
  public static int getSubSquareSum(int array[],int average,int n){
    int i = 0;
    int sum = 0;
    while(n > 0){
      int x = array[i] - average;
      int y = x*x;
      sum = sum + y;
      i++;
      n--;
    }
    return sum;
  }
}
