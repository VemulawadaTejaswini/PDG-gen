import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String in = scan.next();
        scan.close();
        LinkedList<Character> list = new LinkedList<Character>();
        char[] inputs = in.toCharArray();
        for(int i=0;i<in.length();i++){
          list.add(inputs[i]);
        }
        //System.out.println(list);
        
        int result = 0;
        char prev;
        char latter;
        for(int pointer=0;pointer<list.size()-1;pointer++){
          //System.out.println(pointer);
          //System.out.println(in);
          prev = list.get(pointer);
          latter = list.get(pointer+1);
          if(prev!=latter){
            result = result+2;
            //System.out.println(in.substring(pointer+2,in.length()));
            list.remove(pointer+1);
            list.remove(pointer);
            if(pointer!=0)pointer=pointer-2;
            //System.out.println(in);
          }
        }
      System.out.println(result);
      
	}
}