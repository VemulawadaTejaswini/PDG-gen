import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String str[] = new String[s.length()];
    int num[] = new int[s.length()];
    for(int i=0;i<s.length();i++){
      str[i]=s.substring(i,i+1);
      if(str[i].equals("A")){
        num[i]=0;
      }else if(str[i].equals("B")){
        num[i]=1;
      }else if(str[i].equals("C")){
        num[i]=2;
      }else if(str[i].equals("D")){
        num[i]=3;
      }else if(str[i].equals("E")){
        num[i]=4;
      }else if(str[i].equals("F")){
        num[i]=5;
      }else if(str[i].equals("G")){
        num[i]=6;
      }else if(str[i].equals("H")){
        num[i]=7;
      }else if(str[i].equals("I")){
        num[i]=8;
      }else if(str[i].equals("J")){
        num[i]=9;
      }else if(str[i].equals("K")){
        num[i]=10;
      }else if(str[i].equals("L")){
        num[i]=11;
      }else if(str[i].equals("M")){
        num[i]=12;
      }else if(str[i].equals("N")){
        num[i]=13;
      }else if(str[i].equals("O")){
        num[i]=14;
      }else if(str[i].equals("P")){
        num[i]=15;
      }else if(str[i].equals("Q")){
        num[i]=16;
      }else if(str[i].equals("R")){
        num[i]=17;
      }else if(str[i].equals("S")){
        num[i]=18;
      }else if(str[i].equals("T")){
        num[i]=19;
      }else if(str[i].equals("U")){
        num[i]=20;
      }else if(str[i].equals("V")){
        num[i]=21;
      }else if(str[i].equals("W")){
        num[i]=22;
      }else if(str[i].equals("X")){
        num[i]=23;
      }else if(str[i].equals("Y")){
        num[i]=24;
      }else if(str[i].equals("Z")){
        num[i]=25;
      }
    }
    for(int i=0;i<s.length();i++){
      num[i]=(num[i]+n)%26;
    }
    
    
    for(int i=0;i<s.length();i++){
      if(num[i]==0){
        System.out.print("A");
      }else if(num[i]==1){
        System.out.print("B");
      }else if(num[i]==2){
        System.out.print("C");
      }else if(num[i]==3){
        System.out.print("D");
      }else if(num[i]==4){
        System.out.print("E");
      }else if(num[i]==5){
        System.out.print("F");
      }else if(num[i]==6){
        System.out.print("G");
      }else if(num[i]==7){
        System.out.print("H");
      }else if(num[i]==8){
        System.out.print("I");
      }else if(num[i]==9){
        System.out.print("J");
      }else if(num[i]==10){
        System.out.print("K");
      }else if(num[i]==11){
        System.out.print("L");
      }else if(num[i]==12){
        System.out.print("M");
      }else if(num[i]==13){
        System.out.print("N");
      }else if(num[i]==14){
        System.out.print("O");
      }else if(num[i]==15){
        System.out.print("P");
      }else if(num[i]==16){
        System.out.print("Q");
      }else if(num[i]==17){
        System.out.print("R");
      }else if(num[i]==18){
        System.out.print("S");
      }else if(num[i]==19){
        System.out.print("T");
      }else if(num[i]==20){
        System.out.print("U");
      }else if(num[i]==21){
        System.out.print("V");
      }else if(num[i]==22){
        System.out.print("W");
      }else if(num[i]==23){
        System.out.print("X");
      }else if(num[i]==24){
        System.out.print("Y");
      }else if(num[i]==25){
        System.out.print("Z");
      }
      
    }

  }
  

  
}