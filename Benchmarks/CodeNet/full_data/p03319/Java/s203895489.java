public class Main{

    public static void main(String[] args){
        int i;
        int[] list = new int[Integer.parseInt(args[0]) + 2];

        for(i = 2;i - 2 < Integer.parseInt(args[0]);i++){
            list[i] = Integer.parseInt(args[i]);
        }
		    int min = list[2];
		    for (int j = 2; j < Integer.parseInt(args[0]) + 2; j++) {
			       if (min > list[j]) {
				           min = list[j];
			       }
		    }
        int ans = (Integer.parseInt(args[0]) - 1) / (Integer.parseInt(args[1]) - 1) + 1;
        System.out.println(ans);
    }

}
