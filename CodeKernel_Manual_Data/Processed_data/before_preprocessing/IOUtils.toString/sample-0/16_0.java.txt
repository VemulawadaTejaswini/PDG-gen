public class dummy {

public String login() throws SocialException {
    ValidationCode validationCode = check();
    String vc = validationCode.getCode();
    if (validationCode.need()) {
      vc = yundama.decode(getValidationCode(), YundamaType.ALPHABETIC4).getResult();
    }

    try {
      String code = DigestUtils.md5Hex(password).toUpperCase();
      byte[] byte1 = Hex.decodeHex(code.toCharArray());
      byte[] byte2 = Hex.decodeHex(validationCode.getUid().toCharArray());
      byte[] bytes = new byte[byte1.length + byte2.length];
      System.arraycopy(byte1, 0, bytes, 0, byte1.length);
      System.arraycopy(byte2, 0, bytes, byte1.length, byte2.length);
      code = DigestUtils.md5Hex(bytes).toUpperCase();
      code = DigestUtils.md5Hex(code + vc.toUpperCase()).toUpperCase();

      List<NameValuePair> params = new ArrayList<NameValuePair>();
      params.add(new BasicNameValuePair("aid", "522005705"));
      params.add(new BasicNameValuePair("ptlang", "2052"));
      params.add(new BasicNameValuePair("js_type", "2"));
      params.add(new BasicNameValuePair("js_ver", "10009"));
      params.add(new BasicNameValuePair("fp", "loginerroralert"));
      params.add(new BasicNameValuePair("wording", "快速登录"));
      params.add(new BasicNameValuePair("mibao_css", "m_ptmail"));
      params.add(new BasicNameValuePair("u1", URLEncoder.encode(
          "https://mail.qq.com/cgi-bin/login?vt=passport&vm=wpt&ft=ptlogin&lang=cn&ss=&validcnt=&clientaddr="
              + email, "UTF-8")));
      params.add(new BasicNameValuePair("css",
          "https://mail.qq.com/zh_CN/htmledition/style/fast_login181b91.css"));
      params.add(new BasicNameValuePair("daid", "4"));
      params.add(new BasicNameValuePair("dummy", ""));
      params.add(new BasicNameValuePair("from_ui", "1"));
      params.add(new BasicNameValuePair("g", "1"));
      params.add(new BasicNameValuePair("h", "1"));
      params.add(new BasicNameValuePair("ptredirect", "1"));
      params.add(new BasicNameValuePair("t", "1"));
      params.add(new BasicNameValuePair("action", "4-20-" + RandomStringUtils.randomNumeric(5)));
      params.add(new BasicNameValuePair("p", code));
      params.add(new BasicNameValuePair("u", email));
      params.add(new BasicNameValuePair("u_domain", email.substring(email.indexOf("@"))));
      params.add(new BasicNameValuePair("uin", email.substring(0, email.indexOf("@"))));
      params.add(new BasicNameValuePair("verifycode", vc));
      HttpGet request =
          new HttpGet("https://ssl.ptlogin2.qq.com/login?" + StringUtils.join(params, "&"));
      request
          .addHeader(new BasicHeader("Referer", "https://mail.qq.com/cgi-bin/loginpage?lang=cn"));
      request.addHeader(new BasicHeader("Accept-Language", "zh-cn,zh"));
      HttpResponse response = http.execute(request);
      StatusLine statusLine = response.getStatusLine();
      if (statusLine == null || statusLine.getStatusCode() != HttpStatus.SC_OK
          || response.getEntity() == null) {
        throw new SocialException(String.valueOf(statusLine));
      }
      String result = IOUtils.toString(response.getEntity().getContent());
      request.releaseConnection();
      String[] str = result.substring(7, result.length() - 1).split(",");
      if (!"0".equals(str[0].trim().substring(1, str[0].length() - 1))) {
        throw new SocialException(str[4]);
      }

      request = new HttpGet(str[2].trim().substring(1, str[2].length() - 1));
      response = http.execute(request);
      statusLine = response.getStatusLine();
      if (statusLine == null || statusLine.getStatusCode() != HttpStatus.SC_OK
          || response.getEntity() == null) {
        throw new SocialException(String.valueOf(statusLine));
      }
      result = IOUtils.toString(response.getEntity().getContent(), "GB18030");
      request.releaseConnection();
      Matcher matcher = PATTERN.matcher(result);
      if (matcher.find()) {
        this.sid = matcher.group(1);
      } else {
        if (!result.contains("看不清")) {
          Document doc = Jsoup.parse(result);
          Elements scripts = doc.select("script");
          boolean status = false;
          for (Element el : scripts) {
            for (DataNode node : el.dataNodes()) {
              String script = node.getWholeData().trim();
              if (script.startsWith("var urlHead")) {
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
                script = script.replace("window.location.replace(targetUrl);", "");
                try {
                  engine.eval(script);
                  String url = engine.get("targetUrl").toString();
                  request = new HttpGet(url);
                  response = http.execute(request);
                  result = IOUtils.toString(response.getEntity().getContent(), "GB18030");
                  status = true;
                } catch (Exception e) {
                  e.printStackTrace();
                }
              }
            }
          }
          if (!status) {
            // throw new SocialException("没有获取到sid");
          }
        }
        vc = yundama.decode(getValidationCode2(), YundamaType.ALPHABETIC4).getResult();
        params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("btlogin", "登录"));
        params.add(new BasicNameValuePair("delegate_url", ""));
        params.add(new BasicNameValuePair("sid", ""));
        params.add(new BasicNameValuePair("uin", email.substring(0, email.indexOf("@"))));
        params.add(new BasicNameValuePair("verifycode", vc));
        params.add(new BasicNameValuePair("vt", "passport"));
        HttpPost post = new HttpPost("https://mail.qq.com/cgi-bin/login?sid=");
        post.setConfig(RequestConfig.custom().setRedirectsEnabled(false)
            .setRelativeRedirectsAllowed(false).setCircularRedirectsAllowed(false).build());
        post.setEntity(new UrlEncodedFormEntity(params));
        response = http.execute(post);
        try {
          result = IOUtils.toString(response.getEntity().getContent(), "GB18030");
          matcher = PATTERN.matcher(result);
          if (matcher.find()) {
            this.sid = matcher.group(1);
          } else {
            matcher = PATTERN.matcher(response.getFirstHeader("Location").getValue());
            if (matcher.find()) {
              this.sid = matcher.group(1);
            } else {
              throw new SocialException("没有获取到sid");
            }
          }
        } catch (Exception e) {
          throw new SocialException("没有获取到sid");
        }
      }
      return this.sid;
    } catch (DecoderException e) {
      throw new SocialException(e);
    } catch (ClientProtocolException e) {
      throw new SocialException(e);
    } catch (IOException e) {
      throw new SocialException(e);
    }
  }

}
