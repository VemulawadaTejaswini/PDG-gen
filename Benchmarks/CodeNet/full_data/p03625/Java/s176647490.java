import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void myout(Object text){System.out.println(text);}
	public static String getStr(){return sc.next();}
	public static int getInt(){return sc.nextInt();}
	public static Long getLong(){return sc.nextLong();}
	public static boolean isNext(){return sc.hasNext();}
	public static void main(String[] args){
		//String tmp = getStr();
		//int tmp = getInt();
		//Long tmp = getLong();
      int N = getInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i < N; i++){
        list.add(getInt());
      }
      Collections.sort(list,Comparator.reverseOrder());
      //同じ値が2個*2種類、または4個*1種類出現していればひとまず問題ない
      
      ArrayList<Integer> hindo = new ArrayList<Integer>();
      int[] countList = new int[100000];
      Arrays.fill(countList,0);
      int counter = 0;
      for(int i = 0; i < N; i++){
        int tmp = list.get(i);
        if(i == 0){
          hindo.add(tmp);
          countList[0] = 1;
          continue;
        }
        if(hindo.get(counter) == tmp){
          countList[counter]++;
        }else{
          hindo.add(tmp);
          countList[counter + 1]++;
          counter++;
        }
      }
      int fourCount = -1;
      int twoCount1 = -1;
      int twoCount2 = -1;
      Long fourMen = new Long(-1);
      Long twoMen = new Long(-1);
      for(int i = 0; i < N; i++){
        if(countList[i] >= 4){
          Long tmpLong = new Long(hindo.get(i));
          fourMen = tmpLong * tmpLong;
          break;
        }
      }
      for(int i = 0; i < N; i++){
        if(countList[i] >= 2){
          if(twoCount1 == -1){
            twoCount1 = hindo.get(i);
            continue;
          }else if(twoCount2 == -1){
            twoCount2 = hindo.get(i);
            twoMen = new Long(twoCount1) * new Long(twoCount2);
            break;
          }
        }
      }
      if(fourMen != -1 && twoMen != -1){
        myout(Math.max(fourMen, twoMen));
      }else if(fourMen != -1 && twoMen == -1){
        myout(fourMen);
      }else if(fourMen == -1 && twoMen != -1){
        myout(twoMen);
      }else{
        myout(0);
      }
      //myout(list);
      //myout(fourMen);
      //myout(twoMen);
	}
}
