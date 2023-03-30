
package com.seidor.exercise1.models;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class ContainerExpirationPolicy {
    private String cadence;
    private boolean enabled;
    private long keepN;
    private String olderThan;
    private String nameRegex;
    private Object nameRegexKeep;
    private OffsetDateTime nextRunAt;

    @JsonProperty("cadence")
    public String getCadence() { return cadence; }
    @JsonProperty("cadence")
    public void setCadence(String value) { this.cadence = value; }

    @JsonProperty("enabled")
    public boolean getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(boolean value) { this.enabled = value; }

    @JsonProperty("keep_n")
    public long getKeepN() { return keepN; }
    @JsonProperty("keep_n")
    public void setKeepN(long value) { this.keepN = value; }

    @JsonProperty("older_than")
    public String getOlderThan() { return olderThan; }
    @JsonProperty("older_than")
    public void setOlderThan(String value) { this.olderThan = value; }

    @JsonProperty("name_regex")
    public String getNameRegex() { return nameRegex; }
    @JsonProperty("name_regex")
    public void setNameRegex(String value) { this.nameRegex = value; }

    @JsonProperty("name_regex_keep")
    public Object getNameRegexKeep() { return nameRegexKeep; }
    @JsonProperty("name_regex_keep")
    public void setNameRegexKeep(Object value) { this.nameRegexKeep = value; }

    @JsonProperty("next_run_at")
    public OffsetDateTime getNextRunAt() { return nextRunAt; }
    @JsonProperty("next_run_at")
    public void setNextRunAt(OffsetDateTime value) { this.nextRunAt = value; }
}