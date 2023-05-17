public class func{
public void getSchema(String location,Job job){
        DataInputStream in = fs.open(new Path(location + "/_schema"));
        String line = in.readLine();
        in.close();
            new ResourceSchema(Utils.getSchemaFromString(line));
        if (s == null) {
            throw new IOException("Unable to parse schema found in file " +
                location + "/_schema");
        }
}
}
