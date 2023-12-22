import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        List<Integer> array = new ArrayList<Integer>();
        array.add(0);
        int sumB = 0;
        int sumW = 0;
        int countB = 0;
		int countW = 0;
		int index = 0;
		int check = 0;
		int min = 999;
for(int i=0; i<num-1; i++){
  if(line[i].equals("#")) countB++;
  else if(line[i].equals(".")) {
    countW++;
    check = 1;
  }
  if((line[i+1].equals("#") && check == 1) || (line[i+1].equals(".") && i == num-2)) {
    if(line[i+1].equals(".") && i == num-2) countW++;
    sumB += countB;
    sumW += countW;
    min = array.get(0)+countW; 
  array.add(sumB);
  index=0;
  countB=0;
  countW=0;
  check = 0;
  }
}
for(int a: array){
      a += sumW;
      array.set(index, a);
      index++;
      if(a < min) min = a;
    }
System.out.println(sumB <= min ? sumB : min);
	}
}



