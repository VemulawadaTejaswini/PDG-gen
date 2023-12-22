class  Main{
   public static void main(String[] args){
   	Scanner input = new Scanner(System.in);
   	int n = input.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
        	String s = input.next();
            list.add(s);
        }
   		list.toString();
        Collections.reverse(list);
			String separator = " ";
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
        	if(sb.length() > 0){
        		sb.append(separator);
        	}
            sb.append(str);
        }
   	System.out.println(sb.toString());
   }
}
