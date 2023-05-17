public class func{
public void setUpEditor(File file){
    IEditorPart editor= EditorUtility.openInEditor(new ExternalTranslationUnit(fCProject, file.toURI(), CCorePlugin.CONTENT_TYPE_CXXSOURCE));
    assertNotNull(editor);
    assertTrue(editor instanceof CEditor);
    fEditor= (CEditor) editor;
    fTextWidget= fEditor.getViewer().getTextWidget();
    assertNotNull(fTextWidget);
    fAccessor= new Accessor(fTextWidget, StyledText.class);
    fDocument= fEditor.getDocumentProvider().getDocument(fEditor.getEditorInput());
    assertNotNull(fDocument);
}
}
