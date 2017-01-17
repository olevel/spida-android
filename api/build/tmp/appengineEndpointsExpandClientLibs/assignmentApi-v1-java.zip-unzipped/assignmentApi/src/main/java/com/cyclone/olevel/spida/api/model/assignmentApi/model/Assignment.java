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
 * on 2016-03-26 at 13:14:50 UTC 
 * Modify at your own risk.
 */

package com.cyclone.olevel.spida.api.model.assignmentApi.model;

/**
 * Model definition for Assignment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the assignmentApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Assignment extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime mDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime mDeadLine;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long mId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mQuestions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mSource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mTopic;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getMDate() {
    return mDate;
  }

  /**
   * @param mDate mDate or {@code null} for none
   */
  public Assignment setMDate(com.google.api.client.util.DateTime mDate) {
    this.mDate = mDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getMDeadLine() {
    return mDeadLine;
  }

  /**
   * @param mDeadLine mDeadLine or {@code null} for none
   */
  public Assignment setMDeadLine(com.google.api.client.util.DateTime mDeadLine) {
    this.mDeadLine = mDeadLine;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMId() {
    return mId;
  }

  /**
   * @param mId mId or {@code null} for none
   */
  public Assignment setMId(java.lang.Long mId) {
    this.mId = mId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMQuestions() {
    return mQuestions;
  }

  /**
   * @param mQuestions mQuestions or {@code null} for none
   */
  public Assignment setMQuestions(java.lang.String mQuestions) {
    this.mQuestions = mQuestions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMSource() {
    return mSource;
  }

  /**
   * @param mSource mSource or {@code null} for none
   */
  public Assignment setMSource(java.lang.String mSource) {
    this.mSource = mSource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMTopic() {
    return mTopic;
  }

  /**
   * @param mTopic mTopic or {@code null} for none
   */
  public Assignment setMTopic(java.lang.String mTopic) {
    this.mTopic = mTopic;
    return this;
  }

  @Override
  public Assignment set(String fieldName, Object value) {
    return (Assignment) super.set(fieldName, value);
  }

  @Override
  public Assignment clone() {
    return (Assignment) super.clone();
  }

}
