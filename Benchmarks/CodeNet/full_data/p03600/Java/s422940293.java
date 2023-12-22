import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        static String toKaigyo(String[] list){return String.join("\n",list);}
        static String toHanSp(String[] list){return String.join(" ",list);}
        public static void main(String[] args){
          int N = getInt();
          long[][] list = new long[N][N];
          for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
              list[i][j] = getLong();
            }
          }
          
          long minus = 0;
	      long output = 0;
	for(int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			output += list[i][j];
		}
	}
	output /= 2;
	for(int k = 0; k < N; k++){
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(list[i][j] > (list[i][k] + list[k][j])){
					myout(-1);
					return;
				}else if(list[i][j] == (list[i][k] + list[k][j]) && i != k && j != k){
					minus += list[i][j];
				}
			}
		}
	}
	minus /= 2;
	myout(output - minus);
          
        }
        //Method addition frame start

        //Method addition frame end
}
