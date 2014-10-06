package com.jcandksolutions.gradle.androidunittest

/**
 * Class that handles the extension of the plugin for configuration.
 */
public class AndroidUnitTestPluginExtension {
  private boolean mTestReleaseBuildType
  private List<String> mExcludedBuildTypes
  private boolean mDownloadTestDependenciesSources
  private boolean mDownloadTestDependenciesJavadoc
  private boolean mDownloadDependenciesJavadoc
  private boolean mDownloadDependenciesSources

  public AndroidUnitTestPluginExtension() {
    mExcludedBuildTypes = new ArrayList<String>()
  }
  /**
   * Retrieves the TestReleaseBuildType property which enables testing if release build types. Only
   * works on App projects, not library projects.
   * @return {@code true} if property enabled, {@code false} otherwise.
   */
  public boolean getTestReleaseBuildType() {
    return mTestReleaseBuildType;
  }

  /**
   * Sets the TestReleaseBuildType property which enables testing if release build types. Only
   * works on App projects, not library projects.
   * @param value The value to set.
   */
  public void setTestReleaseBuildType(boolean value) {
    mTestReleaseBuildType = value;
  }

  /**
   * Retrieves a list of excluded build types in its string representation.
   * @return A list of Strings representing build types.
   */
  public List<String> getExcludedBuildTypes() {
    return mExcludedBuildTypes
  }

  /**
   * Exclude a build type from test task generation.
   * @param buildType The String representation of the build type to exclude.
   */
  public void excludeBuildType(String buildType) {
    mExcludedBuildTypes.add(buildType)
  }

  /**
   * Exclude a list of build types from test task generation.
   * @param buildType A list of String representations of the build types to exclude.
   */
  public void excludeBuildTypes(List<String> buildTypes) {
    mExcludedBuildTypes.addAll(buildTypes)
  }

  /**
   * Retrieves the DownloadTestDependenciesSources property which enables the download of the
   * sources of the tests dependencies.
   * @return {@code true} if property enabled, {@code false} otherwise.
   */
  public boolean isDownloadTestDependenciesSources() {
    return mDownloadTestDependenciesSources
  }

  /**
   * Sets the DownloadTestDependenciesSources property which enables the download of the sources of
   * the tests dependencies.
   * @param value The value to set.
   */
  public void setDownloadTestDependenciesSources(boolean value) {
    mDownloadTestDependenciesSources = value
  }

  /**
   * Retrieves the DownloadTestDependenciesJavadoc property which enables the download of the
   * Javadoc of the tests dependencies.
   * @return {@code true} if property enabled, {@code false} otherwise.
   */
  public boolean isDownloadTestDependenciesJavadoc() {
    return mDownloadTestDependenciesJavadoc
  }

  /**
   * Sets the DownloadTestDependenciesJavadoc property which enables the download of the Javadoc of
   * the tests dependencies.
   * @param value The value to set.
   */
  public void setDownloadTestDependenciesJavadoc(boolean value) {
    mDownloadTestDependenciesJavadoc = value
  }

  /**
   * Retrieves the DownloadDependenciesSources property which enables the download of the
   * sources of the app dependencies.
   * @return {@code true} if property enabled, {@code false} otherwise.
   */
  public boolean isDownloadDependenciesSources() {
    return mDownloadDependenciesSources
  }

  /**
   * Sets the DownloadDependenciesSources property which enables the download of the sources of
   * the app dependencies.
   * @param value The value to set.
   */
  public void setDownloadDependenciesSources(boolean value) {
    mDownloadDependenciesSources = value
  }

  /**
   * Retrieves the DownloadDependenciesJavadoc property which enables the download of the
   * Javadoc of the app dependencies.
   * @return {@code true} if property enabled, {@code false} otherwise.
   */
  public boolean isDownloadDependenciesJavadoc() {
    return mDownloadDependenciesJavadoc
  }

  /**
   * Sets the DownloadDependenciesJavadoc property which enables the download of the Javadoc of
   * the app dependencies.
   * @param value The value to set.
   */
  public void setDownloadDependenciesJavadoc(boolean value) {
    mDownloadDependenciesJavadoc = value
  }
}
