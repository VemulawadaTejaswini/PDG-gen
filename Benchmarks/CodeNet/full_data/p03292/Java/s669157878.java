import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int[] task = new int[3];
	    List<Integer> taskS = new ArrayList<Integer>();
	    int Answer;
	    for(int i = 0; i < 3; i++){
		task[i] = scan.nextInt();
		    taskS.add(task[i]);
	    }
	    Collections.sort(taskS);
	    Answer = taskS.get(1)-taskS.get(0)
		+ taskS.get(2)-taskS.get(1);
	    System.out.println(Answer);
	}

	
    }
