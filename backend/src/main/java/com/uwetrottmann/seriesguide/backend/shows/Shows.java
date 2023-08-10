/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 1969-12-31 23:59:59 UTC)
 * on 2023-08-04 at 10:37:28 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.backend.shows;

/**
 * Service definition for Shows (v2).
 *
 * <p>
 * Store and retrieve a users shows.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ShowsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Shows extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.25.0 of the shows library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://optical-hexagon-364.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "shows/v2/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Shows(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Shows(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "get".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link Get#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Get get() throws java.io.IOException {
    Get result = new Get();
    initialize(result);
    return result;
  }

  public class Get extends ShowsRequest<com.uwetrottmann.seriesguide.backend.shows.model.ShowList> {

    private static final String REST_PATH = "get";

    /**
     * Create a request for the method "get".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Get() {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.shows.model.ShowList.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Get setAlt(java.lang.String alt) {
      return (Get) super.setAlt(alt);
    }

    @Override
    public Get setFields(java.lang.String fields) {
      return (Get) super.setFields(fields);
    }

    @Override
    public Get setKey(java.lang.String key) {
      return (Get) super.setKey(key);
    }

    @Override
    public Get setOauthToken(java.lang.String oauthToken) {
      return (Get) super.setOauthToken(oauthToken);
    }

    @Override
    public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Get) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Get setQuotaUser(java.lang.String quotaUser) {
      return (Get) super.setQuotaUser(quotaUser);
    }

    @Override
    public Get setUserIp(java.lang.String userIp) {
      return (Get) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public Get setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public Get setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime updatedSince;

    /**

     */
    public com.google.api.client.util.DateTime getUpdatedSince() {
      return updatedSince;
    }

    public Get setUpdatedSince(com.google.api.client.util.DateTime updatedSince) {
      this.updatedSince = updatedSince;
      return this;
    }

    @Override
    public Get set(String parameterName, Object value) {
      return (Get) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getSgShow".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link GetSgShow#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetSgShow getSgShow() throws java.io.IOException {
    GetSgShow result = new GetSgShow();
    initialize(result);
    return result;
  }

  public class GetSgShow extends ShowsRequest<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow> {

    private static final String REST_PATH = "getSgShow";

    /**
     * Create a request for the method "getSgShow".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link GetSgShow#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetSgShow#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetSgShow() {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShow.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetSgShow setAlt(java.lang.String alt) {
      return (GetSgShow) super.setAlt(alt);
    }

    @Override
    public GetSgShow setFields(java.lang.String fields) {
      return (GetSgShow) super.setFields(fields);
    }

    @Override
    public GetSgShow setKey(java.lang.String key) {
      return (GetSgShow) super.setKey(key);
    }

    @Override
    public GetSgShow setOauthToken(java.lang.String oauthToken) {
      return (GetSgShow) super.setOauthToken(oauthToken);
    }

    @Override
    public GetSgShow setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetSgShow) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetSgShow setQuotaUser(java.lang.String quotaUser) {
      return (GetSgShow) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetSgShow setUserIp(java.lang.String userIp) {
      return (GetSgShow) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer showTmdbId;

    /**

     */
    public java.lang.Integer getShowTmdbId() {
      return showTmdbId;
    }

    public GetSgShow setShowTmdbId(java.lang.Integer showTmdbId) {
      this.showTmdbId = showTmdbId;
      return this;
    }

    @Override
    public GetSgShow set(String parameterName, Object value) {
      return (GetSgShow) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getSgShows".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link GetSgShows#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetSgShows getSgShows() throws java.io.IOException {
    GetSgShows result = new GetSgShows();
    initialize(result);
    return result;
  }

  public class GetSgShows extends ShowsRequest<com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList> {

    private static final String REST_PATH = "getSgShows";

    /**
     * Create a request for the method "getSgShows".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link GetSgShows#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetSgShows#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetSgShows() {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetSgShows setAlt(java.lang.String alt) {
      return (GetSgShows) super.setAlt(alt);
    }

    @Override
    public GetSgShows setFields(java.lang.String fields) {
      return (GetSgShows) super.setFields(fields);
    }

    @Override
    public GetSgShows setKey(java.lang.String key) {
      return (GetSgShows) super.setKey(key);
    }

    @Override
    public GetSgShows setOauthToken(java.lang.String oauthToken) {
      return (GetSgShows) super.setOauthToken(oauthToken);
    }

    @Override
    public GetSgShows setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetSgShows) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetSgShows setQuotaUser(java.lang.String quotaUser) {
      return (GetSgShows) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetSgShows setUserIp(java.lang.String userIp) {
      return (GetSgShows) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public GetSgShows setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public GetSgShows setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime updatedSince;

    /**

     */
    public com.google.api.client.util.DateTime getUpdatedSince() {
      return updatedSince;
    }

    public GetSgShows setUpdatedSince(com.google.api.client.util.DateTime updatedSince) {
      this.updatedSince = updatedSince;
      return this;
    }

    @Override
    public GetSgShows set(String parameterName, Object value) {
      return (GetSgShows) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getShow".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link GetShow#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetShow getShow() throws java.io.IOException {
    GetShow result = new GetShow();
    initialize(result);
    return result;
  }

  public class GetShow extends ShowsRequest<com.uwetrottmann.seriesguide.backend.shows.model.Show> {

    private static final String REST_PATH = "getShow";

    /**
     * Create a request for the method "getShow".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link GetShow#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetShow#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetShow() {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.shows.model.Show.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetShow setAlt(java.lang.String alt) {
      return (GetShow) super.setAlt(alt);
    }

    @Override
    public GetShow setFields(java.lang.String fields) {
      return (GetShow) super.setFields(fields);
    }

    @Override
    public GetShow setKey(java.lang.String key) {
      return (GetShow) super.setKey(key);
    }

    @Override
    public GetShow setOauthToken(java.lang.String oauthToken) {
      return (GetShow) super.setOauthToken(oauthToken);
    }

    @Override
    public GetShow setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetShow) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetShow setQuotaUser(java.lang.String quotaUser) {
      return (GetShow) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetShow setUserIp(java.lang.String userIp) {
      return (GetShow) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer showTvdbId;

    /**

     */
    public java.lang.Integer getShowTvdbId() {
      return showTvdbId;
    }

    public GetShow setShowTvdbId(java.lang.Integer showTvdbId) {
      this.showTvdbId = showTvdbId;
      return this;
    }

    @Override
    public GetShow set(String parameterName, Object value) {
      return (GetShow) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "save".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link Save#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.uwetrottmann.seriesguide.backend.shows.model.ShowList}
   * @return the request
   */
  public Save save(com.uwetrottmann.seriesguide.backend.shows.model.ShowList content) throws java.io.IOException {
    Save result = new Save(content);
    initialize(result);
    return result;
  }

  public class Save extends ShowsRequest<Void> {

    private static final String REST_PATH = "save";

    /**
     * Create a request for the method "save".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link Save#execute()} method to invoke the remote operation. <p> {@link
     * Save#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.uwetrottmann.seriesguide.backend.shows.model.ShowList}
     * @since 1.13
     */
    protected Save(com.uwetrottmann.seriesguide.backend.shows.model.ShowList content) {
      super(Shows.this, "PUT", REST_PATH, content, Void.class);
    }

    @Override
    public Save setAlt(java.lang.String alt) {
      return (Save) super.setAlt(alt);
    }

    @Override
    public Save setFields(java.lang.String fields) {
      return (Save) super.setFields(fields);
    }

    @Override
    public Save setKey(java.lang.String key) {
      return (Save) super.setKey(key);
    }

    @Override
    public Save setOauthToken(java.lang.String oauthToken) {
      return (Save) super.setOauthToken(oauthToken);
    }

    @Override
    public Save setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Save) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Save setQuotaUser(java.lang.String quotaUser) {
      return (Save) super.setQuotaUser(quotaUser);
    }

    @Override
    public Save setUserIp(java.lang.String userIp) {
      return (Save) super.setUserIp(userIp);
    }

    @Override
    public Save set(String parameterName, Object value) {
      return (Save) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "saveSgShows".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link SaveSgShows#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList}
   * @return the request
   */
  public SaveSgShows saveSgShows(com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList content) throws java.io.IOException {
    SaveSgShows result = new SaveSgShows(content);
    initialize(result);
    return result;
  }

  public class SaveSgShows extends ShowsRequest<Void> {

    private static final String REST_PATH = "saveSgShows";

    /**
     * Create a request for the method "saveSgShows".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link SaveSgShows#execute()} method to invoke the remote operation. <p>
     * {@link
     * SaveSgShows#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList}
     * @since 1.13
     */
    protected SaveSgShows(com.uwetrottmann.seriesguide.backend.shows.model.SgCloudShowList content) {
      super(Shows.this, "PUT", REST_PATH, content, Void.class);
    }

    @Override
    public SaveSgShows setAlt(java.lang.String alt) {
      return (SaveSgShows) super.setAlt(alt);
    }

    @Override
    public SaveSgShows setFields(java.lang.String fields) {
      return (SaveSgShows) super.setFields(fields);
    }

    @Override
    public SaveSgShows setKey(java.lang.String key) {
      return (SaveSgShows) super.setKey(key);
    }

    @Override
    public SaveSgShows setOauthToken(java.lang.String oauthToken) {
      return (SaveSgShows) super.setOauthToken(oauthToken);
    }

    @Override
    public SaveSgShows setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SaveSgShows) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SaveSgShows setQuotaUser(java.lang.String quotaUser) {
      return (SaveSgShows) super.setQuotaUser(quotaUser);
    }

    @Override
    public SaveSgShows setUserIp(java.lang.String userIp) {
      return (SaveSgShows) super.setUserIp(userIp);
    }

    @Override
    public SaveSgShows set(String parameterName, Object value) {
      return (SaveSgShows) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Shows}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Shows}. */
    @Override
    public Shows build() {
      return new Shows(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ShowsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setShowsRequestInitializer(
        ShowsRequestInitializer showsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(showsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
