import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = br.readLine();

        char[] arr1 = new char[n];
        char[] arr2 = new char[n];
        char[] arr3 = new char[n];
        char[] arr4 = new char[n];

        boolean a1=true;
        boolean a2=true;
        boolean a3=true;
        boolean a4=true;
        // case 1 assume a1 is sheep and left is sheep
        arr1[0] = 'S';
        arr1[n-1] = 'S';
        if (s.charAt(0)=='o')
            arr1[1]='S';
        else
            arr1[1]='W';
        for (int i=1; i<s.length()-1; i++){
            char cur = arr1[i];
            char h = s.charAt(i);
            if (cur=='S'){
                if (h=='o'){
                    char res = arr1[i-1];
                    if (arr1[i+1]=='\u0000'){
                        arr1[i+1]=res;
                    }
                    else{
                        if (arr1[i+1]!=res){
                            a1=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr1[i-1]);
                    if (arr1[i+1]=='\u0000'){
                        arr1[i+1]=res;
                    }
                    else{
                        if (arr1[i+1]!=res){
                            a1=false;
                            break;
                        }
                    }
                }

            }
            else{
                if (h=='x'){
                    char res = arr1[i-1];
                    if (arr1[i+1]=='\u0000'){
                        arr1[i+1]=res;
                    }
                    else{
                        if (arr1[i+1]!=res){
                            a1=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr1[i-1]);
                    if (arr1[i+1]=='\u0000'){
                        arr1[i+1]=res;
                    }
                    else{
                        if (arr1[i+1]!=res){
                            a1=false;
                            break;
                        }
                    }
                }
            }
        }
        if (s.charAt(s.length()-1)=='o'){
            if (arr1[s.length()-1]=='S'){
                if(arr1[s.length()-2]!=arr1[0])
                    a1=false;
            }
            else {
                if(arr1[s.length()-2]==arr1[0])
                    a1=false;
            }
        }
        else{
            if (arr1[s.length()-1]=='S'){
                if(arr1[s.length()-2]==arr1[0])
                    a1=false;
            }
            else {
                if(arr1[s.length()-2]!=arr1[0])
                    a1=false;
            }
        }
        //case 2 assume a1 is sheep and left is wolf
        arr2[0] = 'S';
        arr2[n-1] = 'W';
        if (s.charAt(0)=='o')
            arr2[1]='W';
        else
            arr2[1]='S';
        for (int i=1; i<s.length()-1; i++){
            char cur = arr2[i];
            char h = s.charAt(i);
            if (cur=='S'){
                if (h=='o'){
                    char res = arr2[i-1];
                    if (arr2[i+1]=='\u0000'){
                        arr2[i+1]=res;
                    }
                    else{
                        if (arr2[i+1]!=res){
                            a2=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr2[i-1]);
                    if (arr2[i+1]=='\u0000'){
                        arr2[i+1]=res;
                    }
                    else{
                        if (arr2[i+1]!=res){
                            a2=false;
                            break;
                        }
                    }
                }

            }
            else{
                if (h=='x'){
                    char res = arr2[i-1];
                    if (arr2[i+1]=='\u0000'){
                        arr2[i+1]=res;
                    }
                    else{
                        if (arr2[i+1]!=res){
                            a2=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr2[i-1]);
                    if (arr2[i+1]=='\u0000'){
                        arr2[i+1]=res;
                    }
                    else{
                        if (arr2[i+1]!=res){
                            a2=false;
                            break;
                        }
                    }
                }
            }
        }
        if (s.charAt(s.length()-1)=='o'){
            if (arr2[s.length()-1]=='S'){
                if(arr2[s.length()-2]!=arr2[0])
                    a2=false;
            }
            else {
                if(arr2[s.length()-2]==arr2[0])
                    a2=false;
            }
        }
        else{
            if (arr2[s.length()-1]=='S'){
                if(arr2[s.length()-2]==arr2[0])
                    a2=false;
            }
            else {
                if(arr2[s.length()-2]!=arr2[0])
                    a2=false;
            }
        }
        //case3 assume a1 is wolf and left is wolf
        arr3[0] = 'W';
        arr3[n-1] = 'W';
        if (s.charAt(0)=='o')
            arr3[1]='S';
        else
            arr3[1]='W';
        for (int i=1; i<s.length()-1; i++){
            char cur = arr3[i];
            char h = s.charAt(i);
            if (cur=='S'){
                if (h=='o'){
                    char res = arr3[i-1];
                    if (arr3[i+1]=='\u0000'){
                        arr3[i+1]=res;
                    }
                    else{
                        if (arr3[i+1]!=res){
                            a3=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr3[i-1]);
                    if (arr3[i+1]=='\u0000'){
                        arr3[i+1]=res;
                    }
                    else{
                        if (arr3[i+1]!=res){
                            a3=false;
                            break;
                        }
                    }
                }

            }
            else{
                if (h=='x'){
                    char res = arr3[i-1];
                    if (arr3[i+1]=='\u0000'){
                        arr3[i+1]=res;
                    }
                    else{
                        if (arr3[i+1]!=res){
                            a3=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr3[i-1]);
                    if (arr3[i+1]=='\u0000'){
                        arr3[i+1]=res;
                    }
                    else{
                        if (arr3[i+1]!=res){
                            a3=false;
                            break;
                        }
                    }
                }
            }
        }
        if (s.charAt(s.length()-1)=='o'){
            if (arr3[s.length()-1]=='S'){
                if(arr3[s.length()-2]!=arr3[0])
                    a3=false;
            }
            else {
                if(arr3[s.length()-2]==arr3[0])
                    a3=false;
            }
        }
        else{
            if (arr3[s.length()-1]=='S'){
                if(arr3[s.length()-2]==arr3[0])
                    a3=false;
            }
            else {
                if(arr3[s.length()-2]!=arr3[0])
                    a3=false;
            }
        }
        //assume a1 is wolf and left is sheep
        arr4[0] = 'W';
        arr4[n-1] = 'S';
        if (s.charAt(0)=='o')
            arr4[1]='W';
        else
            arr4[1]='S';
        for (int i=1; i<s.length()-1; i++){
            char cur = arr4[i];
            char h = s.charAt(i);
            if (cur=='S'){
                if (h=='o'){
                    char res = arr4[i-1];
                    if (arr4[i+1]=='\u0000'){
                        arr4[i+1]=res;
                    }
                    else{
                        if (arr4[i+1]!=res){
                            a4=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr4[i-1]);
                    if (arr4[i+1]=='\u0000'){
                        arr4[i+1]=res;
                    }
                    else{
                        if (arr4[i+1]!=res){
                            a4=false;
                            break;
                        }
                    }
                }

            }
            else{
                if (h=='x'){
                    char res = arr4[i-1];
                    if (arr4[i+1]=='\u0000'){
                        arr4[i+1]=res;
                    }
                    else{
                        if (arr4[i+1]!=res){
                            a4=false;
                            break;
                        }
                    }
                }
                else{
                    char res = getOther(arr4[i-1]);
                    if (arr4[i+1]=='\u0000'){
                        arr4[i+1]=res;
                    }
                    else{
                        if (arr4[i+1]!=res){
                            a4=false;
                            break;
                        }
                    }
                }
            }
        }
        if (s.charAt(s.length()-1)=='o'){
            if (arr4[s.length()-1]=='S'){
                if(arr4[s.length()-2]!=arr4[0])
                    a4=false;
            }
            else {
                if(arr4[s.length()-2]==arr4[0])
                    a4=false;
            }
        }
        else{
            if (arr4[s.length()-1]=='S'){
                if(arr4[s.length()-2]==arr4[0])
                    a4=false;
            }
            else {
                if(arr4[s.length()-2]!=arr4[0])
                    a4=false;
            }
        }
        if (a1){
            System.out.println(new String(arr1));
        }
        else if(a2){
            System.out.println(new String(arr2));
        }
        else if (a3){
            System.out.println(new String(arr3));

        }
        else if (a4){
            System.out.println(new String(arr4));
        }
        else{
            System.out.println(-1);
        }
    }

    public static char getOther(char c){
        return c=='W'?'S':'W';
    }

}
