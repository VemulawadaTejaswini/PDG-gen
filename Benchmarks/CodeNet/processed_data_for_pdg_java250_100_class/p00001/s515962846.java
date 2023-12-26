class Main{
    public static void main(String[] a) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	int[] data = new int[10];
        	for (int i=0; i<data.length; i++) {
        		String line = br.readLine();
        		int value = Integer.parseInt(line);
        		data[i] = value;
        	}
        	Arrays.sort(data);
        	System.out.println(data[9]);
        	System.out.println(data[8]);
        	System.out.println(data[7]);
        }
    }
}
