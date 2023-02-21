public class A{
	private void updateDependenciesOnNodeAppearanceItself(Collection set,TreeSource model, TreePath el, Object[] childs) {
		//...
		tns = TreeNodeSelection.createTreeNodeSelection(model, el.pathByAddingChild(childs[i]));
	}
}