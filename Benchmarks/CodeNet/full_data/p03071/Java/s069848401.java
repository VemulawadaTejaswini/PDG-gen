class Main {
	public static void main(String[] args) {
    	String line = System.console().readLine();
      	String[] inputs = line.split(" ");
      	int a = Integer.parseInt(inputs[0]);
      	int b = Integer.parseInt(input[1]);
      	
      	if (a == b) {
        	return a + b;
        } else {
        	return Math.max(a, b) * 2 - 1;
        }
    }
}
