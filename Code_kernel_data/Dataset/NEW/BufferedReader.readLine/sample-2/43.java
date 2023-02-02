//43
public class func{
public void writeTreeWithOneChild(){
        Tree<String> tree = new Tree<String>("root");
        tree.addChild("child");
        BufferedReader reader = read(tree);
        assertEquals("root"     , reader.readLine());
        assertEquals("+- child" , reader.readLine());
}
}
