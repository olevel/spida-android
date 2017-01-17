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
 * (build: 2016-02-18 22:11:37 UTC)
 * on 2016-03-26 at 11:32:43 UTC 
 * Modify at your own risk.
 */

package com.cyclone.olevel.spida.backend.model.libraryApi;

/**
 * Service definition for LibraryApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LibraryApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class LibraryApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the libraryApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "libraryApi/v1/";

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
  public LibraryApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  LibraryApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getLibrary".
   *
   * This request holds the parameters needed by the libraryApi server.  After setting any optional
   * parameters, call the {@link GetLibrary#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetLibrary getLibrary(java.lang.Long id) throws java.io.IOException {
    GetLibrary result = new GetLibrary(id);
    initialize(result);
    return result;
  }

  public class GetLibrary extends LibraryApiRequest<com.cyclone.olevel.spida.backend.model.libraryApi.model.Library> {

    private static final String REST_PATH = "library/{id}";

    /**
     * Create a request for the method "getLibrary".
     *
     * This request holds the parameters needed by the the libraryApi server.  After setting any
     * optional parameters, call the {@link GetLibrary#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetLibrary#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetLibrary(java.lang.Long id) {
      super(LibraryApi.this, "GET", REST_PATH, null, com.cyclone.olevel.spida.backend.model.libraryApi.model.Library.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
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
    public GetLibrary setAlt(java.lang.String alt) {
      return (GetLibrary) super.setAlt(alt);
    }

    @Override
    public GetLibrary setFields(java.lang.String fields) {
      return (GetLibrary) super.setFields(fields);
    }

    @Override
    public GetLibrary setKey(java.lang.String key) {
      return (GetLibrary) super.setKey(key);
    }

    @Override
    public GetLibrary setOauthToken(java.lang.String oauthToken) {
      return (GetLibrary) super.setOauthToken(oauthToken);
    }

    @Override
    public GetLibrary setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetLibrary) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetLibrary setQuotaUser(java.lang.String quotaUser) {
      return (GetLibrary) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetLibrary setUserIp(java.lang.String userIp) {
      return (GetLibrary) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetLibrary setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetLibrary set(String parameterName, Object value) {
      return (GetLibrary) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertLibrary".
   *
   * This request holds the parameters needed by the libraryApi server.  After setting any optional
   * parameters, call the {@link InsertLibrary#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.cyclone.olevel.spida.backend.model.libraryApi.model.Library}
   * @return the request
   */
  public InsertLibrary insertLibrary(com.cyclone.olevel.spida.backend.model.libraryApi.model.Library content) throws java.io.IOException {
    InsertLibrary result = new InsertLibrary(content);
    initialize(result);
    return result;
  }

  public class InsertLibrary extends LibraryApiRequest<com.cyclone.olevel.spida.backend.model.libraryApi.model.Library> {

    private static final String REST_PATH = "library";

    /**
     * Create a request for the method "insertLibrary".
     *
     * This request holds the parameters needed by the the libraryApi server.  After setting any
     * optional parameters, call the {@link InsertLibrary#execute()} method to invoke the remote
     * operation. <p> {@link InsertLibrary#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.cyclone.olevel.spida.backend.model.libraryApi.model.Library}
     * @since 1.13
     */
    protected InsertLibrary(com.cyclone.olevel.spida.backend.model.libraryApi.model.Library content) {
      super(LibraryApi.this, "POST", REST_PATH, content, com.cyclone.olevel.spida.backend.model.libraryApi.model.Library.class);
    }

    @Override
    public InsertLibrary setAlt(java.lang.String alt) {
      return (InsertLibrary) super.setAlt(alt);
    }

    @Override
    public InsertLibrary setFields(java.lang.String fields) {
      return (InsertLibrary) super.setFields(fields);
    }

    @Override
    public InsertLibrary setKey(java.lang.String key) {
      return (InsertLibrary) super.setKey(key);
    }

    @Override
    public InsertLibrary setOauthToken(java.lang.String oauthToken) {
      return (InsertLibrary) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertLibrary setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertLibrary) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertLibrary setQuotaUser(java.lang.String quotaUser) {
      return (InsertLibrary) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertLibrary setUserIp(java.lang.String userIp) {
      return (InsertLibrary) super.setUserIp(userIp);
    }

    @Override
    public InsertLibrary set(String parameterName, Object value) {
      return (InsertLibrary) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link LibraryApi}.
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
    }

    /** Builds a new instance of {@link LibraryApi}. */
    @Override
    public LibraryApi build() {
      return new LibraryApi(this);
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
     * Set the {@link LibraryApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLibraryApiRequestInitializer(
        LibraryApiRequestInitializer libraryapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(libraryapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
