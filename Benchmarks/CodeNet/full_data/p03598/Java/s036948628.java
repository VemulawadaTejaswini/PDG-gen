    /**
     * 概要:一行目には、短く端的にメソッドを説明する。
     *
     * 詳細:二行目からは、メソッド内容についての詳しい説明をする。
     *
     * 使用例:使用例がないとき、”なし”にしてください。 Modification Log
     * ========================================================================
     * yyyy.mm.dd Author Comment Bookmark
     * ======================================================================== ##
     * 2007.08.19 zouxiangwei Open Messsage's Dialog for delete data
     * #DeleteData#
     *
     * 改定履歴<br>
     * Modification Log
     * ========================================================================
     * yyyy.mm.dd Author Comment Bookmark
     * ========================================================================
     *  ## 2007.08.22 sunbin display real range from timeDisplayRule #GETRANGE# ##
     * <pre>
     * </pre>
     *
     * @param node
     */

    public void showDialog(String dialogID, GaiaComponent component) {
    	// 2017/02/14 y.murakami #720 一か月経過表 start
    	if(this.matrixSetting.isOneMonthView()){//2017/06/12 y.murakami 一か月経過表月区切りで太線にする
    		return;
    	}
    	// 2017/02/14 y.murakami #720 一か月経過表 end
        //#管理番号11-324# #start#
		if (!((MatrixModel) this.model).isDataUpdatable() // #2014-03212# #172-814# FIX
			&& (dialogID.equals(inputDialogID) ||  dialogID.equals(itemInsertDialogID))) {
            return;
        }
        //#管理番号11-324# #end#
        // # 管理番号84-47 # # START #
        if (this.mouseX < matrixSetting.getLabelWidth() && this.mouseX >= 0) { // #
                                                                                // 管理番号49-556#
            // # 管理番号 49-557 #
            if (this.mouseX <= matrixSetting.getLabelWidth()) {
                long nowTime = GaiaTime.currentTimeMillis();
                if (nowTime < startTime) {
                    pointTime = startTime;
                } else if (nowTime > startTime + timeScale) {
                    pointTime = startTime + timeScale - 60 * 1000L;
                } else {
                    pointTime = GaiaTime.currentTimeMillis();
                }
            }
            // # 管理番号 49-557 #
        } else if (this.mouseX >= 0) {
            pointTime = TimeScaleData.pointToTime(
                    matrixSetting.getLabelWidth(),
                    this.getPreferredSize().width
                            - matrixSetting.getHirozonTotalWidth(),
                    ((MatrixModel) model).getStartTime(), ((MatrixModel) model)
                            .getEndTime(), this.mouseX);
        }
        // # 管理番号84-47 # # END #
        int rowNo = this.getRowNo(this.mouseY);// #管理番号74-116#
        //#管理番号20-1336#START##
        if(4==this.matrixSetting.getHospitalIndex() && checkModelAndDisplayType()){
            rowNo = (rowNo%2==0?rowNo:rowNo-1);
        }

        // 2015/02/20 ipl 【標準】項目追加時に対象外のデータの合計量が表示される不具合修正
        if (dialogID.equals(itemInsertDialogID)) {
            // 2015/10/09 ipl 【大阪母子】水分OUTの不具合修正
//			rowNo = ((MatrixModel) model).getRowDataList().size() - 1;
            if (this.matrixSetting.isVerticalTotalFlag()) {
                rowNo = ((MatrixModel) model).getRowDataList().size() - 2;
            } else {
                rowNo = ((MatrixModel) model).getRowDataList().size() - 1;
            }

        }

        //#管理番号20-1336#END##
        MatrixRowData row = ((MatrixModel) model).getRowDataList().get(rowNo);
        // ## #ShowDialog# START##
        if ((dialogID.equals(this.inputDialogID) || dialogID
                .equals(this.dataListDialogID))
                && !row.isOpenDialog()) {
            this.setRowSelected(rowNo); // ## #管理番号75-480#
            // ## #ShowDialog# END##
            Object[] arg0 = new Object[8];
            arg0[0] = this;
            Vector<Parameter> parameterList = new Vector<Parameter>();
            if (row.getAttribute("Parameter") != null) {
                Parameter p = new Parameter();
                p.setRelationID("CRITICORE");
                p.setParameterID("OLD_VOL");
                parameterList.add(p);
            }
            arg0[1] = parameterList;
            arg0[2] = Long.valueOf(this.dataInterval);
            arg0[3] = Long.valueOf(this.startTime);
            arg0[4] = null;

            arg0[5] = Long.valueOf(this.timeScale);
            if (this.dataInterval == 0) {
                pointTime = pointTime / 60000 * 60000;
            } else {
                pointTime = pointTime / this.dataInterval * this.dataInterval;
            }
            arg0[6] = Long.valueOf(pointTime);
            arg0[7] = Integer.valueOf(0);
            gaiaComponentSink.showDialog("NumListEditor", arg0);
            return;
        }
        MatrixDataCondition cond = new MatrixDataCondition();
        cond.setFurtureTimeInput(this.matrixSetting.isFurtureTimeInput());
        cond.setVolumeType(((MatrixModel) model).getRowDataList().get(rowNo)
                .getVolumeType());
        // ## CalendarRange #
        cond.setTimeScale(this.timeScale);
        // ## CalendarRange # # START #
        long sTime = this.startTime;
        if (((MatrixModel) model).getRowDataList().get(rowNo).getAttribute(
                "StartTime") != null)
            sTime = Long.parseLong(((MatrixModel) model).getRowDataList().get(
                    rowNo).getAttribute("StartTime").toString());
        if (sTime != 0L && sTime > this.startTime)
            cond.setStartTime(sTime);
        else
            cond.setStartTime(this.startTime);
        // ##管理番号20-271# START##
        if (cond.getStartTime() <= this.model.getDataHolder().getPatAdmissionTime()
                &&this.isEditControlByAdmission()) {
            cond.setStartTime(this.model.getDataHolder().getPatAdmissionTime());
        }
        // ##管理番号20-271# END##
        long endTime = this.startTime + this.timeScale;
        if (this.matrixSetting.isFurtureTimeInput()
                && ((MatrixModel) model).getRowDataList().get(rowNo)
                        .getAttribute("EndTime") != null)
            endTime = Long.parseLong(((MatrixModel) model).getRowDataList()
                    .get(rowNo).getAttribute("EndTime").toString());
        if (endTime != -1L && endTime < this.startTime + this.timeScale)
            cond.setEndTime(endTime);
        else
            cond.setEndTime(this.startTime + this.timeScale-60*1000L);//#管理番号185-11#
        // ## CalendarRange # # END #
        cond.setRootName(((MatrixModel) model).getRowDataList().get(rowNo)
                .getContent());
        cond.addAttribute("ShowNowTime", this.matrixSetting.isNowTimeInput()?true:hasNowTime()); // ## SetNowTime #,#管理番号134-73#
        if (this.pointTime < this.startTime
                || this.pointTime >= this.startTime + this.timeScale)
            this.pointTime = this.timeScale + this.startTime;
        // 2015/02/16 ipl【標準】現在時刻ボタンの制御変更(No.93)
        if (isDialogShowedAtDischargeTime(dialogID)) {
            this.pointTime = super.getModel().getDataHolder().getPatDischargeTime();
        }

        cond.setPointTime(this.pointTime);
        cond.setItemType(((MatrixModel) model).getRowDataList().get(rowNo)
                .getItemType());
        cond.setItemNo(((MatrixModel) model).getRowDataList().get(rowNo)
                .getItemNo());
        cond.setItemName(((MatrixModel) model).getRowDataList().get(rowNo)
                .getContent());
        cond.setWriteCondition(this.getWriteDataCondition());
        cond.setWriteConditionList(this.getWriteConditionList()); //#管理番号47-1503#
        cond.setMedicineName(((MatrixModel) model).getRowDataList().get(rowNo)
                .getMedicineName());
        cond.setRowList(((MatrixModel) model).getRowDataList());
        cond.setVecData(this.vecData);
        cond.setRowNo(rowNo);
        cond.setUnit(((MatrixModel) model).getRowDataList().get(rowNo)
                .getSubContent());

        cond.setHightVolume(((MatrixModel) model).getRowDataList().get(rowNo)
                .getHightVolume());
        cond.setCommond(getCommond(pointTime, rowNo));
        cond.setUsageCode(((MatrixModel) model).getRowDataList().get(rowNo)
                .getUsage());
        cond.setRoot(((MatrixModel) model).getRowDataList().get(rowNo)
                .getRoot());
        cond.addAttribute("StartAtHour", ((MatrixModel) this.model)
                .getStartAtHour());
        cond.setBeforePointTimeDay(this.getBeforePointTimeDay());//#管理番号131-93# add
        cond.addAttribute("Title", this.getInnerWindow().getTitle());
        if (this.masterID != null && !"".equals(this.masterID))
            cond.addAttribute("MasterID", this.masterID);
        else {
            cond.addAttribute("MasterID", ((WaterOutComponentModel) this.model)
                    .getMasterID());
        }
        //#管理番号47-1503# start
        if(this.masterIDList !=null && this.masterIDList.size()!=0)
            cond.addAttribute("masterIDList", this.masterIDList);
        if(this.attributeMap !=null && this.attributeMap.size()!=0) //#管理番号130-98# add
            cond.addAttribute("attributeMap", this.attributeMap); //#管理番号130-98# add
        //#管理番号47-1503# end
        if(this.uniqueNodeList !=null && this.uniqueNodeList.size()!=0) //#管理番号7-202# add
            cond.addAttribute("uniqueNodeList", this.uniqueNodeList);   //#管理番号7-202# add
        if (dialogID.equals(""))
            return;
        if (this.commentMasterID != null && this.commentMasterID.length() != 0) {
            cond.addAttribute("CommentMasterID", this.commentMasterID);
        }
        //#管理番号97-224# #START#
        if (drainCategoryCodes != null) {
            int categoryCode = WeekBalanceConstants.getCategoryCode(((MatrixModel) model).getRowDataList().get(rowNo).getItemData());
            cond.addAttribute("isDrain", drainCategoryCodes.contains(categoryCode));
        }
        //#管理番号97-224# #END#
        if (dialogID.equals(dataListDialogID)
                || dialogID.equals(this.inputDialogID)) {// #管理番号84-33#
            cond.setStartTime(this.startTime);
            cond.setTimeScale(this.timeScale);
            cond.setEndTime(this.startTime + this.timeScale-60*1000L);//#管理番号185-11#
            // #管理番号84-33# START ##
            long dischargeTime = this.model.getDataHolder()
                    .getPatDischargeTime();
            if (this.startTime + this.timeScale-60*1000L > dischargeTime) {//#管理番号185-11#
                cond.setEndTime(dischargeTime);
            }
            // #管理番号84-33# END ##
        }
        // 2015/04/17 ipl 【大阪母子】未来時刻部分クリック時ダイアログの初期時刻をクリック時刻とする
        cond.setChangeClickTimeFutureToCurrent(super.isChangeClickTimeFutureToCurrent());

        Object[] arg = new Object[3]; //#管理番号20-1458,20-1462#
        arg[0] = this;
        arg[1] = cond;
        arg[2] = this.getSpecialMedicineList(); //#管理番号20-1458,20-1462#

        if (dialogID.equals("ItemDataHistoryDialog")) {
            //#131-172#begin
            //Object[] a = new Object[6];
            Object[] a = new Object[7];
            //#131-172#end
            if (component instanceof MedicineComponent) {
                MedicineComponentModel mo = (MedicineComponentModel) (this
                        .getModel());
                List<String> displayLists = mo.getDisplayList();
                a[0] = this;
                a[1] = this.getComponentId();
                a[2] = 0;
                a[3] = displayLists;
                // ## #GETRANGE# STRAT ##
                a[4] = startTime;
                a[5] = timeScale;
                // ## #GETRANGE# END ##
            } else {
                List<ReadDataCondition> displayLists = this
                        .getReadDataConditions();
                a[0] = this;
                a[1] = this.getComponentId();
                a[2] = 0;
                a[3] = displayLists;
                // ## #GETRANGE# STRAT ##
                a[4] = startTime;
                a[5] = timeScale;
                // ## #GETRANGE# END ##
            }

            //#131-172#begin
            a[6] = row.getItemData();
            //#131-172#end
            //#管理番号12-890# start
            if (((MatrixModel) this.model).isDataUpdatable()) {
                gaiaComponentSink.showDialog(dialogID, a);
            } else {
                gaiaComponentSink.showDialog(a, dialogID);
            }
//			gaiaComponentSink.showDialog(dialogID, a);
            //#管理番号12-890# end
        } else {

            if (dialogID.equals(this.deleteDialogID)
                    && this.vecData.size() >= 1) {//#管理番号20-1336#
                // ## #DeleteData# START ##
            	// 2016/09/09 ipl 【標準】水分OUT CPの持続入力機能の追加
//                String errMsg = cond.getItemName() + " \n   ";
//                //#管理番号84-289# #start#
////				if (this.vecData.get(0).getContent().indexOf("<") >= 0) {
////					errMsg = errMsg
////							+ sdf
////									.format(new Date(this.vecData.get(0)
////											.getTime()))
////							+ this.vecData.get(0).getContent()
////							+ " \n を削除します。よろしいですか？";
////				} else {
//                //#管理番号20-1336#START##
//                for(int i = 0 ;i<this.vecData.size();i++){
//                errMsg = errMsg
//                        + sdf
//                                .format(new Date(this.vecData.get(i)
//                                        .getTime())) + " <"
//                        + this.vecData.get(i).getContent()
//                        + "> \n   ";
//                }
//                errMsg+= "を削除します。よろしいですか？";
            	boolean isFluxData = WaterOutSettingPanel.INPUT_FLUX_STRING.equals(cond.getVolumeType());
        		StringBuilder sb = new StringBuilder();
        		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd HH:mm");
        		for (int i = 0; i < this.vecData.size(); i++) {
        			MatrixData data = this.vecData.get(i);
        			sb.append(Constants.STR_SPACE_FULL_WIDTH);
        			sb.append(dateFormat.format(new Date(data.getTime())));
        			sb.append(TouchPanelConstants.STR_NEWLINE);
        			sb.append(Constants.STR_SPACE_FULL_WIDTH);
        			sb.append(cond.getItemName());
        			// 2016/11/16 ipl 【標準】水分OUT CPの持続入力機能の改修
//        			if (isFluxData) {
//        				sb.append("(持続)");
//        			}
        			ActedItem acted= GaiaUtil.getActedItemFromInputTime(((MatrixModel) model).getRowDataList().get(rowNo).getItemData()
        																, data.getTime()
        																);
        			
        			sb.append(Constants.STR_SPACE_FULL_WIDTH);
        			if (isFluxData) {
        				// 2016/11/16 ipl 【標準】水分OUT CPの持続入力機能の改修
//        				sb.append(data.getContent());
        				if (acted != null
        				 && !GaiaUtil.isEmptyString(acted.getValueOfString())
               			) {
        					sb.append(acted.getValueOfString());
        				//#6159 ◇OUT系CPで持続入力する際にデータの削除ダイアログ上にコメントが表示される start
//        				} else if (!GaiaUtil.isEmptyString(data.getContent())) {
        					// 微量
//        					sb.append(data.getContent());
        				} else if (!GaiaUtil.isEmptyString(data.getComment())) {
        					// 微量
        					sb.append(data.getComment());
        				//#6159 ◇OUT系CPで持続入力する際にデータの削除ダイアログ上にコメントが表示される end
        				}
        				
        			} else {
        				sb.append(TouchPanelConstants.LEFT_ANGLEBRACKET);
        				sb.append(data.getContent());
        				sb.append(TouchPanelConstants.RIGHT_ANGLEBRACKET);
        			}
        			// 2016/11/16 ipl 【標準】水分OUT CPの持続入力機能の改修
//        			if (RootConstants.isDoubleString(data.getContent())) {
//        				sb.append(cond.getUnit());
//        			}
        			if (acted != null
        			 &&	RootConstants.isDoubleString(acted.getValueOfString())
        			) {
        				sb.append(cond.getUnit());
        			}
        			
        			sb.append(TouchPanelConstants.STR_NEWLINE);
        		}
            	sb.append("　を削除します。よろしいですか？");
            	String errMsg = sb.toString();
            	
                //#管理番号20-1336#END##
//				}
                ////#管理番号84-289# #end#
                Object[] options = { "OK", "キャンセル" };
                int result = JOptionPane.showOptionDialog(null, errMsg,
                        "データの削除ー"+this.getInnerWindow().getTitle(), JOptionPane.DEFAULT_OPTION,//#管理番号13-1268#
                        // 2016/09/09 ipl 【標準】水分OUT CPの持続入力機能の追加
//                        JOptionPane.INFORMATION_MESSAGE, null, options,
                        JOptionPane.PLAIN_MESSAGE, null, options,
                        
                        options[0]);
                if (result != 0) {
                    return;
                }
                // ## #DeleteData# END ##
                ((MatrixModel) this.model).delData(cond.getItemNo(), cond
                        .getVecData());
            } else {
                // ## #管理番号75-480# START ##
                if (!(dialogID.equals("WaterOutInsert") || dialogID
                        .equals("MoveItem"))) {
                    this.setRowSelected(rowNo);
                }
                // ##管理番号84-27# START ##
                if (dialogID.equals(this.dataListDialogID)) {
                    cond.setStartTime(this.startTime);
                }
                // ##管理番号84-27# END ##
                // 2017/05/31 ipl 【多摩総合】出血量自動計算機能対応↓↓↓
                WaterOutComponentModel componentModel = null;
                if (this.model instanceof WaterOutComponentModel) {
                	componentModel = (WaterOutComponentModel)this.model;
                }
                if (componentModel != null 
                 && !GaiaUtil.isEmptyList(componentModel.getAutoBloodOutIDList()) 
                 && dialogID.equals("MoveItem")
                ) {
                	List<MatrixRowData> dummyRowDataList = new ArrayList<MatrixRowData>();
                	
                	for (int i = 0; i < componentModel.getRowDataList().size(); i++) {
                		if ((componentModel.getRowDataList().get(i).getItemData() != null 
                			&& componentModel.getAutoBloodOutIDList().indexOf(componentModel.getRowDataList().get(i).getItemData().getItemCode()) != -1)
                		 || (componentModel.getRowDataList().get(i).getContent().equals(componentModel.getAutoBloodOutRowName()))
                		) {
                			// 移動対象リストに自動計算項目は含めない
                			continue;
                		} else {
                			dummyRowDataList.add(((MatrixModel) model).getRowDataList().get(i));
                		}
                	}
                	cond.setRowList(dummyRowDataList);
                }
                // 2017/05/31 ipl 【多摩総合】出血量自動計算機能対応↑↑↑
                
                gaiaComponentSink.showDialog(dialogID, arg);
            }
        }
    }