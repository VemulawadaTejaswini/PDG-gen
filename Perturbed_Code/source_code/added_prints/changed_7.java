public class func {
    public void execCmd(File wd, String[] cmdWithArguments, StringBuffer out) {
        System.out.println("Hi 1");
        Reader reader = new InputStreamReader(p.getInputStream());
        System.out.println("Hi 2");
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Hi 3");
        while ((readChar = input.read()) != -1) {
            System.out.println("Hi 4");
            out.append((char) readChar);
        }
        input.close();
    }
}
