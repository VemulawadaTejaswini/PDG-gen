//4
public class func{
public void requestAuthorization(String scope,String responseType,String clientId,String redirectUri,String state,String respMode,String nonce,String display,String prompt,Integer maxAge,String uiLocalesStr,String idTokenHint,String loginHint,String acrValuesStr,String amrValuesStr,String request,String requestUri,String requestSessionId,String sessionId,String accessToken,String method,String originHeaders,HttpServletRequest httpRequest,HttpServletResponse httpResponse,SecurityContext securityContext){
                            if (StringUtils.isNotBlank(accessToken)) {
                                AuthorizationGrant authorizationGrant = authorizationGrantList.getAuthorizationGrantByAccessToken(accessToken);

                                if (authorizationGrant == null) {
                                    RedirectUri redirectUriResponse = new RedirectUri(redirectUri, responseTypes, responseMode);
                                    redirectUriResponse.parseQueryString(errorResponseFactory.getErrorAsQueryString(
                                            AuthorizeErrorResponseType.ACCESS_DENIED, state));

                                    builder = RedirectUtil.getRedirectResponseBuilder(redirectUriResponse.toString(), httpRequest);
                                    return builder.build();
                                } else {
                                    user = userService.getUser(authorizationGrant.getUserId());
                                    sessionUser = sessionIdService.generateAuthenticatedSessionId(user.getDn(), prompt);
                                }
                            }
                            if (StringUtils.isNotBlank(requestUri)) {
                                boolean validRequestUri = false;
                                try {
                                    URI reqUri = new URI(requestUri);
                                    String reqUriHash = reqUri.getFragment();
                                    String reqUriWithoutFragment = reqUri.getScheme() + ":" + reqUri.getSchemeSpecificPart();

                                    ClientRequest clientRequest = new ClientRequest(reqUriWithoutFragment);
                                    clientRequest.setHttpMethod(HttpMethod.GET);

                                    ClientResponse<String> clientResponse = clientRequest.get(String.class);
                                    int status = clientResponse.getStatus();

                                    if (status == 200) {
                                        request = clientResponse.getEntity(String.class);

                                        if (StringUtils.isBlank(reqUriHash)) {
                                            validRequestUri = true;
                                        } else {
                                            String hash = JwtUtil.base64urlencode(JwtUtil.getMessageDigestSHA256(request));
                                            validRequestUri = StringUtils.equals(reqUriHash, hash);
                                        }
                                    }

                                    if (validRequestUri) {
                                        requestUri = null;
                                    } else {
                                        RedirectUri redirectUriResponse = new RedirectUri(redirectUri, responseTypes, responseMode);
                                        redirectUriResponse.parseQueryString(errorResponseFactory.getErrorAsQueryString(
                                                AuthorizeErrorResponseType.INVALID_REQUEST_URI, state));

                                        builder = RedirectUtil.getRedirectResponseBuilder(redirectUriResponse.toString(), httpRequest);
                                        return builder.build();
                                    }
                                } catch (URISyntaxException e) {
                                    log.error(e.getMessage(), e);
                                } catch (UnknownHostException e) {
                                    log.error(e.getMessage(), e);
                                } catch (ConnectException e) {
                                    log.error(e.getMessage(), e);
                                } catch (Exception e) {
                                    log.error(e.getMessage(), e);
                                }
                            }
                            if (StringUtils.isNotBlank(request)) {
                                try {
                                    jwtAuthorizationRequest = new JwtAuthorizationRequest(request, client);

                                    if (!jwtAuthorizationRequest.getResponseTypes().containsAll(responseTypes)
                                            || !responseTypes.containsAll(jwtAuthorizationRequest.getResponseTypes())) {
                                        throw new InvalidJwtException("The responseType parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getClientId() != null
                                            && !jwtAuthorizationRequest.getClientId().equals(clientId)) {
                                        throw new InvalidJwtException("The clientId parameter is not the same in the JWT");
                                    } else if (!jwtAuthorizationRequest.getScopes().containsAll(scopes)
                                            || !scopes.containsAll(jwtAuthorizationRequest.getScopes())) {
                                        throw new InvalidJwtException("The scope parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getRedirectUri() != null
                                            && !jwtAuthorizationRequest.getRedirectUri().equals(redirectUri)) {
                                        throw new InvalidJwtException("The redirectUri parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getState() != null && StringUtils.isNotBlank(state)
                                            && !jwtAuthorizationRequest.getState().equals(state)) {
                                        throw new InvalidJwtException("The state parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getNonce() != null && StringUtils.isNotBlank(nonce)
                                            && !jwtAuthorizationRequest.getNonce().equals(nonce)) {
                                        throw new InvalidJwtException("The nonce parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getDisplay() != null && StringUtils.isNotBlank(display)
                                            && !jwtAuthorizationRequest.getDisplay().getParamName().equals(display)) {
                                        throw new InvalidJwtException("The display parameter is not the same in the JWT");
                                    } else if (!jwtAuthorizationRequest.getPrompts().isEmpty() && !prompts.isEmpty()
                                            && !jwtAuthorizationRequest.getPrompts().containsAll(prompts)) {
                                        throw new InvalidJwtException("The prompt parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getIdTokenMember() != null
                                            && jwtAuthorizationRequest.getIdTokenMember().getMaxAge() != null && maxAge != null
                                            && !jwtAuthorizationRequest.getIdTokenMember().getMaxAge().equals(maxAge)) {
                                        throw new InvalidJwtException("The maxAge parameter is not the same in the JWT");
                                    }
                                } catch (InvalidJwtException e) {
                                    invalidOpenidRequestObject = true;
                                    log.debug("Invalid JWT authorization request. Exception = {0}, Message = {1}", e,
                                            e.getClass().getName(), e.getMessage());
                                } catch (Exception e) {
                                    invalidOpenidRequestObject = true;
                                    log.debug("Invalid JWT authorization request. Exception = {0}, Message = {1}", e,
                                            e.getClass().getName(), e.getMessage());
                                }
                            }
}
}
