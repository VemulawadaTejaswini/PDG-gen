import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static Long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}//equalsが使えんので要改修
        public static void main(String[] args){
          int N = getInt();
          String P = "";
          String Q = "";
          String first = "";
          for(int i = 0; i < N; i++){
            first += String.valueOf(i+1);
            P += getStr();
          }
          for(int i = 0; i < N; i++){
            Q += getStr();
          }
          int Pno = 0;
          int count = 1;
          if(first.equals(P)){
            Pno = count;
          }
          int Qno = 0;
          if(first.equals(Q)){
            Qno = count;
          }
          myerr(P);
          myerr(Q);
          while(Pno == 0 || Qno == 0){
            count++;
            first = nextPermutation(first);
            if(first.equals(P)){
              Pno = count;
            }
            if(first.equals(Q)){
              Qno = count;
            }
          }
          myout(Math.abs(Pno - Qno));
        }
        //便利メソッド追加枠ここから
static String nextPermutation (String s) {

	ArrayList<Character> list = new ArrayList<>();
	for (int i=0; i<s.length(); i++) list.add(s.charAt(i));

	int pivotPos = -1;
	char pivot = 0;
	for (int i=list.size()-2; i>=0; i--) {
		if (list.get(i) < list.get(i+1)) {
			pivotPos = i;
			pivot = list.get(i);
			break;
		}
	}

	if (pivotPos==-1 && pivot==0) return "Final";

	int L = pivotPos+1, R = list.size()-1;
	int minPos = -1;
	char min = Character.MAX_VALUE;
	for (int i=R; i>=L; i--) {
		if (pivot < list.get(i)) {
			if (list.get(i) < min) {
				min = list.get(i);
				minPos = i;
			}
		}
	}

	Collections.swap(list, pivotPos, minPos);
	Collections.sort(list.subList(L, R+1));

	StringBuilder sb = new StringBuilder();
	for (int i=0; i<list.size(); i++) sb.append(list.get(i));

	return sb.toString();

}
        //便利メソッド追加枠ここまで
}
