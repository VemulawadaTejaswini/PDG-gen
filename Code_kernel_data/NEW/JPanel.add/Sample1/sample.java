//0
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.createNamePanel()#2{
    theNamePanel.add( new JLabel( Messages.getString( "EditGroupDetailsDialog.Name" ) ) );
    theNamePanel.add( nameTextField );
}
}
//1
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.createAliasPanel()#2{
    panel.add( new JLabel( Messages.getString( "FontPropertiesPane.AntiAliasing" ) ) );
}
}
//2
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.createContentPane()#0{
    final JLabel theSheetLabel = new JLabel( Messages.getString( "SheetSelectorDialog.ChooseSheet" ) );
    centerPanel.add( sheetsComboBox );
}
}
//3
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.createContentPane()#2{
    panel.add( new JLabel( Messages.getString( "SystemParameterDialog.Available" ) ), BorderLayout.NORTH );
}
}
//4
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class840.newFieldPanel(String label,Component c,String trailingLabel)#2{
    if (!StringUtils.isEmpty(trailingLabel)) {
      panel.add(new JLabel(trailingLabel));
    }
}
}
//5
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createCenterPanel()#1{
    if (myDescription != null) {
      panel.add(new JLabel(myDescription), BorderLayout.NORTH);
    }
}
}
//6
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.createCenterPanel()#0{
      if (!title.isEmpty()) {
        panel.add(new JLabel(title), BorderLayout.SOUTH);
      }
}
}
//7
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.build(String orig)#0{
        p.add(new JLabel(tr("Key: {0}", entry.getKey())), GBC.eol().insets(0, 0, 5, 0));
        p.add(new JLabel(tr("Value: ")), GBC.std());
}
}
//8
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.build(String orig)#1{
        p.add(new JLabel(tr("Value: ")), GBC.std());
}
}
//9
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.addToPanel(JPanel p,Collection<OsmPrimitive> sel,boolean presetInitiallyMatches)#0{
            p.add(new JLabel(" "), GBC.eol()); // space
            p.add(new JLabel(locale_text), GBC.eol());
}
}
//10
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.addToPanel(JPanel p,Collection<OsmPrimitive> sel,boolean presetInitiallyMatches)#1{
            p.add(new JLabel(locale_text), GBC.eol());
            p.add(new JLabel(" "), GBC.eol()); // space
}
}
//11
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createCenterPanel()#2{
    panel.add(new JLabel("Put a stacktrace here:"), BorderLayout.NORTH);
}
}
//12
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createNorthPanel()#1{
    sourceClassPanel.add(new JLabel("Delegating field"), BorderLayout.NORTH);
    sourceClassPanel.add(fieldNameLabel, BorderLayout.CENTER);
}
}
//13
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createStepPanel()#1{
    stepPanel.add(new JLabel(this.getDescription()), this.createConstraint(0, 0));
}
}
//14
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createCommitMessageWrapper()#1{
    commitMessageWrapper.add(new JLabel("Commit Message:"), BorderLayout.NORTH);
}
}
//15
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createUsernameInput()#0{
        topPanel.add(new JLabel("Description:  "));
}
}
//16
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.buildTopPanel()#1{
        pnl.add(new JLabel(tr("<html>Please select the changesets you want to close</html>")), BorderLayout.CENTER);
}
}
//17
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.setButtonComponent(@NotNull ActiveComponent component)#0{
    panel.add(new JLabel(" "), BorderLayout.WEST);
}
}
//18
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.createErrorPanel(String pluginClass,Exception exc)#1{
    panel.add(new JLabel("<html><font color=#ff0000>Failed to load plugin: " + exc.getMessage() + " (" + exc.getClass().getSimpleName() + ")</font></html>"), new GridBagConstraints(0,0,1,1,1,0,GridBagConstraints.FIRST_LINE_START, GridBagConstraints.HORIZONTAL, new Insets(0,10,0,0), 0, 0));
}
}
//19
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.layoutVertical(final JPanel panel)#3{
      borderPanel.add(new JLabel(language.getID()), BorderLayout.NORTH);
      borderPanel.add(slider, BorderLayout.CENTER);
}
}
//20
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class440.constructLabeledComponent(String aLabelText,JComponent aComponent,@JdkConstants.BoxLayoutAxis int aAxis)#1{
    result.add(new JLabel(aLabelText));
    result.add(aComponent);
}
}
//21
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class380.getComponentPanel(final String text,final java.awt.Component component)#0{
        mp.add(new JLabel(text));
}
}
//22
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class380.getComponentPanel(final String text,final java.awt.Component component)#3{
        mp.add(new JLabel(" "));
        mp.add(component);
        mp.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
}
}
//23
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.EmptyInspector()#2{
                JLabel titleLabel = new JLabel("Inspector");
                titlebar.add(titleLabel);
                titleLabel.setForeground(FOREGROUND_COLOR);
}
}
//24
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.testContainsLabel()#1{
    jPanel.add(new JLabel("Some text"));
    Panel panel = new Panel(jPanel);
    assertTrue(panel.containsLabel("Some text"));
    assertTrue(panel.containsLabel("text"));
    assertFalse(panel.containsLabel("unknown"));
}
}
//25
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class360.addHeavyLabel(final JPanel thePanel,final GridBagConstraints theCons){
      thePanel.add( new JLabel("") , theCons);
}
}
//26
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.createPanelWithLabel(String labelText,Component rightSideComponent)#1{
        innerPanel.add(new JLabel(labelText));
        innerPanel.add(rightSideComponent);
}
}
//27
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.getPanel()#2{
        JLabel labelEx = new JLabel("This can be turned off any time in UI settings.");
        panel.add(labelEx);
}
}
//28
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.createPanel()#2{
            page.add(new JLabel("X:"), "skip");
}
}
//29
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.createLoadingPanel()#1{
        container.add(new JLabel(loadingIndicator), BorderLayout.NORTH);
}
}
//30
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.createLoadingPanel()#2{
        container.add(new JLabel(working), BorderLayout.CENTER);
}
}
//31
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.BinomialParametersPanel()#3{
        wrapper.add(new JLabel("No. Trials: "));
}
}
//32
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.BinomialParametersPanel()#4{
        wrapper.add(new JLabel("Probability: "));
}
}
//33
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.buildZoomLevelPanel()#0{
            pnl.add(new JLabel(tr("Zoom level:")));
}
}
//34
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.createServicePanel()#3{
        final JLabel ieDriverServiceLabel = new JLabel("Path to Internet Explorer Driver");
        ieServicePanel.add(ieDriverServiceLabel);
}
}
//35
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.createControlPanel()#1{
            panel.add(new JLabel(DECIMAL_DIALOG_LABEL), "gap related");
}
}
//36
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class390.createCodeEditorPanel()#2{
    p.add(new JLabel("Source code:"), BorderLayout.NORTH);
}
}
//37
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class80.getObject()#1{
        for (String name : NAMES) {
            panel.add(name, new JLabel(name));
        }
}
}
//38
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class80.buildSendTimeout()#0{
        panel.add(new JLabel("ms"));
}
}
//39
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class80.buildSendTimeout()#1{
        panel.add(new JLabel("Send Timeout:"));
        panel.add(sendTimeoutField);
}
}
//40
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)#1{
            panel.add(new JLabel(value.toString()),BorderLayout.CENTER);
            panel.add(triangleLabel,BorderLayout.EAST);
            panel.setBackground(Color.WHITE);
}
}
//41
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.componentFor(Object o)#1{
        panel.add(new JLabel(tc.transformer.toString()));
}
}
//42
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.DvcsStrategyPanel()#0{
    JLabel referenceStrategyLabel = new JLabel("Push Reference Strategy: ");
    bottomPanel.add(myReferenceStrategyCombobox);
    add(bottomPanel, BorderLayout.WEST);
}
}
//43
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.createURLPanel()#2{
        panel.add(new JLabel("URL"), BorderLayout.WEST);
}
}
//44
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.ExponentialParametersPanel()#2{
        wrapper.add(new JLabel("Rate: "));
}
}
//45
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.main(String[] args)#2{
      panel.add(new JLabel(VueResources.getString("jlabel.deletingthisslide")));
}
}
//46
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.createDetailTextArea()#0{
        JLabel detailLabel = new JLabel("Details");
        detailPanel.add(detailLabel, BorderLayout.NORTH);
}
}
//47
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.addField(final JPanel content,final GridBagConstraints gbc,final String text,final String value,final String unit)#1{
            content.add(new JLabel(unit), gbc);
}
}
//48
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.addField(final JPanel content,final GridBagConstraints gbc,final String text,final String value,final String unit)#2{
            content.add(new JLabel(text), gbc);
}
}
//49
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.GaussianParametersPanel()#1{
        wrapper.add(new JLabel("Standard Deviation: "));
}
}
//50
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.GaussianParametersPanel()#3{
        wrapper.add(new JLabel("Mean: "));
}
}
//51
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#0{
    panel.add(new JLabel(SvnBundle.message("label.ssl.server.provided.certificate")), BorderLayout.NORTH);
}
}
//52
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#0{
    panel.add(new JLabel(Messages.getQuestionIcon()), BorderLayout.WEST);
}
}
//53
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#1{
    panel.add(new JLabel(myMessage));
}
}
//54
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class520.createCenterPanel()#2{
        JLabel label = new JLabel(message);
        panel.add(label, gbc);
}
}
//55
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class580.createPanel()#3{
    textWithComboPanel.add(new JLabel(ApplicationBundle.message("arrangement.settings.additional.force.combobox.name")));
}
}
//56
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createDescriptionPanel()#0{
        descriptionPanel.add(new JLabel("Description"), BorderLayout.NORTH);
}
}
//57
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.FileSelectionPatternDialog(String defaultPattern,Window parent)#0{
        contentPane.add(new JLabel("Pattern:"), BorderLayout.WEST);
}
}
//58
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.FileSelectionPatternDialog(String defaultPattern,Window parent)#3{
        contentPane.add(new JLabel("Please define a file selection pattern. For example '*.nc'"), BorderLayout.NORTH);
}
}
//59
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.addCustomControls(JPanel panel)#1{
    panel.add(new JLabel("Project "), BorderLayout.WEST);
}
}
//60
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.createPatternListPane(final String labelText,final String[] patterns)#2{
        pane.add(BorderLayout.NORTH, new JLabel(labelText));
        pane.add(BorderLayout.CENTER, scrollableList);
}
}
//61
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class640.createCenterPanel()#0{
    panel.add(new JLabel("Replace this fragment?"));
}
}
//62
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.addMillisDescription(@NotNull JSpinner spinner)#0{
    panel.add(new JLabel("ms"));
}
}
//63
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.createCenterPanel()#1{
    final JLabel label = new JLabel(RefactoringBundle.message("moveInstanceMethod.select.an.instance.parameter"));
    panel.add(label, BorderLayout.NORTH);
}
}
//64
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.addLabel(JPanel p,Icon icon,String label)#1{
            p.add(new JLabel(label, icon, JLabel.LEADING), GBC.eol().fill(GBC.HORIZONTAL));
}
}
//65
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.createContentPane()#1{
    headerPanel.add( new JLabel( EditorExpressionsMessages.getString( "ExpressionEditorDialog.SelectedExpression" ) ) );
    headerPanel.add( expressionEditor );
}
}
//66
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class810.createSouthPanel()#0{
    statusPanel.add(statusText = new JLabel(SSRBundle.message("status.message")), BorderLayout.WEST);
}
}
//67
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class810.createSouthPanel()#2{
    statusPanel.add(status = new JLabel(), BorderLayout.CENTER);
}
}
//68
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.createKeySigPanel(PGPPublicKey key)#0{
        Iterator<?> iter = key.getSignatures();
        while (iter.hasNext()) {
            PGPSignature sig = (PGPSignature)iter.next();
            String uid = "0x"+Long.toHexString(sig.getKeyID()).substring(8).toUpperCase();
            p.add(new JLabel(uid));
        }
}
}
//69
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class670.addUnits(JPanel panel)#0{
            panel.add(new JLabel(_msgmgr.getBundle(_property.getMessageBundle()).xlate(units)));
}
}
//70
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.addToPanel(JPanel p,Collection<OsmPrimitive> sel,boolean presetInitiallyMatches)#2{
            p.add(new JLabel(" "), GBC.eol()); // space
}
}
//71
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.UniformParametersPanel()#2{
        wrapper.add(new JLabel("Maximum: "));
}
}
//72
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.UniformParametersPanel()#3{
        wrapper.add(new JLabel("Minimum: "));
}
}
//73
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildUpdateIntervalPanel()#2{
        pnl.add(lblUpdateInterval = new JLabel(tr("Update interval (in days):")));
}
}
//74
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.createCombinePanel()#0{
        final JComboBox combineComboBox = new JComboBox();
        bindingCtx.bind("combine", combineComboBox);
        bindingCtx.bindEnabledState("combine", false, "updateMode", true);
        final String displayName = bindingCtx.getPropertySet().getDescriptor("combine").getDisplayName();
        combinePanel.add(new JLabel(displayName + ":"));
        combinePanel.add(combineComboBox);
}
}
//75
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.buildComparePairSelectionPanel()#0{
        p.add(new JLabel(tr("Compare ")));
}
}
//76
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class430.createBRUrlPanel()#2{
    panel.add(new JLabel("URL(s)"));
}
}
