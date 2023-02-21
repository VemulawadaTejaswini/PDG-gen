public class A{
	private void updateDependenciesOnNodeAppearanceItselfAndAscendants(Collection set, TreeSource model, TreePath el, Object[] childs) {
		//...
		collectAscendantCategories(set, model, el.pathByAddingChild(childs[i]));
	}
}