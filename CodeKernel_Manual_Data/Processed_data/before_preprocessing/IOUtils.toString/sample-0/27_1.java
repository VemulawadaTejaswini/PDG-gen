public class dummy {

private List<Group> get(Group group) throws SocialException {
    HttpGet request =
        new HttpGet("http://mail.qq.com/cgi-bin/laddr_list?sid=" + sid
            + "&operate=view&t=contact&view=" + group.getType()
            + (group.getId() != null ? ("&groupid=" + group.getId()) : "&loc=frame_html,,,23"));
    request.addHeader(new BasicHeader("Referer",
        "http://mail.qq.com/cgi-bin/laddr_list?operate=view&t=contact&view=normal&loc=frame_html,,,23&sid="
            + sid));
    request.addHeader(new BasicHeader("Accept-Language", "zh-cn,zh"));
    request
        .addHeader(new BasicHeader("Referer", "http://mail.qq.com/cgi-bin/frame_html?sid=" + sid));
    try {
      HttpResponse response = http.execute(request);
      StatusLine statusLine = response.getStatusLine();
      if (statusLine == null || statusLine.getStatusCode() != HttpStatus.SC_OK
          || response.getEntity() == null) {
        throw new SocialException(String.valueOf(statusLine));
      }
      String result = IOUtils.toString(response.getEntity().getContent(), "GB18030");
      request.releaseConnection();
      List<Group> groups = null;
      Document doc = Jsoup.parse(result);
      Elements scripts = doc.select("script");
      for (Element el : scripts) {
        for (DataNode node : el.dataNodes()) {
          String script = node.getWholeData().trim();
          if (script.startsWith("var goListData")) {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            List<User> users = new ArrayList<User>();
            Bindings bindings = engine.createBindings();
            bindings.put("users", users);
            script =
                script
                    + "(function(){for(var i in goListData.oList){var o=goListData.oList[i];var u=new com.belerweb.social.qq.mail.bean.User();u.setId(o.sId);u.setType(o.sItemType);u.setLevel(o.sLevel);u.setName(o.oName.length?o.oName[0].sVal:'');u.setFamilyName((o.oFamilyName&&o.oFamilyName.length)?o.oFamilyName[0].sVal:'');u.setGivenName((o.oGivenName&&o.oGivenName.length)?o.oGivenName[0].sVal:'');u.setCustom((o.oCustom&&o.oCustom.length)?o.oCustom[0].sVal:'');u.setNickName((o.oQQNickName&&o.oQQNickName.length)?o.oQQNickName[0].sVal:'');u.setRelate((o.oRelate&&o.oRelate.length)?o.oRelate[0].sVal:'');u.setUrl((o.oUrl&&o.oUrl.length)?o.oUrl[0].sVal:'');u.setDate((o.oDate&&o.oDate.length)?o.oDate[0].sVal:'');u.setBirthday((o.oBirthday&&o.oBirthday.length)?o.oBirthday[0].sVal:'');u.setIm((o.oIM&&o.oIM.length)?o.oIM[0].sVal:'');u.setNote((o.oNote&&o.oNote.length)?o.oNote[0].sVal:'');var es=new java.util.ArrayList();for(var j in o.oEmail){var obj=o.oEmail[j];var e=new com.belerweb.social.qq.mail.bean.Email();e.setEmail(obj.sVal);e.setLabel(obj.sLabel?obj.sLabel:'');e.setType(obj.sType?obj.sType:'');es.add(e)}u.setEmails(es);var ts=new java.util.ArrayList();for(var j in o.oTel){var obj=o.oTel[j];var t=new com.belerweb.social.qq.mail.bean.Tel();t.setNum(obj.sVal);t.setLabel(obj.sLabel?obj.sLabel:'');t.setType(obj.sType?obj.sType:'');ts.add(t)}u.setTels(ts);if(o.oOrg&&o.oOrg.length){var org=new com.belerweb.social.qq.mail.bean.Org();org.setOrg1(o.oOrg[0].sOrg1);org.setOrg2(o.oOrg[0].sOrg2);org.setTitle(o.oOrg[0].sTitle);u.setOrg(org)}if(o.oAdr&&o.oAdr.length){var adr=new com.belerweb.social.qq.mail.bean.Address();adr.setLabel(o.oAdr[0].sLabel);adr.setType(o.oAdr[0].sType);adr.setCountry(o.oAdr[0].sCountry);adr.setProvince(o.oAdr[0].sProvince);adr.setCity(o.oAdr[0].sCity);adr.setStreet(o.oAdr[0].sStreet);adr.setPostcode(o.oAdr[0].sPostcode);u.setAddress(adr)}users.add(u)}})();";
            if (group.getId() == null) {
              groups = new ArrayList<Group>();
              bindings.put("groups", groups);
              script =
                  script
                      + "(function(){for(var k in goGroupData){for(var i in goGroupData[k].oList){var obj=goGroupData[k].oList[i];var g=new com.belerweb.social.qq.mail.bean.Group();g.setId(obj.sId);g.setType(obj.sSubType);g.setName(obj.sName);groups.add(g);}}})();";
            }
            engine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
            engine.eval(script);
            group.setUsers(users);
          }
        }
      }
      return groups;
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    } catch (ScriptException e) {
      throw new SocialException(e);
    }
  }

}