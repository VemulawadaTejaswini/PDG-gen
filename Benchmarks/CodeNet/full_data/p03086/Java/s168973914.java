import java.util.Scanner;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = S.split("");

        int max = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (max2 > max) {
        		max = max2;
        	}
        	max2 = 0;
        	if (arr[i].equals("A") || arr[i].equals("C") || arr[i].equals("G") || arr[i].equals("T") ) {
        		max2++;
//        		System.out.println("arr[i]" + arr[i] + i);
        		for (int j = i+1; j < arr.length; j++) {
        			if (arr[j].equals("A") || arr[j].equals("C") || arr[j].equals("G") || arr[j].equals("T") ) {
        				//System.out.println("arr[j]"+arr[j] + j);
        				max2++;
        			} else {
        				if (max2 > max) {
        	        		max = max2;
        	        	}
        				break;
        			}
            	}
        		if (max2 > max) {
	        		max = max2;
	        	}
        	}
        }
//        if ((max == 0)&& arr[arr.length-1].equals("A") || arr[arr.length-1].equals("C") || arr[arr.length-1].equals("G") || arr[arr.length-1].equals("T")) {
//        	++max;
//        }
        System.out.println(max);
    }

}