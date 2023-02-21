public class A{
	private void updateDependenciesOnNodeAppearanceItselfAndAscendants(Collection set, TreeSource model, TreePath el, Object[] childs) {
		TreeNodeSelection tns = null;
		if (childs == null || childs.length == 0) {
			tns = TreeNodeSelection.createTreeNodeSelection(model, el);
			set.add(tns);
			collectAscendantCategories(set, model, el);
		} else {
			for (int i = 0; i < childs.length; i++) {
				tns = TreeNodeSelection.createTreeNodeSelection(model, el.pathByAddingChild(childs[i]));
				set.add(tns);
				collectAscendantCategories(set, model, el.pathByAddingChild(childs[i]));
			}
		}
	}
}