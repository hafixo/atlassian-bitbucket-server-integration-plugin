package com.atlassian.bitbucket.jenkins.internal.credentials;

import com.cloudbees.plugins.credentials.Credentials;
import com.google.inject.ImplementedBy;

import javax.annotation.Nullable;

/**
 * Converts Jenkins credentials to Bitbucket Credentials.
 */
@ImplementedBy(JenkinsToBitbucketCredentialsImpl.class)
public interface JenkinsToBitbucketCredentials {

    /**
     * Converts the input credential id in Bitbucket Credentials.
     *
     * @param credentialId, credentials id.
     * @return Bitbucket credentials
     */
    BitbucketCredentials toBitbucketCredentials(@Nullable String credentialId);

    /**
     * Converts the input credentials to Bitbucket Credentials
     *
     * @param credentials, credentials
     */
    BitbucketCredentials toBitbucketCredentials(@Nullable Credentials credentials);
}
