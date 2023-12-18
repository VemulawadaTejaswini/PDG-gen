class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line[] = new int[2];
		int count=0;
		int area=1;
		int around=0;
		String s = br.readLine();
		String[] strArray = s.split(" ");
		try{
		for(int i=0;i<strArray.length;i++){
			if(strArray[i] !=" "){
				line[count]=Integer.parseInt(strArray[i]);
				count++;
			}
		}
		for(int i=0;i<line.length;i++){
			area = area * line[i];
			around = around + 2*line[i];
		}
		System.out.println(area + " " + around);
		}catch(ArrayIndexOutOfBoundsException e){
		}
	}
}
