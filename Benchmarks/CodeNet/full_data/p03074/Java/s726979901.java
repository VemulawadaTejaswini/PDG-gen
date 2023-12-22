import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
        String[] line = new String[num];
        line = s.split("");
		//System.out.println(line.length);
        String former = line[0];
        int check = 0;
        int count = 1;
        int count2 = 0;
        int index = 0;
        int sum = 0;
        int max = 0;
        int temp = 0;
        List<Integer> counter = new ArrayList<Integer>();
        List<Integer> counter2 = new ArrayList<Integer>();
        if(line[0].equals("0")) check = 1;
        if(line.length == 1) {
            counter.add(count);
            counter2.add(count);
        }
        for(int i=1; i<num; i++){
          if(line[i].equals(former)){
            count++;
          }
          else{
            check++;
            count++;
            if(line[i].equals("0")) former = "0";
            else former = "1";
          }
          if(check == 2) count2++;
          if(check == 3){
            counter.add(count-1);
            counter2.add(count-1-temp);
            count = count2+1;
            temp = count2;
            count2 = 0;
            check = 1;
          }
          if(i+1 >= num) {
            counter.add(count);
            counter2.add(count-temp);
            break;
          }
        }
        temp = 0;
        //System.out.println("size="+counter.size());
        while(true){
          temp = index;
          //System.out.println("index="+index+", value="+counter.get(index));
          sum += counter.get(index);
          index++;
          for(int j=1; j<k; j++){
             //System.out.println("index="+index+", value="+counter2.get(index));
             sum += counter2.get(index);
             index++;
             if(index+k > counter2.size()) break;
          }
          //sum -= k-1;
          if(max < sum) max = sum;
          sum = 0;
          index = temp + 1;
        }
        if(max == 0) max = counter.get(0);
        System.out.println(max);
	}
}