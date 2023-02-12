public class func{
public void parseKeyStrokes(BufferedReader in){
        while ((line = in.readLine()) != null) {
            char ch = line.charAt(0);
            String keyStrokeSpec = line.substring(2);
            keyStrokes.put(ch, KeyStroke.getKeyStroke(keyStrokeSpec));
        }
}
}
