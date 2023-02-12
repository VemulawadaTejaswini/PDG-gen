public class func{
public void exec(Tuple input){
            DataInputStream in = fs.open(new Path(lookupFile));
            while ((line = in.readLine()) != null) {
                String[] toks = new String[2];
                toks = line.split(":", 2);
                lookup.put(toks[0], toks[1]);
            }
            in.close();
}
}
