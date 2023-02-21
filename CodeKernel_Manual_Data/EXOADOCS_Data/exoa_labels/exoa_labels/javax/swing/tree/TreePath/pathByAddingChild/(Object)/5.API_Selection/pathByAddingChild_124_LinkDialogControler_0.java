public class A{
	private void setSelected(Link link){
		TreePath selectionPath = new TreePath(view.getTree().getModel().getRoot());
		if(link.getPathElementType(link.getPathLength()-1).equals(AssetValue.TYPE)){
			
			TreePath rootPath = new TreePath(view.getTree().getModel().getRoot());
			
			if(link.getPathElementType(link.getPathLength()-2).equals(ScoValue.TYPE)){
				ScoHome scoHome = (ScoHome)InterfaceRegistry.getImplementation(ScoHome.class);
				if(scoHome != null){
					Sco sco = null;
					try {
						sco = scoHome.findById(link.getPathElementID(link.getPathLength()-2));
					} catch (ObjectNotFoundException e) {
						log.error(e.toString(), e);
					}
					if(sco != null){
						TreePath tempPath =  ((LinkDialogTreeModel)view.getTree().getModel()).getPathforObject(rootPath, sco);
						if(tempPath != null){
							rootPath = tempPath;
						}
					}
				}
			}
			
			selectionPath = ((LinkDialogTreeModel)view.getTree().getModel()).getPathforObject(rootPath, link.getPathElementID(link.getPathLength()-1));
			
		}
		else{
			
			for(int i = 0; i < link.getPathLength(); i++){
				if(link.getPathElementType(i).equals(WorkspaceValue.TYPE)){
					WorkspaceHome wspHome = (WorkspaceHome)InterfaceRegistry.getImplementation(WorkspaceHome.class);
					Workspace wsp = null;
					try {
						wsp = wspHome.findById(link.getPathElementID(i));
					} catch (ObjectNotFoundException e) {
						log.error(e.toString(), e);
					}
					if(wsp != null)selectionPath = selectionPath.pathByAddingChild(wsp);
				}
				if(link.getPathElementType(i).equals(StructureDefinitionValue.TYPE)){
					StructureDefinitionHome sdHome = (StructureDefinitionHome)InterfaceRegistry.getImplementation(StructureDefinitionHome.class);
					StructureDefinition definition = null;
					try {
						definition = sdHome.findById(link.getPathElementID(i));
					} catch (ObjectNotFoundException e) {
						log.error(e.toString(), e);
					}
					if(definition != null)selectionPath = selectionPath.pathByAddingChild(definition);
				}
				if(link.getPathElementType(i).equals(StructureElementValue.TYPE)){
					StructureElementHome seHome = (StructureElementHome)InterfaceRegistry.getImplementation(StructureElementHome.class);
					StructureElement element = null;
					try {
						element = seHome.findById(link.getPathElementID(i));
					} catch (ObjectNotFoundException e) {
						log.error(e.toString(), e);
					}
					if(element != null){
						LinkDialogTreeModel model = (LinkDialogTreeModel)view.getTree().getModel();
						for(Iterator it = model.glossaryElementsMap.keySet().iterator(); it.hasNext();){
							Object o = it.next();
							if(((ArrayList)model.glossaryElementsMap.get(o)).contains(element)){
								selectionPath = selectionPath.pathByAddingChild(o);
							}
						}
					}
					selectionPath = selectionPath.pathByAddingChild(element);
				}
			}
		}
	}
}