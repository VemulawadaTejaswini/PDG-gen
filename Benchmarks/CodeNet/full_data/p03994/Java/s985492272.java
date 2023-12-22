import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s =sc.next();
    int S =s.length();
    long K=sc.nextLong();
    long N =S*26;
    K=K%N;
    String T[] =s.split("",0);
    String ans ="0";
    for(int j=0;j<S;j++){
      if(K==0){ans =ans +T[j];}
      else if(j!=S-1){
      if(T[j].equals("a")){ans =ans +"a";}
      else if((T[j].equals("b"))&&(K>25)){ans =ans +"a";K=K-25;}
      else if((T[j].equals("c"))&&(K>24)){ans =ans +"a";K=K-24;}
      else if((T[j].equals("d"))&&(K>23)){ans =ans +"a";K=K-23;}
      else if((T[j].equals("e"))&&(K>22)){ans =ans +"a";K=K-22;}
      else if((T[j].equals("f"))&&(K>21)){ans =ans +"a";K=K-21;}
      else if((T[j].equals("g"))&&(K>20)){ans =ans +"a";K=K-20;}
      else if((T[j].equals("h"))&&(K>19)){ans =ans +"a";K=K-19;}
      else if((T[j].equals("i"))&&(K>18)){ans =ans +"a";K=K-18;}
      else if((T[j].equals("j"))&&(K>17)){ans =ans +"a";K=K-17;}
      else if((T[j].equals("k"))&&(K>16)){ans =ans +"a";K=K-16;}
      else if((T[j].equals("l"))&&(K>15)){ans =ans +"a";K=K-15;}
      else if((T[j].equals("m"))&&(K>14)){ans =ans +"a";K=K-14;}
      else if((T[j].equals("n"))&&(K>13)){ans =ans +"a";K=K-13;}
      else if((T[j].equals("o"))&&(K>12)){ans =ans +"a";K=K-12;}
      else if((T[j].equals("p"))&&(K>11)){ans =ans +"a";K=K-11;}
      else if((T[j].equals("q"))&&(K>10)){ans =ans +"a";K=K-10;}
      else if((T[j].equals("r"))&&(K>9)){ans =ans +"a";K=K-9;}
      else if((T[j].equals("s"))&&(K>8)){ans =ans +"a";K=K-8;}
      else if((T[j].equals("t"))&&(K>7)){ans =ans +"a";K=K-7;}
      else if((T[j].equals("u"))&&(K>6)){ans =ans +"a";K=K-6;}
      else if((T[j].equals("v"))&&(K>5)){ans =ans +"a";K=K-5;}
      else if((T[j].equals("w"))&&(K>4)){ans =ans +"a";K=K-4;}
      else if((T[j].equals("x"))&&(K>3)){ans =ans +"a";K=K-3;}
      else if((T[j].equals("y"))&&(K>2)){ans =ans +"a";K=K-2;}
      else if((T[j].equals("z"))&&(K>1)){ans =ans +"a";K=K-1;}
        else{ans =ans+T[j];}}
      if(j==S-1){if(T[j].equals("b")){K=K+1;}
                 else if(T[j].equals("c")){K=K+2;}
                 else if(T[j].equals("d")){K=K+3;}
                 else if(T[j].equals("e")){K=K+4;}
                 else if(T[j].equals("f")){K=K+5;}
                 else if(T[j].equals("g")){K=K+6;}
                 else if(T[j].equals("h")){K=K+7;}
                 else if(T[j].equals("i")){K=K+8;}
                 else if(T[j].equals("j")){K=K+9;}
                 else if(T[j].equals("k")){K=K+10;}
                 else if(T[j].equals("l")){K=K+11;}
                 else if(T[j].equals("m")){K=K+12;}
                 else if(T[j].equals("n")){K=K+13;}
                 else if(T[j].equals("o")){K=K+14;}
                 else if(T[j].equals("p")){K=K+15;}
                 else if(T[j].equals("q")){K=K+16;}
                 else if(T[j].equals("r")){K=K+17;}
                 else if(T[j].equals("s")){K=K+18;}
                 else if(T[j].equals("t")){K=K+19;}
                 else if(T[j].equals("u")){K=K+20;}
                 else if(T[j].equals("v")){K=K+21;}
                 else if(T[j].equals("w")){K=K+22;}
                 else if(T[j].equals("x")){K=K+23;}
                 else if(T[j].equals("y")){K=K+24;}
                 else if(T[j].equals("z")){K=K+25;}
                 K=K%26;String ans1;
                 if(K==0){ans =ans+"a";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==1){ans =ans+"b";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==2){ans =ans+"c";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==3){ans =ans+"d";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==4){ans =ans+"e";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==5){ans =ans+"f";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==6){ans =ans+"g";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==7){ans =ans+"h";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==8){ans =ans+"i";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==9){ans =ans+"j";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==10){ans =ans+"k";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==11){ans =ans+"l";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==12){ans =ans+"m";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==13){ans =ans+"n";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==14){ans =ans+"o";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==15){ans =ans+"p";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==16){ans =ans+"q";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==17){ans =ans+"r";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==18){ans =ans+"s";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==19){ans =ans+"t";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==20){ans =ans+"u";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==21){ans =ans+"v";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==22){ans =ans+"w";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==23){ans =ans+"x";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==24){ans =ans+"y";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                 if(K==25){ans =ans+"z";ans1 =ans.substring(1,S+1);System.out.println(ans1);System.exit(0);}
                }
    }
  }
}