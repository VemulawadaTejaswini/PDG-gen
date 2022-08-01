//9
public class func{
	public void main(String[] args){
    BufferedReader reader = new BufferedReader(new FileReader(args[0]));
    while ((line = reader.readLine()) != null) {
      BasicNode tree = (BasicNode)Serialization.deserialize(line);
      System.out.println(tree);
    }
    reader.close();
}
}
