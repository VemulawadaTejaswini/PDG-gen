public class A{
	public static TreePath getPathForStrings(JTreeFixture treeFixture,String[]path){
		
		JTree tree = treeFixture.targetCastedTo(JTree.class);
		BasicJTreeCellReader rdr = new BasicJTreeCellReader();
		TreeModel mdl = tree.getModel();
		
		
		Object parent = mdl.getRoot();
		TreePath returnPath = new TreePath(parent);
		for(int i=0;i<path.length;i++){
			boolean found=false;
			for(int iChild=0;!found&&iChild<mdl.getChildCount(parent);iChild++){
				Object val = mdl.getChild(parent,iChild);
				String lbl = rdr.valueAt(tree,val);
				if(path[i].equals(lbl)){
					returnPath = returnPath.pathByAddingChild(val);
					parent = val;
					found=true;
				}
			}
			if(!found){
				throw new IllegalArgumentException("Couldn't find path"+Arrays.asList(path)+", stopped at level "+i);
			}
		}
		return returnPath;
	}
}