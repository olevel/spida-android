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
 * on 2016-03-26 at 13:14:52 UTC 
 * Modify at your own risk.
 */

package com.cyclone.olevel.spida.api.model.libraryApi.model;

/**
 * Model definition for Library.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the libraryApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Library extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mAuthor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mFormat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UUID mId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mTitle;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMAuthor() {
    return mAuthor;
  }

  /**
   * @param mAuthor mAuthor or {@code null} for none
   */
  public Library setMAuthor(java.lang.String mAuthor) {
    this.mAuthor = mAuthor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMFormat() {
    return mFormat;
  }

  /**
   * @param mFormat mFormat or {@code null} for none
   */
  public Library setMFormat(java.lang.String mFormat) {
    this.mFormat = mFormat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public UUID getMId() {
    return mId;
  }

  /**
   * @param mId mId or {@code null} for none
   */
  public Library setMId(UUID mId) {
    this.mId = mId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMTitle() {
    return mTitle;
  }

  /**
   * @param mTitle mTitle or {@code null} for none
   */
  public Library setMTitle(java.lang.String mTitle) {
    this.mTitle = mTitle;
    return this;
  }

  @Override
  public Library set(String fieldName, Object value) {
    return (Library) super.set(fieldName, value);
  }

  @Override
  public Library clone() {
    return (Library) super.clone();
  }

}
