public class A{
	private void updateDependenciesOnNodeAppearanceItself(Collection set,TreeSource model, TreePath el, Object[] childs) {
		TreeNodeSelection tns = null;
		if (childs == null || childs.length == 0) {
			tns = TreeNodeSelection.createTreeNodeSelection(model, el);
			set.add(tns);
		} else {
			for (int i = 0; i < childs.length; i++) {
				tns = TreeNodeSelection.createTreeNodeSelection(model, el.pathByAddingChild(childs[i]));
				set.add(tns);
			}
		}
	}
}