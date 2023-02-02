//105
public class func{
	public void parseCathNames(BufferedReader bufferedReader){
        while ( (line = bufferedReader.readLine()) != null ) {
            if ( line.startsWith("#") ) continue;
            CathNode cathNode = parseCathNamesFileLine(line);
            cathTree.put(cathNode.getNodeId(), cathNode);
        }
}
}
