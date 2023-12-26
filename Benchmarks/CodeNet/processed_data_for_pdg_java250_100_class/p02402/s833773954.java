class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        int size = Integer.parseInt(s);
        long min = 0,max = 0,sum = 0;
        s = r.readLine();
        String[] strData = s.split(" ");
        for (int count = 0; count < size; count++){
        		long tmp = Long.parseLong(strData[count]);
        		if(count == 0){
        			min = max = sum = tmp;
        		} else {
        			if (min > tmp) {
        				min = tmp;
        			}
        			if (max < tmp) {
        				max = tmp;
        			}
        			sum += tmp;
        		}
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
        System.out.print(" ");
        System.out.print(sum);
        System.out.print("\n");
    }
}
