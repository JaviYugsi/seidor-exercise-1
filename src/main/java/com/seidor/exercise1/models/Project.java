
package com.seidor.exercise1.models;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class Project {
    private long id;
    private String description;
    private String name;
    private String nameWithNamespace;
    private String path;
    private String pathWithNamespace;
    private OffsetDateTime createdAt;
    private String defaultBranch;
    private Object[] tagList;
    private Object[] topics;
    private String sshURLToRepo;
    private String httpURLToRepo;
    private String webURL;
    private String readmeURL;
    private long forksCount;
    private Object avatarURL;
    private long starCount;
    private OffsetDateTime lastActivityAt;
    private Namespace namespace;
    private String containerRegistryImagePrefix;
    private Links links;
    private boolean packagesEnabled;
    private boolean emptyRepo;
    private boolean archived;
    private String visibility;
    private Owner owner;
    private boolean resolveOutdatedDiffDiscussions;
    private ContainerExpirationPolicy containerExpirationPolicy;
    private boolean issuesEnabled;
    private boolean mergeRequestsEnabled;
    private boolean wikiEnabled;
    private boolean jobsEnabled;
    private boolean snippetsEnabled;
    private boolean containerRegistryEnabled;
    private boolean serviceDeskEnabled;
    private String serviceDeskAddress;
    private boolean canCreateMergeRequestIn;
    private String issuesAccessLevel;
    private String repositoryAccessLevel;
    private String mergeRequestsAccessLevel;
    private String forkingAccessLevel;
    private String wikiAccessLevel;
    private String buildsAccessLevel;
    private String snippetsAccessLevel;
    private String pagesAccessLevel;
    private String operationsAccessLevel;
    private String analyticsAccessLevel;
    private String containerRegistryAccessLevel;
    private String securityAndComplianceAccessLevel;
    private String releasesAccessLevel;
    private String environmentsAccessLevel;
    private String featureFlagsAccessLevel;
    private String infrastructureAccessLevel;
    private String monitorAccessLevel;
    private Object emailsDisabled;
    private boolean sharedRunnersEnabled;
    private boolean groupRunnersEnabled;
    private boolean lfsEnabled;
    private long creatorID;
    private Object importURL;
    private Object importType;
    private String importStatus;
    private Object importError;
    private long openIssuesCount;
    private String runnersToken;
    private long ciDefaultGitDepth;
    private boolean ciForwardDeploymentEnabled;
    private boolean ciJobTokenScopeEnabled;
    private boolean ciSeparatedCaches;
    private boolean ciOptInJwt;
    private boolean ciAllowForkPipelinesToRunInParentProject;
    private boolean publicJobs;
    private String buildGitStrategy;
    private long buildTimeout;
    private String autoCancelPendingPipelines;
    private String ciConfigPath;
    private Object[] sharedWithGroups;
    private boolean onlyAllowMergeIfPipelineSucceeds;
    private Object allowMergeOnSkippedPipeline;
    private boolean restrictUserDefinedVariables;
    private boolean requestAccessEnabled;
    private boolean onlyAllowMergeIfAllDiscussionsAreResolved;
    private boolean removeSourceBranchAfterMerge;
    private boolean printingMergeRequestLinkEnabled;
    private String mergeMethod;
    private String squashOption;
    private boolean enforceAuthChecksOnUploads;
    private Object suggestionCommitMessage;
    private Object mergeCommitTemplate;
    private Object squashCommitTemplate;
    private Object issueBranchTemplate;
    private boolean autoDevopsEnabled;
    private String autoDevopsDeployStrategy;
    private boolean autocloseReferencedIssues;
    private boolean keepLatestArtifact;
    private Object runnerTokenExpirationInterval;
    private String externalAuthorizationClassificationLabel;
    private boolean requirementsEnabled;
    private String requirementsAccessLevel;
    private boolean securityAndComplianceEnabled;
    private Object[] complianceFrameworks;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("name_with_namespace")
    public String getNameWithNamespace() { return nameWithNamespace; }
    @JsonProperty("name_with_namespace")
    public void setNameWithNamespace(String value) { this.nameWithNamespace = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("path_with_namespace")
    public String getPathWithNamespace() { return pathWithNamespace; }
    @JsonProperty("path_with_namespace")
    public void setPathWithNamespace(String value) { this.pathWithNamespace = value; }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    @JsonProperty("default_branch")
    public String getDefaultBranch() { return defaultBranch; }
    @JsonProperty("default_branch")
    public void setDefaultBranch(String value) { this.defaultBranch = value; }

    @JsonProperty("tag_list")
    public Object[] getTagList() { return tagList; }
    @JsonProperty("tag_list")
    public void setTagList(Object[] value) { this.tagList = value; }

    @JsonProperty("topics")
    public Object[] getTopics() { return topics; }
    @JsonProperty("topics")
    public void setTopics(Object[] value) { this.topics = value; }

    @JsonProperty("ssh_url_to_repo")
    public String getSSHURLToRepo() { return sshURLToRepo; }
    @JsonProperty("ssh_url_to_repo")
    public void setSSHURLToRepo(String value) { this.sshURLToRepo = value; }

    @JsonProperty("http_url_to_repo")
    public String getHTTPURLToRepo() { return httpURLToRepo; }
    @JsonProperty("http_url_to_repo")
    public void setHTTPURLToRepo(String value) { this.httpURLToRepo = value; }

    @JsonProperty("web_url")
    public String getWebURL() { return webURL; }
    @JsonProperty("web_url")
    public void setWebURL(String value) { this.webURL = value; }

    @JsonProperty("readme_url")
    public String getReadmeURL() { return readmeURL; }
    @JsonProperty("readme_url")
    public void setReadmeURL(String value) { this.readmeURL = value; }

    @JsonProperty("forks_count")
    public long getForksCount() { return forksCount; }
    @JsonProperty("forks_count")
    public void setForksCount(long value) { this.forksCount = value; }

    @JsonProperty("avatar_url")
    public Object getAvatarURL() { return avatarURL; }
    @JsonProperty("avatar_url")
    public void setAvatarURL(Object value) { this.avatarURL = value; }

    @JsonProperty("star_count")
    public long getStarCount() { return starCount; }
    @JsonProperty("star_count")
    public void setStarCount(long value) { this.starCount = value; }

    @JsonProperty("last_activity_at")
    public OffsetDateTime getLastActivityAt() { return lastActivityAt; }
    @JsonProperty("last_activity_at")
    public void setLastActivityAt(OffsetDateTime value) { this.lastActivityAt = value; }

    @JsonProperty("namespace")
    public Namespace getNamespace() { return namespace; }
    @JsonProperty("namespace")
    public void setNamespace(Namespace value) { this.namespace = value; }

    @JsonProperty("container_registry_image_prefix")
    public String getContainerRegistryImagePrefix() { return containerRegistryImagePrefix; }
    @JsonProperty("container_registry_image_prefix")
    public void setContainerRegistryImagePrefix(String value) { this.containerRegistryImagePrefix = value; }

    @JsonProperty("_links")
    public Links getLinks() { return links; }
    @JsonProperty("_links")
    public void setLinks(Links value) { this.links = value; }

    @JsonProperty("packages_enabled")
    public boolean getPackagesEnabled() { return packagesEnabled; }
    @JsonProperty("packages_enabled")
    public void setPackagesEnabled(boolean value) { this.packagesEnabled = value; }

    @JsonProperty("empty_repo")
    public boolean getEmptyRepo() { return emptyRepo; }
    @JsonProperty("empty_repo")
    public void setEmptyRepo(boolean value) { this.emptyRepo = value; }

    @JsonProperty("archived")
    public boolean getArchived() { return archived; }
    @JsonProperty("archived")
    public void setArchived(boolean value) { this.archived = value; }

    @JsonProperty("visibility")
    public String getVisibility() { return visibility; }
    @JsonProperty("visibility")
    public void setVisibility(String value) { this.visibility = value; }

    @JsonProperty("owner")
    public Owner getOwner() { return owner; }
    @JsonProperty("owner")
    public void setOwner(Owner value) { this.owner = value; }

    @JsonProperty("resolve_outdated_diff_discussions")
    public boolean getResolveOutdatedDiffDiscussions() { return resolveOutdatedDiffDiscussions; }
    @JsonProperty("resolve_outdated_diff_discussions")
    public void setResolveOutdatedDiffDiscussions(boolean value) { this.resolveOutdatedDiffDiscussions = value; }

    @JsonProperty("container_expiration_policy")
    public ContainerExpirationPolicy getContainerExpirationPolicy() { return containerExpirationPolicy; }
    @JsonProperty("container_expiration_policy")
    public void setContainerExpirationPolicy(ContainerExpirationPolicy value) { this.containerExpirationPolicy = value; }

    @JsonProperty("issues_enabled")
    public boolean getIssuesEnabled() { return issuesEnabled; }
    @JsonProperty("issues_enabled")
    public void setIssuesEnabled(boolean value) { this.issuesEnabled = value; }

    @JsonProperty("merge_requests_enabled")
    public boolean getMergeRequestsEnabled() { return mergeRequestsEnabled; }
    @JsonProperty("merge_requests_enabled")
    public void setMergeRequestsEnabled(boolean value) { this.mergeRequestsEnabled = value; }

    @JsonProperty("wiki_enabled")
    public boolean getWikiEnabled() { return wikiEnabled; }
    @JsonProperty("wiki_enabled")
    public void setWikiEnabled(boolean value) { this.wikiEnabled = value; }

    @JsonProperty("jobs_enabled")
    public boolean getJobsEnabled() { return jobsEnabled; }
    @JsonProperty("jobs_enabled")
    public void setJobsEnabled(boolean value) { this.jobsEnabled = value; }

    @JsonProperty("snippets_enabled")
    public boolean getSnippetsEnabled() { return snippetsEnabled; }
    @JsonProperty("snippets_enabled")
    public void setSnippetsEnabled(boolean value) { this.snippetsEnabled = value; }

    @JsonProperty("container_registry_enabled")
    public boolean getContainerRegistryEnabled() { return containerRegistryEnabled; }
    @JsonProperty("container_registry_enabled")
    public void setContainerRegistryEnabled(boolean value) { this.containerRegistryEnabled = value; }

    @JsonProperty("service_desk_enabled")
    public boolean getServiceDeskEnabled() { return serviceDeskEnabled; }
    @JsonProperty("service_desk_enabled")
    public void setServiceDeskEnabled(boolean value) { this.serviceDeskEnabled = value; }

    @JsonProperty("service_desk_address")
    public String getServiceDeskAddress() { return serviceDeskAddress; }
    @JsonProperty("service_desk_address")
    public void setServiceDeskAddress(String value) { this.serviceDeskAddress = value; }

    @JsonProperty("can_create_merge_request_in")
    public boolean getCanCreateMergeRequestIn() { return canCreateMergeRequestIn; }
    @JsonProperty("can_create_merge_request_in")
    public void setCanCreateMergeRequestIn(boolean value) { this.canCreateMergeRequestIn = value; }

    @JsonProperty("issues_access_level")
    public String getIssuesAccessLevel() { return issuesAccessLevel; }
    @JsonProperty("issues_access_level")
    public void setIssuesAccessLevel(String value) { this.issuesAccessLevel = value; }

    @JsonProperty("repository_access_level")
    public String getRepositoryAccessLevel() { return repositoryAccessLevel; }
    @JsonProperty("repository_access_level")
    public void setRepositoryAccessLevel(String value) { this.repositoryAccessLevel = value; }

    @JsonProperty("merge_requests_access_level")
    public String getMergeRequestsAccessLevel() { return mergeRequestsAccessLevel; }
    @JsonProperty("merge_requests_access_level")
    public void setMergeRequestsAccessLevel(String value) { this.mergeRequestsAccessLevel = value; }

    @JsonProperty("forking_access_level")
    public String getForkingAccessLevel() { return forkingAccessLevel; }
    @JsonProperty("forking_access_level")
    public void setForkingAccessLevel(String value) { this.forkingAccessLevel = value; }

    @JsonProperty("wiki_access_level")
    public String getWikiAccessLevel() { return wikiAccessLevel; }
    @JsonProperty("wiki_access_level")
    public void setWikiAccessLevel(String value) { this.wikiAccessLevel = value; }

    @JsonProperty("builds_access_level")
    public String getBuildsAccessLevel() { return buildsAccessLevel; }
    @JsonProperty("builds_access_level")
    public void setBuildsAccessLevel(String value) { this.buildsAccessLevel = value; }

    @JsonProperty("snippets_access_level")
    public String getSnippetsAccessLevel() { return snippetsAccessLevel; }
    @JsonProperty("snippets_access_level")
    public void setSnippetsAccessLevel(String value) { this.snippetsAccessLevel = value; }

    @JsonProperty("pages_access_level")
    public String getPagesAccessLevel() { return pagesAccessLevel; }
    @JsonProperty("pages_access_level")
    public void setPagesAccessLevel(String value) { this.pagesAccessLevel = value; }

    @JsonProperty("operations_access_level")
    public String getOperationsAccessLevel() { return operationsAccessLevel; }
    @JsonProperty("operations_access_level")
    public void setOperationsAccessLevel(String value) { this.operationsAccessLevel = value; }

    @JsonProperty("analytics_access_level")
    public String getAnalyticsAccessLevel() { return analyticsAccessLevel; }
    @JsonProperty("analytics_access_level")
    public void setAnalyticsAccessLevel(String value) { this.analyticsAccessLevel = value; }

    @JsonProperty("container_registry_access_level")
    public String getContainerRegistryAccessLevel() { return containerRegistryAccessLevel; }
    @JsonProperty("container_registry_access_level")
    public void setContainerRegistryAccessLevel(String value) { this.containerRegistryAccessLevel = value; }

    @JsonProperty("security_and_compliance_access_level")
    public String getSecurityAndComplianceAccessLevel() { return securityAndComplianceAccessLevel; }
    @JsonProperty("security_and_compliance_access_level")
    public void setSecurityAndComplianceAccessLevel(String value) { this.securityAndComplianceAccessLevel = value; }

    @JsonProperty("releases_access_level")
    public String getReleasesAccessLevel() { return releasesAccessLevel; }
    @JsonProperty("releases_access_level")
    public void setReleasesAccessLevel(String value) { this.releasesAccessLevel = value; }

    @JsonProperty("environments_access_level")
    public String getEnvironmentsAccessLevel() { return environmentsAccessLevel; }
    @JsonProperty("environments_access_level")
    public void setEnvironmentsAccessLevel(String value) { this.environmentsAccessLevel = value; }

    @JsonProperty("feature_flags_access_level")
    public String getFeatureFlagsAccessLevel() { return featureFlagsAccessLevel; }
    @JsonProperty("feature_flags_access_level")
    public void setFeatureFlagsAccessLevel(String value) { this.featureFlagsAccessLevel = value; }

    @JsonProperty("infrastructure_access_level")
    public String getInfrastructureAccessLevel() { return infrastructureAccessLevel; }
    @JsonProperty("infrastructure_access_level")
    public void setInfrastructureAccessLevel(String value) { this.infrastructureAccessLevel = value; }

    @JsonProperty("monitor_access_level")
    public String getMonitorAccessLevel() { return monitorAccessLevel; }
    @JsonProperty("monitor_access_level")
    public void setMonitorAccessLevel(String value) { this.monitorAccessLevel = value; }

    @JsonProperty("emails_disabled")
    public Object getEmailsDisabled() { return emailsDisabled; }
    @JsonProperty("emails_disabled")
    public void setEmailsDisabled(Object value) { this.emailsDisabled = value; }

    @JsonProperty("shared_runners_enabled")
    public boolean getSharedRunnersEnabled() { return sharedRunnersEnabled; }
    @JsonProperty("shared_runners_enabled")
    public void setSharedRunnersEnabled(boolean value) { this.sharedRunnersEnabled = value; }

    @JsonProperty("group_runners_enabled")
    public boolean getGroupRunnersEnabled() { return groupRunnersEnabled; }
    @JsonProperty("group_runners_enabled")
    public void setGroupRunnersEnabled(boolean value) { this.groupRunnersEnabled = value; }

    @JsonProperty("lfs_enabled")
    public boolean getLFSEnabled() { return lfsEnabled; }
    @JsonProperty("lfs_enabled")
    public void setLFSEnabled(boolean value) { this.lfsEnabled = value; }

    @JsonProperty("creator_id")
    public long getCreatorID() { return creatorID; }
    @JsonProperty("creator_id")
    public void setCreatorID(long value) { this.creatorID = value; }

    @JsonProperty("import_url")
    public Object getImportURL() { return importURL; }
    @JsonProperty("import_url")
    public void setImportURL(Object value) { this.importURL = value; }

    @JsonProperty("import_type")
    public Object getImportType() { return importType; }
    @JsonProperty("import_type")
    public void setImportType(Object value) { this.importType = value; }

    @JsonProperty("import_status")
    public String getImportStatus() { return importStatus; }
    @JsonProperty("import_status")
    public void setImportStatus(String value) { this.importStatus = value; }

    @JsonProperty("import_error")
    public Object getImportError() { return importError; }
    @JsonProperty("import_error")
    public void setImportError(Object value) { this.importError = value; }

    @JsonProperty("open_issues_count")
    public long getOpenIssuesCount() { return openIssuesCount; }
    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(long value) { this.openIssuesCount = value; }

    @JsonProperty("runners_token")
    public String getRunnersToken() { return runnersToken; }
    @JsonProperty("runners_token")
    public void setRunnersToken(String value) { this.runnersToken = value; }

    @JsonProperty("ci_default_git_depth")
    public long getCiDefaultGitDepth() { return ciDefaultGitDepth; }
    @JsonProperty("ci_default_git_depth")
    public void setCiDefaultGitDepth(long value) { this.ciDefaultGitDepth = value; }

    @JsonProperty("ci_forward_deployment_enabled")
    public boolean getCiForwardDeploymentEnabled() { return ciForwardDeploymentEnabled; }
    @JsonProperty("ci_forward_deployment_enabled")
    public void setCiForwardDeploymentEnabled(boolean value) { this.ciForwardDeploymentEnabled = value; }

    @JsonProperty("ci_job_token_scope_enabled")
    public boolean getCiJobTokenScopeEnabled() { return ciJobTokenScopeEnabled; }
    @JsonProperty("ci_job_token_scope_enabled")
    public void setCiJobTokenScopeEnabled(boolean value) { this.ciJobTokenScopeEnabled = value; }

    @JsonProperty("ci_separated_caches")
    public boolean getCiSeparatedCaches() { return ciSeparatedCaches; }
    @JsonProperty("ci_separated_caches")
    public void setCiSeparatedCaches(boolean value) { this.ciSeparatedCaches = value; }

    @JsonProperty("ci_opt_in_jwt")
    public boolean getCiOptInJwt() { return ciOptInJwt; }
    @JsonProperty("ci_opt_in_jwt")
    public void setCiOptInJwt(boolean value) { this.ciOptInJwt = value; }

    @JsonProperty("ci_allow_fork_pipelines_to_run_in_parent_project")
    public boolean getCiAllowForkPipelinesToRunInParentProject() { return ciAllowForkPipelinesToRunInParentProject; }
    @JsonProperty("ci_allow_fork_pipelines_to_run_in_parent_project")
    public void setCiAllowForkPipelinesToRunInParentProject(boolean value) { this.ciAllowForkPipelinesToRunInParentProject = value; }

    @JsonProperty("public_jobs")
    public boolean getPublicJobs() { return publicJobs; }
    @JsonProperty("public_jobs")
    public void setPublicJobs(boolean value) { this.publicJobs = value; }

    @JsonProperty("build_git_strategy")
    public String getBuildGitStrategy() { return buildGitStrategy; }
    @JsonProperty("build_git_strategy")
    public void setBuildGitStrategy(String value) { this.buildGitStrategy = value; }

    @JsonProperty("build_timeout")
    public long getBuildTimeout() { return buildTimeout; }
    @JsonProperty("build_timeout")
    public void setBuildTimeout(long value) { this.buildTimeout = value; }

    @JsonProperty("auto_cancel_pending_pipelines")
    public String getAutoCancelPendingPipelines() { return autoCancelPendingPipelines; }
    @JsonProperty("auto_cancel_pending_pipelines")
    public void setAutoCancelPendingPipelines(String value) { this.autoCancelPendingPipelines = value; }

    @JsonProperty("ci_config_path")
    public String getCiConfigPath() { return ciConfigPath; }
    @JsonProperty("ci_config_path")
    public void setCiConfigPath(String value) { this.ciConfigPath = value; }

    @JsonProperty("shared_with_groups")
    public Object[] getSharedWithGroups() { return sharedWithGroups; }
    @JsonProperty("shared_with_groups")
    public void setSharedWithGroups(Object[] value) { this.sharedWithGroups = value; }

    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    public boolean getOnlyAllowMergeIfPipelineSucceeds() { return onlyAllowMergeIfPipelineSucceeds; }
    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    public void setOnlyAllowMergeIfPipelineSucceeds(boolean value) { this.onlyAllowMergeIfPipelineSucceeds = value; }

    @JsonProperty("allow_merge_on_skipped_pipeline")
    public Object getAllowMergeOnSkippedPipeline() { return allowMergeOnSkippedPipeline; }
    @JsonProperty("allow_merge_on_skipped_pipeline")
    public void setAllowMergeOnSkippedPipeline(Object value) { this.allowMergeOnSkippedPipeline = value; }

    @JsonProperty("restrict_user_defined_variables")
    public boolean getRestrictUserDefinedVariables() { return restrictUserDefinedVariables; }
    @JsonProperty("restrict_user_defined_variables")
    public void setRestrictUserDefinedVariables(boolean value) { this.restrictUserDefinedVariables = value; }

    @JsonProperty("request_access_enabled")
    public boolean getRequestAccessEnabled() { return requestAccessEnabled; }
    @JsonProperty("request_access_enabled")
    public void setRequestAccessEnabled(boolean value) { this.requestAccessEnabled = value; }

    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    public boolean getOnlyAllowMergeIfAllDiscussionsAreResolved() { return onlyAllowMergeIfAllDiscussionsAreResolved; }
    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    public void setOnlyAllowMergeIfAllDiscussionsAreResolved(boolean value) { this.onlyAllowMergeIfAllDiscussionsAreResolved = value; }

    @JsonProperty("remove_source_branch_after_merge")
    public boolean getRemoveSourceBranchAfterMerge() { return removeSourceBranchAfterMerge; }
    @JsonProperty("remove_source_branch_after_merge")
    public void setRemoveSourceBranchAfterMerge(boolean value) { this.removeSourceBranchAfterMerge = value; }

    @JsonProperty("printing_merge_request_link_enabled")
    public boolean getPrintingMergeRequestLinkEnabled() { return printingMergeRequestLinkEnabled; }
    @JsonProperty("printing_merge_request_link_enabled")
    public void setPrintingMergeRequestLinkEnabled(boolean value) { this.printingMergeRequestLinkEnabled = value; }

    @JsonProperty("merge_method")
    public String getMergeMethod() { return mergeMethod; }
    @JsonProperty("merge_method")
    public void setMergeMethod(String value) { this.mergeMethod = value; }

    @JsonProperty("squash_option")
    public String getSquashOption() { return squashOption; }
    @JsonProperty("squash_option")
    public void setSquashOption(String value) { this.squashOption = value; }

    @JsonProperty("enforce_auth_checks_on_uploads")
    public boolean getEnforceAuthChecksOnUploads() { return enforceAuthChecksOnUploads; }
    @JsonProperty("enforce_auth_checks_on_uploads")
    public void setEnforceAuthChecksOnUploads(boolean value) { this.enforceAuthChecksOnUploads = value; }

    @JsonProperty("suggestion_commit_message")
    public Object getSuggestionCommitMessage() { return suggestionCommitMessage; }
    @JsonProperty("suggestion_commit_message")
    public void setSuggestionCommitMessage(Object value) { this.suggestionCommitMessage = value; }

    @JsonProperty("merge_commit_template")
    public Object getMergeCommitTemplate() { return mergeCommitTemplate; }
    @JsonProperty("merge_commit_template")
    public void setMergeCommitTemplate(Object value) { this.mergeCommitTemplate = value; }

    @JsonProperty("squash_commit_template")
    public Object getSquashCommitTemplate() { return squashCommitTemplate; }
    @JsonProperty("squash_commit_template")
    public void setSquashCommitTemplate(Object value) { this.squashCommitTemplate = value; }

    @JsonProperty("issue_branch_template")
    public Object getIssueBranchTemplate() { return issueBranchTemplate; }
    @JsonProperty("issue_branch_template")
    public void setIssueBranchTemplate(Object value) { this.issueBranchTemplate = value; }

    @JsonProperty("auto_devops_enabled")
    public boolean getAutoDevopsEnabled() { return autoDevopsEnabled; }
    @JsonProperty("auto_devops_enabled")
    public void setAutoDevopsEnabled(boolean value) { this.autoDevopsEnabled = value; }

    @JsonProperty("auto_devops_deploy_strategy")
    public String getAutoDevopsDeployStrategy() { return autoDevopsDeployStrategy; }
    @JsonProperty("auto_devops_deploy_strategy")
    public void setAutoDevopsDeployStrategy(String value) { this.autoDevopsDeployStrategy = value; }

    @JsonProperty("autoclose_referenced_issues")
    public boolean getAutocloseReferencedIssues() { return autocloseReferencedIssues; }
    @JsonProperty("autoclose_referenced_issues")
    public void setAutocloseReferencedIssues(boolean value) { this.autocloseReferencedIssues = value; }

    @JsonProperty("keep_latest_artifact")
    public boolean getKeepLatestArtifact() { return keepLatestArtifact; }
    @JsonProperty("keep_latest_artifact")
    public void setKeepLatestArtifact(boolean value) { this.keepLatestArtifact = value; }

    @JsonProperty("runner_token_expiration_interval")
    public Object getRunnerTokenExpirationInterval() { return runnerTokenExpirationInterval; }
    @JsonProperty("runner_token_expiration_interval")
    public void setRunnerTokenExpirationInterval(Object value) { this.runnerTokenExpirationInterval = value; }

    @JsonProperty("external_authorization_classification_label")
    public String getExternalAuthorizationClassificationLabel() { return externalAuthorizationClassificationLabel; }
    @JsonProperty("external_authorization_classification_label")
    public void setExternalAuthorizationClassificationLabel(String value) { this.externalAuthorizationClassificationLabel = value; }

    @JsonProperty("requirements_enabled")
    public boolean getRequirementsEnabled() { return requirementsEnabled; }
    @JsonProperty("requirements_enabled")
    public void setRequirementsEnabled(boolean value) { this.requirementsEnabled = value; }

    @JsonProperty("requirements_access_level")
    public String getRequirementsAccessLevel() { return requirementsAccessLevel; }
    @JsonProperty("requirements_access_level")
    public void setRequirementsAccessLevel(String value) { this.requirementsAccessLevel = value; }

    @JsonProperty("security_and_compliance_enabled")
    public boolean getSecurityAndComplianceEnabled() { return securityAndComplianceEnabled; }
    @JsonProperty("security_and_compliance_enabled")
    public void setSecurityAndComplianceEnabled(boolean value) { this.securityAndComplianceEnabled = value; }

    @JsonProperty("compliance_frameworks")
    public Object[] getComplianceFrameworks() { return complianceFrameworks; }
    @JsonProperty("compliance_frameworks")
    public void setComplianceFrameworks(Object[] value) { this.complianceFrameworks = value; }
}