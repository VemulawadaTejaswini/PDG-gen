public class A{
	private TreePath getCommonAncestor(Object[] p1, Object[] p2) {
		TreePath result = new TreePath(p1[0]);
		if(p1[0] != p2[0]) throw new IllegalArgumentException("root not common:" + new TreePath(p1) + ", " + new TreePath(p2));
		for(int i = 1; ; i++) {
			if(i >= p1.length || i >= p2.length)return result;
			if(p1[i] != p2[i])return result;
			elseresult = result.pathByAddingChild(p1[i]);
		}
	}
}