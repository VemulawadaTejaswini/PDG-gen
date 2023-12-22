import java.util.*;

class Main {
public static Integer judge(String w, int wlen ,String target){

String wafter = w.replace(target,"");
int wlenafter = wafter.length();
if((wlen - wlenafter) % 2 == 0){
return 0;
}else{
return 1;
}

}


public static void main(String[] args){

int ugly = 0;
Scanner sc = new Scanner(System.in);
String w = sc.next();
int wlen = w.length();
ugly += judge(w, wlen, "a"); ugly += judge(w, wlen, "b"); ugly += judge(w, wlen, "c"); ugly += judge(w, wlen, "d");
ugly += judge(w, wlen, "e"); ugly += judge(w, wlen, "f"); ugly += judge(w, wlen, "g"); ugly += judge(w, wlen, "h");
ugly += judge(w, wlen, "i"); ugly += judge(w, wlen, "j"); ugly += judge(w, wlen, "k"); ugly += judge(w, wlen, "l");
ugly += judge(w, wlen, "m"); ugly += judge(w, wlen, "n"); ugly += judge(w, wlen, "o"); ugly += judge(w, wlen, "p");
ugly += judge(w, wlen, "q"); ugly += judge(w, wlen, "r"); ugly += judge(w, wlen, "s"); ugly += judge(w, wlen, "t");
ugly += judge(w, wlen, "u"); ugly += judge(w, wlen, "v"); ugly += judge(w, wlen, "w"); ugly += judge(w, wlen, "x");
ugly += judge(w, wlen, "y"); ugly += judge(w, wlen, "z");
if(ugly == 0){
System.out.println("Yes");
}else{
System.out.println("No");
}

}
}