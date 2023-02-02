//0
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.addAlignCenter(JComponent target,JPanel owner)#0{
    p.add(Box.createHorizontalGlue());
    p.add(target);
    p.add(Box.createHorizontalGlue());
    owner.add(p);
}
}
//1
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class470.buildActions(CControl control,MultipleCDockableFactory<DefaultMultipleCDockable,?> factory)#0{
    panel.add( buildAction( "Red", new AddDockableAction( control, factory, Color.RED, new Path( "custom", "red" ))));
    panel.add( buildAction( "Green", new AddDockableAction( control, factory, Color.GREEN, new Path( "custom", "green" ))));
    panel.add( buildAction( "Blue", new AddDockableAction( control, factory, Color.BLUE, new Path( "custom", "blue" ))));
    panel.add( buildAction( "Yellow", new AddDockableAction( control, factory, Color.YELLOW, new Path( "custom", "yellow" ))));
    panel.add( buildAction( "Magenta", new AddDockableAction( control, factory, Color.MAGENTA, new Path( "custom", "magenta" ))));
    panel.add( buildAction( "Cyan", new AddDockableAction( control, factory, Color.CYAN, new Path( "custom", "cyan" ))));
}
}
//2
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class830.buildMainPanel()#1{
        main.add(taInfo, CC.xy(1, 1, "f, t"));
        main.add(lbCurrentProcess, CC.xy(1, 3));
        main.add(pbProgress, CC.xy(1, 5));
}
}
//3
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.createButtonsPanel()#0{
        panel.add(findButton = buttonFactory.createJButton("FindButton"));
        panel.add(clearButton = buttonFactory.createJButton("ClearButton"));
        panel.add(closeButton = buttonFactory.createJButton("CloseButton"));
}
}
//4
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel()#1{
        panel.add(wizardComponents.getBackButton());
        panel.add(wizardComponents.getNextButton());
        panel.add(wizardComponents.getFinishButton());
        panel.add(wizardComponents.getCancelButton());
}
}
//5
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.buildOptions(JPanel searchOptions)#0{
    searchOptions.add(UIUtil.createOptionLine(formatAccordingToStyle = new JCheckBox(
      CodeInsightBundle.message("dialog.edit.template.checkbox.reformat.according.to.style"), true)));
    searchOptions.add(UIUtil.createOptionLine(useStaticImport = new JCheckBox(
      CodeInsightBundle.message("dialog.edit.template.checkbox.use.static.import"), true)));
}
}
//6
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.createCBPanel()#0{
    myCbIsFinal = new JCheckBox(UIUtil.replaceMnemonicAmpersand("Declare &final"));
    panel.add(myCbIsFinal);
    myCbReplaceAllOccurrences = new JCheckBox(UIUtil.replaceMnemonicAmpersand("Replace &all occurrences"));
    panel.add(myCbReplaceAllOccurrences);
}
}
//7
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.addGui(PreferenceTabbedPane gui)#3{
            panel.add(new JLabel(tr("Firefox executable")), GBC.std().insets(10,5,5,0));
            panel.add(firefox, GBC.eol().insets(0,5,0,0).fill(GBC.HORIZONTAL));
            panel.add(Box.createVerticalGlue(), GBC.eol().fill(GBC.BOTH));
}
}
//8
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.buildMainPanelAboveDownloadSelections(JPanel pnl)#1{
            pnl.add(new JLabel(tr("Overpass query: ")), GBC.std().insets(5, 5, 5, 5));
            GridBagConstraints gbc = GBC.eol().fill();
            pnl.add(scrollPane, gbc);
}
}
//9
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.createPreferenceTabWithScrollPane(PreferenceTabbedPane gui,JPanel panel)#1{
        tab.add(scrollPane, GBC.eol().fill(GBC.BOTH));
        tab.add(GBC.glue(0, 10), a);
}
}
//10
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#0{
        JTextField nameTextField = new JTextField();
        controlPanel.add(nameTextField, BorderLayout.CENTER);
        controlPanel.add(this.buildRenameButton(nameTextField), BorderLayout.EAST);
}
}
//11
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.createServicePanel()#0{
        ieServicePath = new JTextField();
        ieServicePanel.add(ieServicePath);
        browserPanel.add(ieServicePanel);
}
}
//12
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.createEditor()#0{
    panel.add(junitEditorComponent, LayoutUtil.createPanelConstraints(0));
    panel.add(javaEditorComponent, LayoutUtil.createPanelConstraints(1));
}
}
//13
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class150.createEditor()#1{
    panel.add(myMpsStartupSettings, LayoutUtil.createPanelConstraints(0));
    panel.add(plugins, LayoutUtil.createPanelConstraints(1));
}
}
//14
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.addLabeledV(JComponent target,String text,JPanel owner)#1{
    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
    p.add(target);
    owner.add(p);
}
}
//15
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createContent(@NotNull ConsoleView consoleView,@NotNull JstdServerStatusView capturingView)#0{
    JComponent consoleComponent = consoleView.getComponent();
    panel.add(consoleComponent, BorderLayout.CENTER);
    ActionToolbar consoleActionToolbar = createActionToolbar(consoleView);
    consoleActionToolbar.setTargetComponent(consoleComponent);
    panel.add(consoleActionToolbar.getComponent(), BorderLayout.WEST);
}
}
//16
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class60.centerComponent(JComponent component)#0{
      centeringPanel.add( Box.createHorizontalGlue() );
      centeringPanel.add( component );
      centeringPanel.add( Box.createHorizontalGlue() );
}
}
//17
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createParametersPanel()#0{
        paramsPanel.add(Box.createHorizontalGlue());        
        paramsPanel.add(soapAction);
        paramsPanel.add(Box.createHorizontalGlue());        
        paramsPanel.add(maintainSession);
}
}
//18
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class380.addRevertButton(final JPanel panel){
        final JPanel p = new JPanel(new FlowLayout(FlowLayout.TRAILING, 4, 0));
        p.setBackground(Browser.BUTTON_PANEL_BACKGROUND);
        p.add(revertButton);
        panel.add(p, BorderLayout.CENTER);
}
}
//19
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.addTimeFields()#1{
    timePanel.add(new JLabel(" : "));
    timePanel.add(myMinutes);
    timePanel.add(new JLabel(" : "));
    timePanel.add(mySeconds);
    add(timePanel);
}
}
//20
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.addLabeled(JComponent target,String text,JPanel owner)#1{
    p.add(Box.createHorizontalGlue());
    p.add(target);
    owner.add(p);
}
}
//21
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class280.addField(String label,JComponent field,JPanel panel)#0{
    panel.add(jLabel, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.WEST,
                                                 GridBagConstraints.NONE, new Insets(0, 0, 5, 0), 4, 0));
    panel.add(field, new GridBagConstraints(1, GridBagConstraints.RELATIVE, 1, 1, 1.0, 0, GridBagConstraints.NORTHWEST,
                                                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 5, 0), 0, 0));
}
}
//22
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.createButtonsPanel()#0{
        ButtonFactory bf = new ButtonFactory(bundle, this);
        p.add(bf.createJButton("OKButton"));
        p.add(bf.createJButton("CancelButton"));
}
}
//23
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.createButtonsPanel()#0{
            ButtonFactory bf = new ButtonFactory(bundle, this);
            panel.add(bf.createJButton("OKButton"));
            panel.add(bf.createJButton("CancelButton"));
}
}
//24
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.buildCasePanel()#0{
        panel.add(ignoreCaseCheckBox, CC.xy(2, 1));
        panel.add(fuzzyMatchCheckBox, CC.xy(2, 3));
}
}
//25
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildPropertyTestingPanel()#0{
        propertyListPanel.add( this.buildComboBox());
        propertyListPanel.add( this.buildComboBox());
}
}
//26
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.buildPropertyTestingPanel()#0{
        taskListPanel.add( this.buildTextField());
        taskListPanel.add( this.buildTextField());
}
}
//27
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class810.initInputBar(AppD app,boolean showInputTop,JPanel northPanel,JPanel southPanel)#3{
      northPanel.add(gui.getAlgebraInput(), BorderLayout.SOUTH);
      southPanel.add(gui.getAlgebraInput(), BorderLayout.SOUTH);
    ((AlgebraInput) gui.getAlgebraInput()).updateOrientation(showInputTop);
}
}
//28
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.render()#1{
        panel.add(menuButton, Docking.rightTop());
        panel.add(component, Docking.fill());
}
}
//29
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCustomComponent(final Presentation presentation)#0{
      panel.add(new JLabel(IdeBundle.message("label.scope")),
                new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 5, 0, 0), 0, 0));
      panel.add(super.createCustomComponent(presentation),
                new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
}
}
//30
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class470.createThemePanel(String title,Component example)#1{
    Insets insets = new Insets( 5, 5, 5, 5 );
    panel.add( new JLabel( title ), new GridBagConstraints( 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, insets, 0, 0 ));
    panel.add( example, new GridBagConstraints( 0, 1, 1, 1, 1.0, 1000.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0 ));
}
}
//31
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createUsernameInput()#1{
        final JTextField textField = usernameField();
        topPanel.add(textField);
        topPanel.add(submitButton(textField));
        panel.add(topPanel, BorderLayout.NORTH);
}
}
//32
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class360.createNorthPanel()#0{
        panel.add(new JLabel(JetBundle.message("there.are.unused.methods.that.override.methods.you.delete")));
        panel.add(new JLabel(JetBundle.message("choose.the.ones.you.want.to.be.deleted")));
}
}
//33
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class340.createPreviewPanel()#1{
    p.add( new JLabel( messages.getString( "New" ) ) );
    p.add( previewPanel );
    p.add( new JLabel( messages.getString( "Old" ) ) );
}
}
//34
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.addChooseFactoryLabel(JComponent component,boolean top)#1{
    factoryPanel.add(myChooseFactory, top ? BorderLayout.NORTH : BorderLayout.CENTER);
    panel.add(factoryPanel, BorderLayout.WEST);
}
}
//35
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class680.buildGUI()#2{
    p.add(buildViewsBar());
    content.add(p);
}
}
//36
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationContent()#1{
    confMain.add(createReservationDetails(), BorderLayout.SOUTH);
    confCont.add(confMain, BorderLayout.CENTER);
}
}
//37
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.getPopupComponent(User user,Project project)#0{
    panel.add(new BoldLabel(StringUtil.getMsg("0.from.1", getTitle(), user.getDisplayName())), BorderLayout.NORTH);
    ComponentConsoleView componentConsoleView = new ComponentConsoleView(user, project);
    outputMessage(componentConsoleView);
    panel.add(componentConsoleView.getComponent());
}
}
//38
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildPropertyTestingPanel()#0{
        taskListPanel.add( this.buildCheckBox());
        taskListPanel.add( this.buildCheckBox());
}
}
//39
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildComboBoxPanel()#1{
        panel.add(this.buildComboBox());
        panel.add(this.buildComboBox());
}
}
//40
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.createButtonsPanel()#0{
        showDetailButton = bf.createJButton("ShowDetailButton");
        panel.add(showDetailButton);
        okButton = bf.createJButton("OKButton");
        panel.add(okButton);
}
}
//41
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.getEditorComponent()#0{
        DispatchXPathGroovyEditorModel editorModel = new DispatchXPathGroovyEditorModel();
        xpathEditor = new GroovyEditor(editorModel);
        xpathEditorPanel.add(xpathEditor, BorderLayout.CENTER);
        xpathEditorPanel.add(buildXPathEditorToolbar(editorModel), BorderLayout.PAGE_START);
}
}
//42
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.BinomialParametersPanel()#0{
        wrapper.add(new JSpinner(probabilityNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 4, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
//43
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.ExponentialParametersPanel()#0{
        wrapper.add(new JSpinner(rateNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 2, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
//44
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.GaussianParametersPanel()#2{
        wrapper.add(new JSpinner(deviationNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 4, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
//45
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.UniformParametersPanel()#0{
        wrapper.add(new JSpinner(maxNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 4, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
//46
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createCenterPanel()#0{
    myCreateLocalCheckbox = new JCheckBox(RefactoringBundle.message("inline.parameter.replace.with.local.checkbox"));
    panel.add(myCreateLocalCheckbox, BorderLayout.SOUTH);
}
}
//47
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class250.getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog)#1{
    myUpdateExistingCopyrightsCb = new JCheckBox("Update existing copyrights", 
                                                 PropertiesComponent.getInstance().getBoolean(UPDATE_EXISTING_COPYRIGHTS, true));
    panel.add(myUpdateExistingCopyrightsCb);
}
}
//48
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog)#1{
    myAnnotateLocalVariablesCb = new JCheckBox("Annotate local variables", PropertiesComponent.getInstance().getBoolean(ANNOTATE_LOCAL_VARIABLES, false));
    panel.add(myAnnotateLocalVariablesCb);
}
}
//49
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createPreviewButtonsPanel()#2{
    previewButtonsPanel.add( new JCheckBox( new LimitRowsCheckBoxActionListener( maxPreviewRowsSpinner ) ) );
    previewButtonsPanel.add( maxPreviewRowsSpinner );
}
}
//50
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.createPreviewButtonsPanel()#2{
    previewButtonsPanel.add( new JCheckBox( new LimitRowsCheckBoxActionListener( maxPreviewRowsSpinner ) ) );
    previewButtonsPanel.add( maxPreviewRowsSpinner );
}
}
//51
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class600.buildFilterPanel()#1{
        pnl.add(cbInSelectionOnly = new JCheckBox(tr("For selected objects only")));
}
}
//52
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.fillFlowControlPanel()#0{
    mLoop = new JCheckBox("Loop");
    panel.add(mLoop);
}
}
//53
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class830.createPreviewButtonsPanel()#1{
    previewButtonsPanel.add(new JCheckBox(new LimitRowsCheckBoxActionListener(maxPreviewRowsSpinner)));
    previewButtonsPanel.add(maxPreviewRowsSpinner);
}
}
//54
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.addSettingsSection(final JPanel p,String name,JPanel section,GBC gbc)#1{
        p.add(lbl, GBC.std());
        p.add(new JSeparator(), GBC.eol().fill(GBC.HORIZONTAL).insets(5, 0, 0, 0));
}
}
//55
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.getPreferencePanel(ActionListener listener)#0{
        p.add(new HtmlPanel(tr("<i>CH1903 / LV03 (without local corrections)</i>")), GBC.eol().fill(GBC.HORIZONTAL));
        p.add(Box.createVerticalGlue(), GBC.eol().fill(GBC.BOTH));
}
}
//56
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class390.layoutCommitListPanel(@NotNull String currentBranch,boolean forward)#1{
    descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    bth.add(descriptionLabel, BorderLayout.NORTH);
    bth.add(forward ? myHeadToBranchListPanel : myBranchToHeadListPanel);
}
}
//57
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.BooleanArgRep(Connector.BooleanArgument barg,JPanel comp){
            check = new JCheckBox(barg.label());
            check.setSelected(barg.booleanValue());
            panel.add(check);
            comp.add(panel);
}
}
//58
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.buildOptions(JPanel searchOptions)#1{
    searchOptions.add(UIUtil.createOptionLine(shortenFQN = new JCheckBox(
      SSRBundle.message("shorten.fully.qualified.names.checkbox"), true)));
}
}
//59
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.createCeckbox(final JPanel panel,boolean enabled){
        JCheckBox checkBox = new JCheckBox();
        checkBox.setHorizontalAlignment(SwingConstants.CENTER);
        checkBox.setEnabled(enabled);
        panel.add(checkBox);
}
}
//60
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.buildUI()#0{
    this.progress.setBorder(BorderFactory.createEmptyBorder(10, 13, 10, 13));
    this.progress.setPreferredSize(new Dimension(PREFERRED_WIDTH, this.progress.getPreferredSize().height));
    content.add(this.progress, BorderLayout.CENTER);
    this.frame.setContentPane(content);
}
}
//61
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class60.buildActionsPanel()#1{
        TestAccessTokenAction actTestAccessToken = new TestAccessTokenAction();
        pnl.add(new SideButton(actTestAccessToken));
        this.addPropertyChangeListener(actTestAccessToken);
}
}
//62
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel()#0{
        pnl.add(new SideButton(new OKAction()));
}
}
//63
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel()#1{
        pnl.add(new SideButton(new ContextSensitiveHelpAction(HelpUtil.ht("/Dialog/Password"))));
}
}
//64
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel()#2{
        pnl.add(new SideButton(new CancelAction()));
}
}
//65
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildActionPanel()#0{
            pnl.add(new SideButton(new RetrieveAccessTokenAction()));
}
}
//66
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildActionPanel()#1{
            pnl.add(new SideButton(new BackAction()));
}
}
//67
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.buildButtonPanel()#0{
        pnl.add(btnOK = new SideButton(new OKAction()));
        btnOK.setFocusable(true);
}
}
//68
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.buildButtonPanel()#1{
        pnl.add(new SideButton(new ContextSensitiveHelpAction(ht("/Action/Delete#DeleteFromRelations"))));
}
}
//69
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.buildButtonPanel()#4{
        pnl.add(new SideButton(new CancelAction()));
}
}
//70
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.actionPerformed(ActionEvent e)#0{
        panel.add(new JSpinner());
}
}
//71
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.BinomialParametersPanel()#2{
        wrapper.add(new JSpinner(trialsNumberModel));
}
}
//72
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.buildZoomLevelPanel()#2{
            pnl.add(spZoomLevel = new JSpinner(new SpinnerNumberModel(0, 0, 18, 1)));
}
}
//73
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.GaussianParametersPanel()#4{
        wrapper.add(new JSpinner(meanNumberModel));
}
}
//74
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.UniformParametersPanel()#4{
        wrapper.add(new JSpinner(minNumberModel));
}
}
//75
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.createCustomComponent(final Presentation presentation)#2{
    label.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4));
    panel.add(super.createCustomComponent(presentation), BorderLayout.CENTER);
}
}
//76
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.buildSelectedPrimitivesPanel()#4{
        lbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnl.add(lbl, BorderLayout.NORTH);
}
}
//77
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.wrapWithTitle(String name,final FileEditor beforeEditor)#3{
    label.setBorder(BorderFactory.createEmptyBorder(1, 4, 2, 0));
    label.setFont(label.getFont().deriveFont(Font.BOLD));
    panel.add(BorderLayout.NORTH, label);
}
}
//78
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class820.addGui(PreferenceTabbedPane gui)#0{
        p.add(prefpanel, GBC.eol().fill(GBC.BOTH));
}
}
//79
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.SelectLayerDialog(Collection<Layer> layers)#1{
            panel.add(this.list, GBC.eol().fill());
            setContent(panel);
}
}
//80
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.addGui(PreferenceTabbedPane gui)#1{
        p.add(sp, GBC.eol().fill(GridBagConstraints.BOTH));
}
}
//81
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.addGui(PreferenceTabbedPane gui)#1{
        p.add(sp, GBC.eol().fill(GridBagConstraints.BOTH));
}
}
//82
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class280.buildDeletedPrimitivesPanel()#1{
        lbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnl.add(lbl, BorderLayout.NORTH);
}
}
//83
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.getInputPane()#0{
        pane.add(getAnswerPane(Tools.getString("Dialog.Host.Devices.Executing")));
        SpringUtilities.makeCompactGrid(pane, 2, 1, 0, 0, 0, 0);
}
}
//84
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.getInputPane()#0{
        pane.add(getAnswerPane(Tools.getString("Dialog.Host.PacemakerInst.Executing")));
        SpringUtilities.makeCompactGrid(pane, 2, 1,  // rows, cols
                                              0, 0,  // initX, initY
                                              0, 0); // xPad, yPad
}
}
//85
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class680.getInputPane()#1{
        final JScrollPane sp = getAnswerPane(Tools.getString("Dialog.About.Licences"));
        pane.add(sp);
        SpringUtilities.makeCompactGrid(pane, 1, 1,  //rows, cols
                                              1, 1,  //initX, initY
                                              1, 1); //xPad, yPad
}
}
//86
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class420.getInputPane()#0{
        pane.add(getAnswerPane(Tools.getString("Dialog.Host.DistDetection.Executing")));
        SpringUtilities.makeCompactGrid(pane, 1, 1,  // rows, cols
                                              1, 1,  // initX, initY
                                              1, 1); // xPad, yPad
}
}
//87
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.addGui(PreferenceTabbedPane gui)#1{
        p.add(spCurveSteps, GBC.eol());
}
}
//88
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class430.createBRUrlPanel()#0{
    panel.add(m_urlField = new JTextField(20));
}
}
//89
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.actionPerformed(ActionEvent e)#5{
        panel.add(new JTextField(40));
}
}
//90
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.createPanel()#1{
            page.add( field = new JTextField(15), "span, growx");
}
}
//91
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.createURLPanel()#3{
        panel.add(m_urlField = new JTextField(20), BorderLayout.CENTER);
}
}
//92
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.FileSelectionPatternDialog(String defaultPattern,Window parent)#1{
        textField = new JTextField(defaultPattern);
        contentPane.add(textField, BorderLayout.CENTER);
        setContent(contentPane);
}
}
//93
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.createCenterPanel()#0{
    label.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    panel.add(myRequirementsChooser, BorderLayout.CENTER);
}
}
//94
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class280.createSwitchPanel()#0{
        switchValue = new JTextField(""); // $NON-NLS-1$
        selectionLabel.setLabelFor(switchValue);
        switchPanel.add(switchValue, BorderLayout.CENTER);
}
}
//95
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.createConfirmCommands()#1{
    confirmCmd.add(Box.createRigidArea(new Dimension(440, 0)));
    confirmCmd.add(cmdClose);
}
}
//96
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.insetPanelRight(int inset,JComponent... comp)#3{
    p.add(Box.createRigidArea(new Dimension(10, 0)));
}
}
//97
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createCenterPanel()#0{
    panel.add(ScrollPaneFactory.createScrollPane(myChooser.getComponent()), BorderLayout.CENTER);
}
}
//98
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createTreeComponent(DualViewColumnInfo[] columns,TreeNode root)#2{
    result.add(ScrollPaneFactory.createScrollPane(myTreeView), BorderLayout.CENTER);
}
}
//99
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#1{
    JTextArea area = new JTextArea(5, 50);
    area.setText(myCertificateInfo);
    area.setEditable(false);
    panel.add(ScrollPaneFactory.createScrollPane(area), BorderLayout.CENTER);
}
}
//100
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createCenterPanel()#0{
    result.add(ScrollPaneFactory.createScrollPane(myTreeTable), BorderLayout.CENTER);
}
}
//101
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createCenterPanel()#0{
    myBrowser = new JEditorPane(UIUtil.HTML_MIME, "");
    panel.add(ScrollPaneFactory.createScrollPane(myBrowser));
}
}
//102
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class640.createCenterPanel()#4{
    panel.add(ScrollPaneFactory.createScrollPane(table), BorderLayout.CENTER);
}
}
//103
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.titledImagePanel(String string,RenderedImage expected)#1{
        title.setBorder(new LineBorder(Color.BLACK));
        panel.add(title, BorderLayout.NORTH);
}
}
//104
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class640.createCenterPanel()#0{
    label.setBorder(IdeBorderFactory.createEmptyBorder(6, 6, 6, 6));
    panel.add(label, BorderLayout.NORTH);
}
}
//105
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createActionsToolbar(ActionGroup ag)#1{
    ActionToolbar actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, ag, false);
    actionToolbar.setOrientation(SwingConstants.VERTICAL);
    rv.add(actionToolbar.getComponent());
}
}
//106
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createStepPanel()#0{
    stepPanel.add(mainComponent, LayoutUtil.createLabelConstraints(1));
    stepPanel.add(new JPanel(), LayoutUtil.createPanelConstraints(2));
}
}
//107
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class680.createContentPanelWithAdvancedSettingsPanel()#2{
    final JPanel advancedSettings = createAdvancedSettings();
    if (advancedSettings != null) {
      scrollPanel.add(advancedSettings, BorderLayout.CENTER);
    }
}
}
//108
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.buildPropertiesPanel()#1{
        propertiesTable = new PropertyHolderTable(getModelItem());
        if (getModelItem() instanceof WsdlProject) {
            ((WsdlProject) getModelItem()).addProjectListener(propertiesTable.getProjectListener());
        }
        panel.add(propertiesTable, BorderLayout.CENTER);
}
}
//109
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.add(JPanel p,AbstractButton c){
        c.setFocusable(false);
        c.setFont(VueConstants.FONT_SMALL);
        if (c instanceof JCheckBox)
            c.setContentAreaFilled(false);
        p.add(c, 0);
        c.addActionListener(this);
}
}
//110
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createTextStatsPane()#0{
        textStats.setPreferredSize(new Dimension(300, 15));
        textStatsContainer.add(textStats);
}
}
//111
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class420.createFieldPanel(String key,JLabel valueLabel)#1{
    textLabel.setPreferredSize(new Dimension(120, 10));
    panel.add(valueLabel);
}
}
//112
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.OAuth2ScriptsDesktopPanel(OAuth2Profile profile)#0{
        editor.setPreferredSize(new Dimension(900, 700));
        contentPane.add(editor, BorderLayout.CENTER);
}
}
//113
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class450.installActionGroupInToolBar(DefaultActionGroup actionGroup,JPanel toolBarPanel,ActionManager actionManager,String toolbarName,boolean horizontal)#0{
        JComponent actionToolbar = ActionManager.getInstance().createActionToolbar(toolbarName, actionGroup, horizontal).getComponent();
        toolBarPanel.add(actionToolbar, BorderLayout.CENTER);
}
}
//114
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class560.MyConsolePanel(ExecutionConsole consoleView,ActionGroup toolbarActions)#0{
      toolbarPanel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, toolbarActions,false).getComponent());
      add(toolbarPanel, BorderLayout.WEST);
}
}
//115
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createCenterPanel()#1{
    panel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true).getComponent(), BorderLayout.NORTH);
    myTreeList.expandAll();
}
}
//116
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.flowPanelRight(int hgap,int vgap,int tab,Component... comps)#0{
    p.add(Box.createHorizontalStrut(tab));
}
}
//117
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.flowPanelCenter(int hgap,int vgap,int tab,Color bgColor,Component... comps)#0{
    p.add(Box.createHorizontalStrut(tab));
}
}
//118
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class310.flowPanel(int tab,Component... comps)#1{
    p.add(Box.createHorizontalStrut(tab));
}
}
//119
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.addMillisDescription(@NotNull JSpinner spinner)#1{
    panel.add(Box.createHorizontalStrut(10));
}
}
//120
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.createCustomComponent(Presentation presentation)#1{
      filterCaption.setForeground(UIUtil.isUnderDarcula() ? UIUtil.getLabelForeground() : UIUtil.getInactiveTextColor());
      panel.add(filterCaption);
}
}
//121
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createStepPanel()#3{
    stepPanel.add(mainComponent, LayoutUtil.createPanelConstraints(1));
}
}
//122
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.createEditor()#0{
    panel.add(myPluginsPanel, LayoutUtil.createPanelConstraints(0));
}
}
//123
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.addEmptySpace(JPanel panel,int size)#1{
        panel.add(Box.createVerticalStrut(size),
                new GridBagConstraints(0, linesCount++,
                2, 1,
                1.0, 0.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.VERTICAL,
                new Insets(6, 0, 0, 0),
                0, 0));
}
}
//124
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createPrewviewPanel()#2{
      p.add(Box.createVerticalStrut(5));
}
}
//125
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createSignaturePanel()#1{
    panel.add(SeparatorFactory.createSeparator(RefactoringBundle.message("signature.preview.border.title"), null), BorderLayout.NORTH);
    panel.add(mySignature, BorderLayout.CENTER);
}
}
//126
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.createOccurrencesCb(GridBagConstraints gbConstraints,JPanel panel,final int occurenceNumber)#0{
    myCbReplaceAllOccurences.setText(RefactoringBundle.message("replace.all.occurences", occurenceNumber));
    panel.add(myCbReplaceAllOccurences, gbConstraints);
    myCbReplaceAllOccurences.setSelected(false);
}
}
//127
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class580.createPanel()#0{
    textWithComboPanel.add(Box.createRigidArea(JBUI.size(5, 0)));
    textWithComboPanel.add(myForceRearrangeComboBox);
    group.add(textWithComboPanel);
    return group.createPanel();
}
}
//128
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.addGui(PreferenceTabbedPane gui)#2{
        p.add(label, GBC.std());
        label.setLabelFor(spCurveSteps);
}
}
//129
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#3{
    panel.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);
}
}
//130
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.VcsGeneratedFilesPanel(Project project)#2{
    myIgnoreGeneratedFilesCheckBox.setToolTipText("Do not store generated files and model caches (source_gen/*, source_gen.caches/*) in repository");
    generatedFilesPanel.add(myIgnoreGeneratedFilesCheckBox);
    add(generatedFilesPanel, BorderLayout.NORTH);
}
}
//131
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class0.init()#1{
        mainPanel.add(createSwitchPanel(), BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
}
}
//132
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.createStatusBar()#0{
    panel.setLayout(new FlowLayout(2));
    panel.add(statusMsg);
}
}
//133
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.createDestinationPane()#0{
        destSetup.setLayout(new BoxLayout(destSetup, BoxLayout.X_AXIS));
        pane.add(destSetup, BorderLayout.EAST);
}
}
//134
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationContent()#0{
    JPanel confCont = createPanel();
    confCont.add(createConfirmationHeader(), BorderLayout.NORTH);
}
}
//135
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationContent()#2{
    JPanel confMain = createPanel();
    confMain.add(createCustomerDetails(), BorderLayout.NORTH);
}
}
//136
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationPanel()#0{
    JPanel confirm = createPanel();
    confirm.add(createStepPanel("step3.gif"), BorderLayout.NORTH);
}
}
//137
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.createMutationsPanel()#1{
        JSplitPane mainSplit = UISupport.createHorizontalSplit(buildFilesList(), buildTables());
        mainSplit.setResizeWeight(1);
        panel.add(mainSplit, BorderLayout.CENTER);
}
}
//138
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.getHeaderPanel(Project project)#0{
    panel.add(getHeaderPanel(project, GetterTemplatesManager.getInstance(), CodeInsightBundle.message("generate.getter.template")), BorderLayout.NORTH);
    panel.add(getHeaderPanel(project, SetterTemplatesManager.getInstance(), CodeInsightBundle.message("generate.setter.template")), BorderLayout.SOUTH);
}
}
//139
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.createDestinationPane()#1{
        destSetup.setLayout(new BoxLayout(destSetup, BoxLayout.X_AXIS));
        pane.add(useNonPersistentDelivery, BorderLayout.EAST);
}
}
//140
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.addLeftJustifiedComponent(Component component)#0{
        panel.add(Box.createHorizontalGlue());
}
}
//141
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createConsolePanel(ConsoleView view,ActionGroup actions)#0{
    panel.add(view.getComponent(), BorderLayout.CENTER);
}
}
//142
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.createToolbarPanel(Collection<AnAction> actions)#4{
        panel.add(actionToolBar.getComponent(), BorderLayout.CENTER);
}
}
//143
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.makeTextPanel(String text)#2{
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
}
}
//144
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.createConsolePanel(ConsoleView view,ActionGroup actions)#0{
    panel.add(view.getComponent(), BorderLayout.CENTER);
}
}
//145
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.wrapItemForSelection(JComponent comp)#0{
        panel.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
        panel.add(comp);
        panel.setOpaque(false);
}
}
//146
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.addComponent(JPanel contentPanel,JPanel resultPanel){
    final Splitter splitter = new Splitter(true, 0.3f, 0.2f, 0.7f);
    contentPanel.add(splitter, BorderLayout.CENTER);
    splitter.setFirstComponent(myMainPanel);
    splitter.setSecondComponent(resultPanel);
}
}
//147
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class710.run()#0{
            Splitter splitter = new OnePixelSplitter(orientation, proportion, 0.1f, 0.9f);
            panel.add(splitter, BorderLayout.CENTER);
            splitter.setFirstComponent(firstComponent);
            splitter.setSecondComponent(secondComponent);
}
}
//148
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createSelectionPanel()#2{
    JPanel select = createPanel();
    select.add(createStepPanel("step2.gif"), BorderLayout.NORTH);
}
}
//149
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createFindPanel()#1{
    JPanel p = createPanel();
    p.add(createStepPanel("step1.gif"), BorderLayout.NORTH);
}
}
//150
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class750.buildQueryEditor()#0{
        panel.add(UISupport.getEditorFactory().buildXPathEditor(queryEditorModel), BorderLayout.CENTER);
        UISupport.addTitledBorder(panel, "XPath Query");
}
}
//151
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class750.buildMatchEditor()#1{
        panel.add(UISupport.getEditorFactory().buildXmlEditor(matchEditorModel), BorderLayout.CENTER);
        UISupport.addTitledBorder(panel, "Matching Value");
}
}
//152
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createStepPanel()#6{
    stepPanel.add(label, LayoutUtil.createLabelConstraints(0));
}
}
//153
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.addPreviewButtons(JPanel container,final Slide slide)#1{
            container.add(new OverlayIconButton(new PreviewAudioAction(controller)));
}
}
//154
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.addPreviewButtons(JPanel container,final Slide slide)#2{
            container.add(new OverlayIconButton(new PreviewVideoAction(controller)));
}
}
//155
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.getHeaderPanel(Project project)#3{
    panel.add(getHeaderPanel(project, SetterTemplatesManager.getInstance(), CodeInsightBundle.message("generate.setter.template")), BorderLayout.SOUTH);
}
}
//156
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.init()#2{
        vertPanel.add(JMeterPluginsUtils.addHelpLinkToPanel(makeTitlePanel(), WIKIPAGE), BorderLayout.NORTH);
        add(vertPanel, BorderLayout.NORTH);
}
}
//157
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.addChart(Chart chart,int id)#2{
            chartPanel.add((java.awt.Component) chart.getCanvas(), BorderLayout.CENTER);
            add(chartPanel, "cell 0 " + id + ", grow");
}
}
//158
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class650.OAuth2ScriptsEditor(final OAuth2Profile profile)#3{
        linkPanel.add(UISupport.createLabelLink(HelpUrls.OAUTH_AUTOMATING_ACCESS_TOKEN_RETRIEVAL, HELP_LINK_TEXT));
        add(linkPanel, BorderLayout.SOUTH);
}
}
//159
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class680.renderNonPrefixSeparatorComponent(Color backgroundColor)#0{
    final JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
    panel.add(separator, BorderLayout.CENTER);
}
}
//160
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.buildTextPanel()#0{
            msg.setText(tr("<html>Please select a <strong>range of OSM tiles</strong> at a given zoom level.</html>"));
            pnl.add(msg);
}
}
//161
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.getPanel()#0{
        panel.add(UISupport.createLabelLink("http://www.soapui.org/Store-Info/privacy-policy.html", "Privacy policy"));
}
}
//162
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel(final Action addAction,final Action removeAction)#0{
    buttonPanel.add( new BorderlessButton( removeAction ) );
}
}
//163
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createButtonPanel(final Action addAction,final Action removeAction)#1{
    buttonPanel.add( new BorderlessButton( addAction ) );
}
}
//164
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.addSettingsSection(final JPanel p,String name,JPanel section,GBC gbc)#3{
        p.add(new JSeparator(), GBC.eol().fill(GBC.HORIZONTAL).insets(5, 0, 0, 0));
}
}
//165
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.buildAndInstallCenteredButtonBox(JPanel cp,int rowNum,int colWidth,boolean doApply,boolean showAsCancel)#0{
    UiUtil.gbcSet(gbc_, 0, rowNum, colWidth, 1, UiUtil.HOR, 0, 0, 5, 5, 5, 5, UiUtil.SE, 1.0, 0.0);
    cp.add(bBox, gbc_);
}
}
//166
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.run()#2{
                    panel.add(new BlackLabel("expected", expected));
}
}
//167
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.run()#3{
                    panel.add(new BlackLabel("actual", actual));
}
}
//168
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class280.addTable(JPanel cp,JComponent tablePan,int rowHeight,int rowNum,int columns){
    UiUtil.gbcSet(gbc_, 0, rowNum, columns, rowHeight, UiUtil.BO, 0, 0, 5, 5, 5, 5, UiUtil.CEN, 1.0, 1.0);
    cp.add(tablePan, gbc_);
}
}
//169
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.buildPropertyTestingPanel()#1{
        propertyListPanel.add( this.buildPropertyEntryPanel());
}
}
//170
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.buildPropertyTestingPanel()#2{
        propertyTestingPanel.add( this.buildPropertyEntryPanel());
}
}
//171
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.JConfigGeneralTab()#2{
    jp.add(panelPack(buildCheckboxPanel()), BorderLayout.NORTH);
}
}
//172
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.JConfigGeneralTab()#3{
    jp.add(panelPack(buildDropdownPanel()), BorderLayout.CENTER);
}
}
//173
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.addField(JPanel panel,JLabeledTextField field,GridBagConstraints gbc)#1{
        panel.add(item.get(0), gbc.clone());
        panel.add(item.get(1), gbc.clone());
}
}
//174
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.addField(JPanel panel,JLabeledTextField field,GridBagConstraints gbc)#2{
        panel.add(item.get(1), gbc.clone());
}
}
//175
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.buildTextPanel()#0{
            msg.setText(tr("<html>Alternatively you may enter a <strong>tile address</strong> for a single tile "
                    + "in the format <i>zoomlevel/x/y</i>, i.e. <i>15/256/223</i>. Tile addresses "
                    + "in the format <i>zoom,x,y</i> or <i>zoom;x;y</i> are valid too.</html>"));
            pnl.add(msg);
}
}
//176
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.setButtonComponent(@NotNull ActiveComponent component)#2{
    panel.add(component.getComponent(), BorderLayout.CENTER);
    panel.setOpaque(false);
    add(panel, BorderLayout.EAST);
}
}
//177
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class310.TestFastUpdatingPane()#0{
        content.add(new JComboBox(new String[]{"filler", "b", "c"}));
        setViewportView(content);
        registerUpdater();
}
}
//178
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.createCenterPanel()#1{
    splitter.setFirstComponent(new JBScrollPane(myRequestsTable, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    splitter.setSecondComponent(
      new JBScrollPane(myStacktrace, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    panel.add(splitter, BorderLayout.CENTER);
}
}
//179
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.addGui(PreferenceTabbedPane gui)#1{
            panel.add(Box.createVerticalGlue(), GBC.eol().fill(GBC.BOTH));
}
}
//180
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.buildMessagePanel()#1{
        HtmlPanel msg = new HtmlPanel();
        pnl.add(msg, BorderLayout.CENTER);
}
}
//181
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.createCenterPanel()#0{
    label.setIcon(Messages.getQuestionIcon());
    panel.add(label, BorderLayout.CENTER);
}
}
//182
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.createContentPane()#2{
        builder.append("Git-Integration", gitIntegration = new JBLabel());
        builder.append("Current Heroku-Git-Remote:", remoteLabel = new JBLabel());
        panel.add(builder.getPanel(), BorderLayout.NORTH);
}
}
//183
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class250.getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog)#2{
    panel.add(new TitledSeparator());
}
}
//184
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.createLabeledPanel(String labelText,JComponent component)#0{
    final JBLabel label = new JBLabel(labelText, UIUtil.ComponentStyle.SMALL);
    IJSwingUtilities.adjustComponentsOnMac(label, component);
    panel.add(component);
}
}
//185
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class240.createCenterPanel()#0{
    label.setIcon(Messages.getWarningIcon());
    panel.add(label, BorderLayout.NORTH);
}
}
//186
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.getPreferencePanel(ActionListener listener)#2{
        p.add(Box.createVerticalGlue(), GBC.eol().fill(GBC.BOTH));
}
}
//187
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class670.createStatisticsComponent(StatisticsTableModel testStatisticsModel)#3{
    tablePanel.add(new JBScrollPane(statisticsTable));
}
}
//188
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.createAliasPanel()#1{
    panel.add( new JComboBox( fontSmoothModel ) );
}
}
//189
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.getAdditionalActionSettings(Project project,BaseAnalysisActionDialog dialog)#0{
    panel.add(new TitledSeparator());
}
}
//190
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createPluginComponent(TestControl testControl)#0{
    panel.add(frame.getContentPane(), BorderLayout.CENTER);
}
}
//191
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.actionPerformed(ActionEvent e)#1{
        JPanel tkPane = (JPanel)f.getContentPane();
        tkPane.add(tkScroll,BorderLayout.CENTER);
        f.setJMenuBar(tk.createMenuBar(f));
        f.pack();
        f.setVisible(true);
}
}
//192
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.createLabel(JPanel pPanel,int xOff,int yOff)#3{
    label.setFont(new Font("Dialog", Font.BOLD, 10));
    label.setBounds(xOff, yOff, LABEL_WIDTH, LABEL_HEIGHT);
    pPanel.add(label);
}
}
//193
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.addJCheckbox(String string,JPanel panel,boolean selected){
        JRadioButton radioButton = new JRadioButton(string);
        radioButton.setSelected(selected);
        type.add(radioButton);
        panel.add(radioButton);
}
}
//194
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createContentPane()#0{
        mainPanel.add(createScorePanel(), BorderLayout.SOUTH);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, quickOpenPanel, mainPanel);
        splitPane.setOneTouchExpandable(true);
        splitPane.setResizeWeight(0.2);
}
}
//195
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.createRadioButton(String text,ButtonGroup group,JPanel radioPanel){
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setBorder(null);
        group.add(radioButton);
        radioPanel.add(radioButton);
}
}
//196
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class750.buildQueryMatchPanel()#1{
        JSplitPane splitPane = UISupport.createHorizontalSplit(buildQueryEditor(), buildMatchEditor());
        panel.add(splitPane, BorderLayout.CENTER);
        splitPane.setDividerLocation(200);
}
}
//197
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildButtonPanel()#1{
        buttonPanel.add(this.buildRenameButton());
}
}
//198
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.buildTextFieldPanel()#1{
        taskListPanel.add(this.buildReadOnlyNameTextField());
}
}
//199
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.buildTextFieldPanel()#2{
        taskListPanel.add(this.buildNameTextField());
}
}
//200
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.buildTextFieldPanel()#3{
        taskListPanel.add(this.buildUpperCaseNameTextField());
}
}
//201
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.createCompletionPanel()#2{
    completionPanel.add(myModuleSelector.getComponent(), BorderLayout.CENTER);
}
}
//202
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.createSouthPanel()#2{
    myErrorLabel.setHorizontalAlignment(JLabel.CENTER);
    result.add(myErrorLabel, BorderLayout.NORTH);
}
}
//203
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class320.run()#4{
        panel.add(new Slider(200, 100, 500, 0.1f, 150, 300));
}
}
//204
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class770.createCenterPanel()#0{
    myEditorPanel = AnalyzeStacktraceUtil.createEditorPanel(myProject, myDisposable);
    myEditorPanel.pasteTextFromClipboard();
    panel.add(myEditorPanel, BorderLayout.CENTER);
}
}
//205
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createCommitMessageWrapper()#2{
    myCommitMessage = CommitMessage.createCommitTextEditor(myProject, true);
    commitMessageWrapper.add(myCommitMessage, BorderLayout.CENTER);
}
}
//206
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class500.createPrewviewPanel()#0{
      p.add(_screenshot.createControls());
      p.doLayout();
}
}
//207
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#1{
        buttonPanel.add(this.buildAddEyeColorButton());
}
}
//208
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#2{
        buttonPanel.add(this.buildResetButton());
}
}
//209
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#3{
        buttonPanel.add(this.buildPrintButton());
}
}
//210
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#4{
        buttonPanel.add(this.buildAddButton());
}
}
//211
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#5{
        buttonPanel.add(this.buildRemoveButton());
}
}
//212
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildButtonPanel()#6{
        buttonPanel.add(this.buildRenameButton());
}
}
//213
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildSpinnerPanel()#0{
        taskListPanel.add(this.buildAgeSpinner());
}
}
//214
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildSpinnerPanel()#2{
        taskListPanel.add(this.buildEyeColorSpinner());
}
}
//215
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildSpinnerPanel()#3{
        taskListPanel.add(this.buildBirthDateSpinner());
}
}
//216
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildControlPanel()#0{
        controlPanel.add(this.buildRestoreModelButton());
}
}
//217
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildControlPanel()#1{
        controlPanel.add(this.buildPrintModelButton());
}
}
//218
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildControlPanel()#3{
        controlPanel.add(this.buildResetColorButton());
}
}
//219
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildControlPanel()#4{
        controlPanel.add(this.buildClearModelButton());
}
}
//220
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class190.buildTestCaseList(WsdlTestSuite testSuite)#2{
        p.add(buildTestCaseListToolbar(), BorderLayout.NORTH);
}
}
//221
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class540.getInputPane()#1{
        pane.add(getProgressBarPane());
}
}
//222
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createCenterPanel()#0{
    panel.add(myPanel.getComponent(), BorderLayout.CENTER);
    panel.add(myErrorLabel, BorderLayout.SOUTH);
}
}
//223
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createConsolePanel(ConsoleView view,ActionGroup actions)#3{
    panel.add(createToolbar(actions), BorderLayout.WEST);
}
}
//224
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.getInputPane()#2{
        pane.add(getProgressBarPane());
}
}
//225
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.buildGUI()#1{
    p.add(UIUtilities.buildComponentPanel(status));
}
}
//226
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class120.createCenterPanel()#1{
    panel.add(createCheckBoxes(), BorderLayout.CENTER);
}
}
//227
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.createCustomComponent(Presentation presentation)#2{
      panel.add(createSearchField());
}
}
//228
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.createComponent()#0{
    result.add(createButtonsPanel(), BorderLayout.SOUTH);
}
}
//229
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class260.addToPanel(JComponent section,JPanel container,String sectionName,String description,boolean isOpen)#1{
    container.add(section);
}
}
//230
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createResultPanel()#1{
        resultArea = SyntaxEditorUtil.createDefaultXmlSyntaxTextArea();
        panel.add(resultArea, BorderLayout.CENTER);
}
}
//231
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createQueryPanel()#0{
        querySplit = UISupport.createVerticalSplit(buildQueryTabs(), buildInputArea());
        querySplit.setBorder(null);
        querySplit.setResizeWeight(0.2);
        panel.add(querySplit, BorderLayout.CENTER);
}
}
//232
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createListPanel()#1{
        panel.add(createModificationButtonBox(), BorderLayout.EAST);
}
}
//233
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.wrapWithTitle(String name,final FileEditor beforeEditor)#1{
    panel.add(BorderLayout.CENTER, beforeEditor.getComponent());
}
}
//234
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createOptionsPanel()#0{
    result.add(myDateOrRevisionOrTagSettings.getPanel());
}
}
//235
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class10.createOptionsPanel()#1{
    result.add(myChangeKeywordSubstitutionPanel.getComponent());
}
}
//236
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.buildSourceAndTargetInfoPanel()#0{
        statisticsModel = new StatisticsTableModel();
        pnl.add(new StatisticsInfoTable(statisticsModel), BorderLayout.CENTER);
}
}
//237
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.buildContent()#0{
            content.add(buildMainPanel(), BorderLayout.CENTER);
}
}
//238
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class90.buildContent()#2{
            content.add(buildButtonBar(), BorderLayout.SOUTH);
}
}
//239
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildControlPanel()#0{
        controlPanel.add( this.buildPrintModelButton());
}
}
//240
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildControlPanel()#1{
        controlPanel.add( this.buildRestoreModelButton());
}
}
//241
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildControlPanel()#2{
        controlPanel.add( this.buildCloneWindowButton());
}
}
//242
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildControlPanel()#3{
        controlPanel.add( this.buildClearModelButton());
}
}
//243
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildControlPanel()#6{
        controlPanel.add( this.buildResetPropertyButton());
}
}
//244
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class860.buildPropertyEntryPanel()#0{
        addRemoveTaskPanel.add( this.buildTextField());
}
}
//245
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.getComponentWithMargin(Component component,int top,int left,int bottom,int right)#0{
        ret.add(component, constraints);
}
}
//246
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildRadioButtonPanel()#0{
        taskListPanel.add(this.buildRedRadioButton());
}
}
//247
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildRadioButtonPanel()#1{
        taskListPanel.add(this.buildGreenRadioButton());
}
}
//248
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildRadioButtonPanel()#3{
        taskListPanel.add(this.buildBlueRadioButton());
}
}
//249
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildAddRemoveTaskPanel()#0{
        addRemoveTaskPanel.add(this.buildAddButton(), BorderLayout.WEST);
}
}
//250
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildAddRemoveTaskPanel()#2{
        addRemoveTaskPanel.add(this.buildRemoveButton(), BorderLayout.EAST);
}
}
//251
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildAddRemoveTaskPanel()#3{
        addRemoveTaskPanel.add(this.buildTaskTextField(), BorderLayout.CENTER);
}
}
//252
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildDisplayableTaskListPanel()#0{
        taskListPanel.add(this.buildUnsortedDisplayableListPanel());
}
}
//253
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildDisplayableTaskListPanel()#2{
        taskListPanel.add(this.buildStandardSortedDisplayableListPanel());
}
}
//254
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildDisplayableTaskListPanel()#3{
        taskListPanel.add(this.buildCustomSortedDisplayableListPanel());
}
}
//255
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildPrimitiveTaskListPanel()#0{
        taskListPanel.add(this.buildStandardSortedPrimitiveListPanel());
}
}
//256
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildPrimitiveTaskListPanel()#2{
        taskListPanel.add(this.buildUnsortedPrimitiveListPanel());
}
}
//257
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class220.buildPrimitiveTaskListPanel()#3{
        taskListPanel.add(this.buildCustomSortedPrimitiveListPanel());
}
}
//258
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class40.titledImagePanel(String string,RenderedImage expected)#0{
        panel.add(
                new ScrollingImagePanel(expected, Math.min(400, expected.getWidth()), Math.min(400,
                        expected.getHeight())), BorderLayout.CENTER);
}
}
//259
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class440.createResultsOptionPanel(JPanel optionsPanel,GridBagConstraints gbConstraints)#1{
    myScopePanel = new HideableTitledPanel(FindBundle.message("results.options.group"), resultsOptionPanel,
                                           myPreviousResultsExpandedState);
    optionsPanel.add(myScopePanel, gbConstraints);
}
}
//260
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class440.addCheckboxToPanel(String name,boolean toSelect,JPanel panel,boolean toUpdate)#0{
    StateRestoringCheckBox cb = new StateRestoringCheckBox(name);
    cb.setSelected(toSelect);
    panel.add(cb);
}
}
//261
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class440.buildGUI()#1{
        p.add(UIUtilities.buildComponentPanelRight(cancelButton));
}
}
//262
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class820.createCustomComponent(Presentation presentation)#2{
    myButton = (JButton)super.createCustomComponent(presentation).getComponent(0);
    panel.add(myButton, BorderLayout.CENTER);
}
}
//263
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class380.createUsernamePanel(Action createProfileAction)#0{
        usernameVal = createTextField();
        userNameCont.add(usernameVal);
        assignKeyActionToComponent(createProfileAction, usernameVal);
}
}
//264
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class380.createUsernamePanel(Action createProfileAction)#1{
        JPanel userNameCont = createPanel();
        JLabel usernameLabel = createLabel("username *");
        userNameCont.add(usernameLabel);
}
}
//265
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.main(String[] args)#3{
        comp.add(new ConfigUI(new Config()), BorderLayout.CENTER);
}
}
//266
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.createCenterPanel()#0{
    panel.add(myActionsTree.getComponent());
}
}
//267
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.createSurnamePanel(Action createProfileAction)#0{
        surnameVal = createTextField();
        surnameCont.add(surnameVal);
        assignKeyActionToComponent(createProfileAction, surnameVal);
}
}
//268
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class610.createSurnamePanel(Action createProfileAction)#1{
        JPanel surnameCont = createPanel();
        JLabel surnameLabel = createLabel("surname *");
        surnameCont.add(surnameLabel);
}
}
//269
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class60.layoutComponents(JPanel panel){
        panel.add(tableViewToggleButton, "gapafter 5");
}
}
//270
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class60.createInfoPanel()#1{
        panel.add(createStatusPanel());
}
}
//271
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class60.createInfoPanel()#2{
        panel.add(createProgressPanel());
}
}
//272
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.createContentPane()#0{
    panel.add( createDocumentationPane(), BorderLayout.NORTH );
    panel.add( editorPanel, BorderLayout.CENTER );
}
}
//273
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildControlPanel()#0{
        controlPanel.add( this.buildResetPropertyButton());
}
}
//274
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildControlPanel()#1{
        controlPanel.add( this.buildClearModelButton());
}
}
//275
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildControlPanel()#3{
        controlPanel.add( this.buildRestoreModelButton());
}
}
//276
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class50.buildControlPanel()#4{
        controlPanel.add( this.buildPrintModelButton());
}
}
//277
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class360.updateInfo(String ifdName,RecognitionInfo info)#0{
      panel.add(createInfoLabel(ifdName, info));
}
}
//278
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class360.getBigCardImagePanel()#2{
  thePanel.add(getBigImage(), theCons);
}
}
//279
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class450.createTimePanel()#5{
        newPanel.add(timeSpinner);
}
}
//280
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createSelectionPanel()#0{
    select.add(createSelectionInput(), BorderLayout.CENTER);
}
}
//281
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createSelectionPanel()#1{
    select.add(createSelectionCommands(), BorderLayout.SOUTH);
}
}
//282
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createFindPanel()#0{
    p.add(createFindCommands(), BorderLayout.SOUTH);
}
}
//283
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class490.createFindPanel()#2{
    p.add(createFindInput(), BorderLayout.CENTER);
}
}
//284
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.buildOutgoingWssDetails()#0{
        panel.add(buildOutgoingEntryList(), BorderLayout.CENTER);
}
}
//285
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.buildOutgoingWssDetails()#2{
        panel.add(buildOutgoingEntriesToolbar(), BorderLayout.NORTH);
}
}
//286
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.buildTestSuiteList(WsdlProject testSuite)#3{
        p.add(buildTestCaseListToolbar(), BorderLayout.NORTH);
}
}
//287
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class160.init()#1{
        header.add(initSettingPanel(), BorderLayout.WEST);
        add(header, BorderLayout.NORTH);
}
}
//288
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.build(String orig)#2{
        p.add(tvalue, GBC.eop().insets(5, 0, 0, 0).fill(GBC.HORIZONTAL));
}
}
//289
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.createEastPanel()#3{
        ivjEastPanel.add(getArrowPanel(), getArrowPanel().getName());
}
}
//290
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.MyButton(char c,String name,BundlesProbesTabUI listener,JPanel panel)#0{
      panel.add(this);
}
}
//291
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class140.MyButton(char c,String iconName,String ttt,NodesTree listener,JPanel panel)#1{
      panel.add(this);
}
}
//292
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.addBottomEditorPanel(MockResponseMessageEditor responseEditor)#1{
        bottomEditorPanel.add(createMediaTypeCombo(), BorderLayout.NORTH);
        bottomEditorPanel.add(responseEditor, BorderLayout.CENTER);
}
}
//293
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.addTopEditorPanel()#1{
        topEditorPanel.add(createHeaderInspector(), BorderLayout.CENTER);
}
}
//294
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class590.addTopEditorPanel()#2{
        topEditorPanel.add(createHttpStatusPanel(), BorderLayout.NORTH);
}
}
//295
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.registerInfinitestWindow()#2{
    rootPanel.add(infinitestBuilder.createPluginComponent(testControl), BorderLayout.CENTER);
}
}
//296
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createContentPane()#1{
    contentPanel.add( BorderLayout.NORTH, createConnectionTopPanel() );
}
}
//297
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class460.createContentPane()#3{
    contentPanel.add( BorderLayout.CENTER, new JdbcConnectionPanel( dialogModel, context ) );
}
}
//298
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class310.buildGUI()#0{
    p.add(buildToolBar());
    p.add(area);
    add(p);
}
}
//299
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.createForenamePanel(Action createProfileAction)#0{
        firstnameVal = createTextField();
        firstNameCont.add(firstnameVal);
        assignKeyActionToComponent(createProfileAction, firstnameVal);
}
}
//300
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.createForenamePanel(Action createProfileAction)#1{
        JPanel firstNameCont = createPanel();
        JLabel firstNameLabel = createLabel("forename *");
        firstNameCont.add(firstNameLabel);
}
}
//301
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.getSouthLabel()#1{
    ok.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        dispose();
      }
    });
    result.add(ok);
}
}
//302
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.addSettingsSection(final JPanel p,String name,JPanel section,GBC gbc)#0{
        p.add(section, gbc.insets(20, 5, 0, 10));
}
}
//303
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.createDivideRightPanel()#2{
        ivjDivideRightPanel.add(getDivideRightScrollPane(), "Center");
}
}
//304
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class300.overlayCreateInterface()#1{
        toolTip = new ToolTipList(this);
        panel.add(toolTip, BorderLayout.CENTER);
}
}
//305
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.createAdvancedSettings()#0{
      jPanel.add(((WebProjectTemplate)myProjectGenerator).getPeer().getComponent());
}
}
//306
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.createBasePanel()#1{
    final LabeledComponent<TextFieldWithBrowseButton> component = createLocationComponent();
    component.setLabelLocation(BorderLayout.WEST);
    panel.add(component);
}
}
//307
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class330.addField(JPanel panel,JLabel label,JComponent field,GridBagConstraints gbc){
        panel.add(field, gbc);
        nextLine(gbc);
}
}
//308
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.createControlPanel()#2{
            digitsFld = new JIntegerField(numDigits, false);
            panel.add(digitsFld, "w 40!");
}
}
//309
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.PropertiesBar()#0{
        leftPanel.add(getFullScreenIcon(), BorderLayout.WEST);
}
}
//310
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.PropertiesBar()#1{
        leftPanel.add(selectionBar = new SelectionBar(), BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);
        setOpaque(false);
}
}
//311
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class180.createCenterPanel()#2{
      panel.add(editor.getComponent(), BorderLayout.CENTER);
}
}
//312
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.buildCheckBoxPanel()#0{
        taskListPanel.add(this.buildFlag1CheckBox());
}
}
//313
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.buildCheckBoxPanel()#1{
        taskListPanel.add(this.buildFlag2CheckBox());
}
}
//314
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.buildCheckBoxPanel()#3{
        taskListPanel.add(this.buildUnattachedCheckBox());
}
}
//315
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.buildCheckBoxPanel()#4{
        taskListPanel.add(this.buildNotFlag2CheckBox());
}
}
//316
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class290.PhoneGapPluginsView(@NotNull Project project)#0{
    wrapper.add(FormBuilder.createFormBuilder().addComponent(myPanel).addComponent(packagesNotificationPanel.getComponent()).getPanel());
}
}
//317
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class390.layoutCommitListPanel(@NotNull String currentBranch,boolean forward)#4{
    bth.add(forward ? myHeadToBranchListPanel : myBranchToHeadListPanel);
}
}
//318
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class80.createCombo(JPanel panel,Enum e)#0{
            cmb.setModel(new EnumComboBoxModel(e.getClass()));
            cmb.addActionListener(this);
            panel.add(cmb);
}
}
//319
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class80.initUserInterface()#2{
        JPanel contentPanel = buildContentPanel();
        mainPanel.add(contentPanel, BorderLayout.CENTER);
}
}
//320
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.addToPanel(JPanel panel,JComponent centerComponent,JComponent arrangedComponent,String borderLayoutConstraint){
        panel.add(arrangedComponent, borderLayoutConstraint);
}
}
//321
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.createTablePanel(final CayenneTable cayenneTable)#0{
        panel.add(cayenneTable.getTableHeader(), BorderLayout.NORTH);
        panel.add(cayenneTable, BorderLayout.CENTER);
}
}
//322
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.createUI(JPanel panel)#0{
        JPropertyPanel props = new JPropertyPanel(this);
        panel.add(props, BorderLayout.CENTER);
        props.init();
}
}
//323
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.createConsolePanel(ConsoleView view,ActionGroup actions)#2{
    panel.add(createToolbar(actions), BorderLayout.WEST);
}
}
//324
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class660.createItem(GrepProcessor processor,final OpenConsoleSettingsActionMouseInputAdapter mouseInputAdapter)#0{
    colorPanel.addMouseListener(mouseInputAdapter);
    label.addMouseListener(mouseInputAdapter);
    panel.add(label);
}
}
//325
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.createComponent()#0{
    JPanel component = createPanel();
    component.add(createHeader(), NORTH);
}
}
//326
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.createComponent()#1{
    component.add(createContent(), CENTER);
}
}
//327
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.createComponent()#2{
    component.add(createButtons(), SOUTH);
}
}
//328
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.setUpFinal()#2{
    js.setBorder(BorderFactory.createTitledBorder("Text"));
    holder.add(m_history, BorderLayout.WEST);
    add(holder, BorderLayout.CENTER);
}
}
//329
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class200.createCombinedSamplePanel()#2{
            combinedSamplePanel.add(Utility.addLeftJustifiedComponent(combinedLine1));
}
}
//330
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.createErrorPanel()#0{
        panel.add(createErrorPane(), BorderLayout.NORTH);
}
}
//331
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.createErrorPanel()#1{
        panel.add(createVisualizationPane(), BorderLayout.CENTER);
        container.add(panel, BorderLayout.CENTER);
}
}
//332
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.getTableCellRendererComponent(JTable table,Object value,boolean isSelected,final boolean hasFocus,int row,int column)#0{
      final Component component = super.getTableCellRendererComponent(table, ((Pair)value).getFirst(), isSelected, hasFocus, row, column);
      panel.add(component);
        new BooleanTableCellRenderer().getTableCellRendererComponent(table, ((Pair)value).getSecond(), isSelected, hasFocus, row, column);
}
}
//333
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class550.getTableCellRendererComponent(JTable table,Object value,boolean isSelected,final boolean hasFocus,int row,int column)#1{
        new BooleanTableCellRenderer().getTableCellRendererComponent(table, ((Pair)value).getSecond(), isSelected, hasFocus, row, column);
      panel.add(component1);
}
}
//334
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildMainPanel()#0{
        panel.add(this.buildControlPanel(), BorderLayout.SOUTH);
}
}
//335
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildMainPanel()#3{
        panel.add(this.filteringListPanel, BorderLayout.CENTER);
}
}
//336
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#0{
        personPanel.add(this.buildBirthDateSpinner());
}
}
//337
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#1{
        personPanel.add(this.buildGoneWestDateSpinner());
}
}
//338
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#3{
        personPanel.add(this.buildNameTextField());
}
}
//339
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#4{
        personPanel.add(this.buildAdventureCountSpinner());
}
}
//340
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#5{
        personPanel.add(this.buildEyeColorComboBox());
}
}
//341
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#6{
        personPanel.add(this.buildEvilCheckBox());
}
}
//342
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.buildPersonPanel()#7{
        personPanel.add(this.buildRankSpinner());
}
}
//343
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class570.componentFor(Object o)#0{
        SmartVanillaViewer subview=new SmartVanillaViewer(tc.classifier);
        subview.setSuperView(this);
        panel.add(subview);
}
}
//344
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#1{
        panel.add(this.buildPositionSettingsControlPanel());
}
}
//345
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#2{
        panel.add(this.buildAddButton());
}
}
//346
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#3{
        panel.add(this.buildSizesControlPanel());
}
}
//347
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#1{
        panel.add(this.buildMax10Button());
}
}
//348
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#2{
        panel.add(this.buildSwapButton());
}
}
//349
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#3{
        panel.add(this.buildPrintButton());
}
}
//350
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#4{
        panel.add(this.buildNullButton());
}
}
//351
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class530.buildControlPanel()#5{
        panel.add(this.buildStringButton());
}
}
//352
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.createDetailsComponent(String caption,String detailsContent)#1{
        detailsComponent.add(IssueDetailsPanel.createShowStackTraceButton(caption, detailsContent));
}
}
//353
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.a()#1{
        jpanel.add(this.b(), "Center");
}
}
//354
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.a()#3{
        jpanel.add(new GuiStatsComponent(this.c), "North");
}
}
//355
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class480.init()#2{
        vertPanel.add(makeTitlePanel());
        add(vertPanel, BorderLayout.NORTH);
}
}
//356
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class340.createCustomComponent(Presentation presentation)#2{
    panel.add(
      createComboBoxButton(presentation),
      new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(2, 1, 2, 1), 0, 0));
}
}
//357
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.createCenterPanel()#0{
        centerPanel.add(getCenterSplitPanel(), BorderLayout.CENTER);
}
}
//358
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#1{
        controlPanel.add(this.buildRestoreModelButton());
}
}
//359
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#2{
        controlPanel.add(this.buildPrintModelButton());
}
}
//360
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#3{
        controlPanel.add(this.buildAddTenButton());
}
}
//361
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#4{
        controlPanel.add(this.buildRemoveTenButton());
}
}
//362
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#5{
        controlPanel.add(this.buildResetColorButton());
}
}
//363
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildModelControlPanel()#6{
        controlPanel.add(this.buildClearModelButton());
}
}
//364
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildComboBoxPanel()#0{
        panel.add(this.buildDefaultListChooser());
}
}
//365
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildComboBoxPanel()#2{
        panel.add(this.buildListChooser2());
}
}
//366
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildComboBoxPanel()#3{
        panel.add(this.buildListChooser1());
}
}
//367
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildControlPanel()#0{
        controlPanel.add(this.buildRefreshButton());
}
}
//368
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildControlPanel()#3{
        controlPanel.add(this.buildDumpSelectedGroupsButton());
}
}
//369
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildControlPanel()#4{
        controlPanel.add(this.buildAutoRefreshCheckBox());
}
}
//370
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildControlPanel()#0{
        controlPanel2.add(this.buildClearButton());
}
}
//371
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildControlPanel()#2{
        controlPanel2.add(this.buildCopyButton());
}
}
//372
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildToolbar()#0{
        panel.add(buildToolbar1(), BorderLayout.NORTH);
}
}
//373
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class170.buildToolbar()#1{
        panel.add(buildToolbar2(), BorderLayout.SOUTH);
}
}
//374
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class840.show(Container pane,Object ctx)#0{
        panel = new ConnectGamePanel(client);
        envelope.add(panel);
        pane.add(envelope, BorderLayout.CENTER);
}
}
//375
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class840.createInstitutionPanel(Action createProfileAction)#0{
        JPanel institutionCont = createPanel();
        JLabel institutionLabel = createLabel("institution *");
        institutionCont.add(institutionLabel);
}
}
//376
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class840.createInstitutionPanel(Action createProfileAction)#1{
        institutionVal = createTextField();
        institutionCont.add(institutionVal);
        assignKeyActionToComponent(createProfileAction, institutionVal);
}
}
//377
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.buildInteractionListPanel()#4{
        panel.add(scrollPane, BorderLayout.CENTER);
}
}
//378
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.buildButtonPanel()#1{
        buttonPanel.add(this.buildAddButton());
}
}
//379
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.buildButtonPanel()#2{
        buttonPanel.add(this.buildRemoveButton());
}
}
//380
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class270.buildButtonPanel()#3{
        buttonPanel.add(this.buildRenameButton());
}
}
//381
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.addField(final JPanel content,final GridBagConstraints gbc,final String text,final String value,final String unit)#0{
            content.add(createTextField(value), gbc);
}
}
//382
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.buildToolBarPanel()#2{
        panel.add(this.buildMainToolBar());
}
}
//383
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class410.buildToolBarPanel()#3{
        panel.add(this.selectionToolBar);
}
}
//384
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.buildContent()#0{
        content.add(buildButtons(), BorderLayout.SOUTH);
}
}
//385
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.createContentPane()#1{
    contentPane.add( createNamePanel(), BorderLayout.NORTH );
}
}
//386
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.createContentPane()#2{
    contentPane.add( createSelectionPane(), BorderLayout.CENTER );
}
}
//387
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.main(String[] args)#2{
        panel.add(new PpiComboBox());
}
}
//388
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class20.main(String[] args)#1{
        panel.add(new PositionPanel(new PrintLayoutModel(100, 100)));
}
}
//389
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class280.createPageUIContentPane(JPanel pane){
        JPanel contentPane = GridBagUtils.createPanel();
        final GridBagConstraints gbc = GridBagUtils.createConstraints("fill=HORIZONTAL,anchor=NORTHWEST");
        contentPane.add(pane, gbc);
        GridBagUtils.addVerticalFiller(contentPane, gbc);
}
}
//390
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class600.getContents()#0{
    contents.add(getButtonPanel(), BorderLayout.SOUTH);
}
}
//391
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class600.getContents()#2{
    contents.add(getInputPanel(), BorderLayout.CENTER);
}
}
//392
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class850.fillMainPanel(SensorsScenarioView scenarioView)#1{
    DevicePanel devicePanel = new DevicePanel(Global.W_DEVICE_SMALL,
        Global.H_DEVICE_SMALL, mModel, scenarioView);
    panel.add(devicePanel, BorderLayout.CENTER);
    panel.setMinimumSize(devicePanel.getPreferredSize());
}
}
//393
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.buildPropertyTestingPanel()#2{
        propertyListPanel.add( this.buildPropertyListPanel());
}
}
//394
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.buildPropertyTestingPanel()#0{
        propertyTestingPanel.add( this. buildProjectClassPanel(), BorderLayout.NORTH);
}
}
//395
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class690.createContentPane()#0{
        panel.add(table(tableModel = new AppsTableModel(), selectedRow = new AtomicInteger(-1)),BorderLayout.CENTER);
}
}
//396
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class520.createRecentProjects()#1{
      panel.add(new NewRecentProjectPanel(this), BorderLayout.CENTER);
}
}
//397
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class520.createOptionsPanel()#1{
    panel.add(new SingleCheckboxOptionsPanel("Ignore fields used in multiple methods", this, "IGNORE_FIELDS_USED_IN_MULTIPLE_METHODS"), BorderLayout.NORTH);
    panel.add(listPanel, BorderLayout.CENTER);
}
}
//398
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class620.buildControlPanel()#0{
        controlPanel.add(this.buildCaseSensitiveCheckBox());
}
}
//399
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class620.buildControlPanel()#1{
        controlPanel.add(this.buildAllowZedCheckBox());
}
}
//400
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class620.buildControlPanel()#2{
        controlPanel.add(this.buildButtonPanel());
}
}
//401
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class620.buildControlPanel()#4{
        controlPanel.add(this.buildOriginalNameIsLegalCheckBox());
}
}
//402
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class580.buildTabbedServerPreferences()#1{
        pnl.add(getTabPane(), BorderLayout.CENTER);
}
}
//403
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createResultPanel(@NotNull JPanel form)#0{
    p.add(createHyperlink(), BorderLayout.SOUTH);
}
}
//404
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createContent(@NotNull ConsoleView consoleView,@NotNull JstdServerStatusView capturingView)#1{
    panel.add(capturingView.getComponent(), BorderLayout.NORTH);
}
}
//405
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class210.createCenterPanel()#2{
    JComponent toolbar = createToolbar();
    result.add(toolbar, BorderLayout.NORTH);
}
}
//406
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createContentPane()#1{
        mainPanel.add(createToolBar(), BorderLayout.NORTH);
}
}
//407
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createContentPane()#2{
        mainPanel.add(createMiddlePanel(), BorderLayout.CENTER);
}
}
//408
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.createGeneralTab()#1{
    Box box = createHorizontalBox();
    box.add(logo());
    panel.add(box);
}
}
//409
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class800.run()#5{
                p.add(new JMultilineLabel(message),GBC.eol());
}
}
//410
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.addCustomControls(JPanel panel)#0{
    projectChooser = new JComboBox<>();
    panel.add(projectChooser, BorderLayout.CENTER);
    projectChooser.addItemListener(this);
}
}
//411
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.createButtonsPanel()#0{
        removeButton = ToolButtonFactory.createButton(new RemoveAliasAction(), false);
        removeButton.setEnabled(false);
        buttonsPanel.add(removeButton, BorderLayout.SOUTH);
}
}
//412
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.createTree()#0{
        panel.add(createRepoPanel(), BorderLayout.NORTH);
}
}
//413
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.createTree()#1{
        panel.add(createResourcePanel(), BorderLayout.CENTER);
}
}
//414
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class510.createSearchPanel()#2{
        panel.add(librarySearchField, LIBRARY_SEARCH_FIELD);
}
}
//415
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createOptionsPanel()#0{
    wholePanel.add(myPanel.getPanel(), BorderLayout.CENTER);
    wholePanel.add(mySharedCheckbox, BorderLayout.SOUTH);
}
}
//416
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createComponent_a_1()#0{
    component.add(createComponent_a0());
}
}
//417
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createComponent_a_1()#1{
    component.add(createComponent_b0());
}
}
//418
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createComponent_a_1()#2{
    component.add(createComponent_c0());
}
}
//419
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createPane()#2{
    pane.add(createInfoPane(), BorderLayout.CENTER);
}
}
//420
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class70.createPane()#3{
    pane.add(createPathPane(), BorderLayout.SOUTH);
}
}
//421
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.showAlternativeView()#0{
        parent.add(alternativeView, BorderLayout.CENTER);
        alternativeView.setVisible(true);
}
}
//422
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.main(String[] args)#1{
        panel.add(new ButtonPanel());
}
}
//423
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class370.main(String[] args)#2{
        panel.add(new ColorText(new Color(1, 2, 3)));
}
}
//424
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class830.buildTestingPanel()#1{
        testPanel.add( this.buildAddSessionButton());
}
}
//425
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class830.createComponent()#0{
    result.add(createOptionsPanel(), BorderLayout.SOUTH);
}
}
//426
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationContent()#3{
    confMain.add(createCarDetails(), BorderLayout.CENTER);
}
}
//427
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationPanel()#1{
    confirm.add(createConfirmationContent(), BorderLayout.CENTER);
}
}
//428
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class730.createConfirmationPanel()#2{
    confirm.add(createConfirmCommands(), BorderLayout.SOUTH);
}
}
//429
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class640.createOptionsPanel()#1{
    rootPanel.add(new CheckBox("Ignore overridden functions", this, "ignoreOverriddenFunctions"), BorderLayout.NORTH);
}
}
//430
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class640.createOptionsPanel()#2{
    rootPanel.add(new ListEditForm("Excluded base classes", ignoredBaseClasses).getContentPanel(), BorderLayout.CENTER);
}
}
//431
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.buildMainPanel()#1{
        panel.add(this.buildTreePane(), BorderLayout.CENTER);
}
}
//432
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.createCenterPanel()#0{
    contentPane.add(createNamePanel(), BorderLayout.CENTER);
}
}
//433
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class100.createCenterPanel()#1{
    contentPane.add(createCBPanel(), BorderLayout.SOUTH);
}
}
//434
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class740.addDimPanel(JPanel basicPanel){
    basicPanel.add(dimPanel);
}
}
//435
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.createCenterPanel()#0{
    panel.add(createListAndVisibilityPanels(), BorderLayout.CENTER);
}
}
//436
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.buildExceptionTablePane()#0{
        addExceptionPane = new AddExceptionPane(services);
        exceptionTablePane = new ExceptionTableDetailPane(services);
        exceptionsPane.add(exceptionTablePane, BorderLayout.CENTER);
}
}
//437
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class700.topPanel()#1{
      panel.add(panelWithSize(300, 600), c);
      panel.add(button, c);
}
}
//438
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.RuntimeInfo()#0{
       contentPane.add(makeInfoPanel(), BorderLayout.CENTER);
}
}
//439
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.RuntimeInfo()#1{
       contentPane.add(makeBtnPanel(), BorderLayout.SOUTH);
}
}
//440
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.init()#1{
        ldapDefaultPanel = new LdapExtConfigGui(false);
        mainPanel.add(ldapDefaultPanel);
        add(mainPanel, BorderLayout.CENTER);
}
}
//441
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.buildMiscPanel()#0{
        miscPanel.add(this.buildRemoveButton());
}
}
//442
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.buildMiscPanel()#1{
        miscPanel.add(this.buildResetButton());
}
}
//443
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.buildMiscPanel()#2{
        miscPanel.add(this.buildClearChildrenButton());
}
}
//444
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.buildAddRenameNodePanel()#0{
        addRenameNodePanel.add(this.buildRenameButton(), BorderLayout.EAST);
}
}
//445
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class790.buildAddRenameNodePanel()#2{
        addRenameNodePanel.add(this.buildAddButton(), BorderLayout.WEST);
        addRenameNodePanel.add(this.nameTextField, BorderLayout.CENTER);
}
}
//446
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class670.createEmailPanel(Action createProfileAction)#0{
        JPanel emailCont = createPanel();
        JLabel emailLabel = createLabel("email *");
        emailCont.add(emailLabel);
}
}
//447
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class670.createEmailPanel(Action createProfileAction)#1{
        emailVal = createTextField();
        emailCont.add(emailVal);
        assignKeyActionToComponent(createProfileAction, emailVal);
}
}
//448
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.createButtonPanel()#0{
            ok.addActionListener(new OKButtonAction());
            panel.add(ok);
}
}
//449
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#1{
        controlPanel.add( this.buildClearModelButton());
}
}
//450
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#2{
        controlPanel.add( this.buildPrintModelButton());
}
}
//451
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildMainPanel()#0{
        mainPanel.add( this.buildControlPanel(), BorderLayout.SOUTH);
}
}
//452
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildMainPanel()#2{
        mainPanel.add( this.buildTestingPanel(), BorderLayout.NORTH);
}
}
//453
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#0{
        controlPanel.add(this.buildPreviousButton());
}
}
//454
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#1{
        controlPanel.add(this.buildClearButton());
}
}
//455
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#2{
        controlPanel.add(this.buildNextButton());
}
}
//456
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class720.buildControlPanel()#3{
        controlPanel.add(this.buildPrintButton());
}
}
//457
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.messageAndProgressBar(final String message)#0{
      _progress = new JProgressBar();
      panel.add(_progress, BorderLayout.SOUTH);
}
}
//458
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.messageAndProgressBar(final String message)#2{
      panel.add(messageControl(message), BorderLayout.CENTER);
}
}
//459
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class110.createPriorityAndExpiration(){
        JPanel panel = new HorizontalPanel();
        panel.add(priority);
}
}
//460
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class760.main(String[] args)#0{
        panel.add(new ResetButton(null));
}
}
//461
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class760.createNewBattleDialogPanel()#1{
    panel.add(getTabbedPane(), BorderLayout.CENTER);
}
}
//462
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class760.createNewBattleDialogPanel()#4{
    panel.add(getWizardController(), BorderLayout.SOUTH);
}
}
//463
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class750.buildQueryMatchPanel()#0{
        panel.add(buildQueryMatchToolbar(), BorderLayout.NORTH);
}
}
//464
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class150.addField(JPanel p,GridBagConstraints gbc,JLabel l,JComponent t,int x,int y){
    p.add(t, gbc);
}
}
//465
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createContentPane()#1{
        contentPane.add(createDetailTextArea(), BorderLayout.SOUTH);
}
}
//466
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createContentPane()#2{
        contentPane.add(createTopButtonPanel(), BorderLayout.NORTH);
}
}
//467
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createContentPane()#3{
        contentPane.add(createBenchmarkTreePanel(), BorderLayout.CENTER);
}
}
//468
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createSouthPanel()#1{
            ivjSouthPanel.add(getElementIcon(), "West");
}
}
//469
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class30.createSouthPanel()#4{
        ivjSouthPanel.add(getButtonPanel1(), "East");
}
}
//470
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildUpdateIntervalPanel()#1{
        pnl.add(tfUpdateInterval = new JosmTextField(5));
        lblUpdateInterval.setLabelFor(tfUpdateInterval);
        SelectAllOnFocusGainedDecorator.decorate(tfUpdateInterval);
}
}
//471
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#1{
        controlPanel.add(this.buildSchemaReloadButton(), BorderLayout.SOUTH);
}
}
//472
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#0{
        controlPanel.add(this.buildDirectFieldSelectableToggle());
}
}
//473
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#1{
        controlPanel.add(this.buildComplexFieldSelectableToggle());
}
}
//474
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#2{
        controlPanel.add(this.buildChangePrefixesButton());
}
}
//475
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#4{
        controlPanel.add(this.buildMultiElementSelectableToggle());
}
}
//476
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildControlPanel()#5{
        controlPanel.add(this.buildLoadSchemaButton());
}
}
//477
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildButtonPanel()#0{
        buttonPanel.add(this.buildDeleteButton());
}
}
//478
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class630.buildButtonPanel()#3{
        buttonPanel.add(this.buildAddButton());
}
}
//479
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.createOptionsPanel()#1{
    panel.add(EntryPointsManagerImpl.createConfigureAnnotationsButton(),
              new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                                     new Insets(0, 0, 0, 0), 0, 0));
}
}
//480
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class350.buildComparePairSelectionPanel()#2{
        cbComparePair.setRenderer(new ComparePairListCellRenderer());
        p.add(cbComparePair);
}
}
//481
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class400.buildPanel()#1{
        panel.add(this.buildGCButton());
}
}
//482
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class400.buildControlPanel()#1{
        controlPanel2.add(this.buildOKButton(), BorderLayout.LINE_END);
}
}
//483
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class400.buildControlPanel()#2{
        controlPanel2.add(this.buildHelpButton(), BorderLayout.LINE_START);
}
}
//484
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class430.createHeader()#2{
      panel.add(gauge, SOUTH);
}
}
//485
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class430.createTablePanel()#2{
        matrixTable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        mainPanel.add(BorderLayout.CENTER, matrixTable);
}
}
