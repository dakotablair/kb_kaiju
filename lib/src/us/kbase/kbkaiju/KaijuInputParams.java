
package us.kbase.kbkaiju;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: KaijuInputParams</p>
 * <pre>
 * Kaiju App Input Params
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "input_refs",
    "tax_levels",
    "db_type",
    "filter_percent",
    "subsample_percent",
    "subsample_replicates",
    "subsample_seed",
    "seg_filter",
    "min_match_length",
    "greedy_run_mode",
    "greedy_allowed_mismatches",
    "greedy_min_match_score",
    "greedy_max_e_value",
    "sort_taxa_by"
})
public class KaijuInputParams {

    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("input_refs")
    private java.lang.String inputRefs;
    @JsonProperty("tax_levels")
    private List<String> taxLevels;
    @JsonProperty("db_type")
    private java.lang.String dbType;
    @JsonProperty("filter_percent")
    private Double filterPercent;
    @JsonProperty("subsample_percent")
    private Long subsamplePercent;
    @JsonProperty("subsample_replicates")
    private Long subsampleReplicates;
    @JsonProperty("subsample_seed")
    private Long subsampleSeed;
    @JsonProperty("seg_filter")
    private Long segFilter;
    @JsonProperty("min_match_length")
    private Long minMatchLength;
    @JsonProperty("greedy_run_mode")
    private Long greedyRunMode;
    @JsonProperty("greedy_allowed_mismatches")
    private Long greedyAllowedMismatches;
    @JsonProperty("greedy_min_match_score")
    private Long greedyMinMatchScore;
    @JsonProperty("greedy_max_e_value")
    private Double greedyMaxEValue;
    @JsonProperty("sort_taxa_by")
    private java.lang.String sortTaxaBy;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public KaijuInputParams withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("input_refs")
    public java.lang.String getInputRefs() {
        return inputRefs;
    }

    @JsonProperty("input_refs")
    public void setInputRefs(java.lang.String inputRefs) {
        this.inputRefs = inputRefs;
    }

    public KaijuInputParams withInputRefs(java.lang.String inputRefs) {
        this.inputRefs = inputRefs;
        return this;
    }

    @JsonProperty("tax_levels")
    public List<String> getTaxLevels() {
        return taxLevels;
    }

    @JsonProperty("tax_levels")
    public void setTaxLevels(List<String> taxLevels) {
        this.taxLevels = taxLevels;
    }

    public KaijuInputParams withTaxLevels(List<String> taxLevels) {
        this.taxLevels = taxLevels;
        return this;
    }

    @JsonProperty("db_type")
    public java.lang.String getDbType() {
        return dbType;
    }

    @JsonProperty("db_type")
    public void setDbType(java.lang.String dbType) {
        this.dbType = dbType;
    }

    public KaijuInputParams withDbType(java.lang.String dbType) {
        this.dbType = dbType;
        return this;
    }

    @JsonProperty("filter_percent")
    public Double getFilterPercent() {
        return filterPercent;
    }

    @JsonProperty("filter_percent")
    public void setFilterPercent(Double filterPercent) {
        this.filterPercent = filterPercent;
    }

    public KaijuInputParams withFilterPercent(Double filterPercent) {
        this.filterPercent = filterPercent;
        return this;
    }

    @JsonProperty("subsample_percent")
    public Long getSubsamplePercent() {
        return subsamplePercent;
    }

    @JsonProperty("subsample_percent")
    public void setSubsamplePercent(Long subsamplePercent) {
        this.subsamplePercent = subsamplePercent;
    }

    public KaijuInputParams withSubsamplePercent(Long subsamplePercent) {
        this.subsamplePercent = subsamplePercent;
        return this;
    }

    @JsonProperty("subsample_replicates")
    public Long getSubsampleReplicates() {
        return subsampleReplicates;
    }

    @JsonProperty("subsample_replicates")
    public void setSubsampleReplicates(Long subsampleReplicates) {
        this.subsampleReplicates = subsampleReplicates;
    }

    public KaijuInputParams withSubsampleReplicates(Long subsampleReplicates) {
        this.subsampleReplicates = subsampleReplicates;
        return this;
    }

    @JsonProperty("subsample_seed")
    public Long getSubsampleSeed() {
        return subsampleSeed;
    }

    @JsonProperty("subsample_seed")
    public void setSubsampleSeed(Long subsampleSeed) {
        this.subsampleSeed = subsampleSeed;
    }

    public KaijuInputParams withSubsampleSeed(Long subsampleSeed) {
        this.subsampleSeed = subsampleSeed;
        return this;
    }

    @JsonProperty("seg_filter")
    public Long getSegFilter() {
        return segFilter;
    }

    @JsonProperty("seg_filter")
    public void setSegFilter(Long segFilter) {
        this.segFilter = segFilter;
    }

    public KaijuInputParams withSegFilter(Long segFilter) {
        this.segFilter = segFilter;
        return this;
    }

    @JsonProperty("min_match_length")
    public Long getMinMatchLength() {
        return minMatchLength;
    }

    @JsonProperty("min_match_length")
    public void setMinMatchLength(Long minMatchLength) {
        this.minMatchLength = minMatchLength;
    }

    public KaijuInputParams withMinMatchLength(Long minMatchLength) {
        this.minMatchLength = minMatchLength;
        return this;
    }

    @JsonProperty("greedy_run_mode")
    public Long getGreedyRunMode() {
        return greedyRunMode;
    }

    @JsonProperty("greedy_run_mode")
    public void setGreedyRunMode(Long greedyRunMode) {
        this.greedyRunMode = greedyRunMode;
    }

    public KaijuInputParams withGreedyRunMode(Long greedyRunMode) {
        this.greedyRunMode = greedyRunMode;
        return this;
    }

    @JsonProperty("greedy_allowed_mismatches")
    public Long getGreedyAllowedMismatches() {
        return greedyAllowedMismatches;
    }

    @JsonProperty("greedy_allowed_mismatches")
    public void setGreedyAllowedMismatches(Long greedyAllowedMismatches) {
        this.greedyAllowedMismatches = greedyAllowedMismatches;
    }

    public KaijuInputParams withGreedyAllowedMismatches(Long greedyAllowedMismatches) {
        this.greedyAllowedMismatches = greedyAllowedMismatches;
        return this;
    }

    @JsonProperty("greedy_min_match_score")
    public Long getGreedyMinMatchScore() {
        return greedyMinMatchScore;
    }

    @JsonProperty("greedy_min_match_score")
    public void setGreedyMinMatchScore(Long greedyMinMatchScore) {
        this.greedyMinMatchScore = greedyMinMatchScore;
    }

    public KaijuInputParams withGreedyMinMatchScore(Long greedyMinMatchScore) {
        this.greedyMinMatchScore = greedyMinMatchScore;
        return this;
    }

    @JsonProperty("greedy_max_e_value")
    public Double getGreedyMaxEValue() {
        return greedyMaxEValue;
    }

    @JsonProperty("greedy_max_e_value")
    public void setGreedyMaxEValue(Double greedyMaxEValue) {
        this.greedyMaxEValue = greedyMaxEValue;
    }

    public KaijuInputParams withGreedyMaxEValue(Double greedyMaxEValue) {
        this.greedyMaxEValue = greedyMaxEValue;
        return this;
    }

    @JsonProperty("sort_taxa_by")
    public java.lang.String getSortTaxaBy() {
        return sortTaxaBy;
    }

    @JsonProperty("sort_taxa_by")
    public void setSortTaxaBy(java.lang.String sortTaxaBy) {
        this.sortTaxaBy = sortTaxaBy;
    }

    public KaijuInputParams withSortTaxaBy(java.lang.String sortTaxaBy) {
        this.sortTaxaBy = sortTaxaBy;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((((((((((((((((("KaijuInputParams"+" [workspaceName=")+ workspaceName)+", inputRefs=")+ inputRefs)+", taxLevels=")+ taxLevels)+", dbType=")+ dbType)+", filterPercent=")+ filterPercent)+", subsamplePercent=")+ subsamplePercent)+", subsampleReplicates=")+ subsampleReplicates)+", subsampleSeed=")+ subsampleSeed)+", segFilter=")+ segFilter)+", minMatchLength=")+ minMatchLength)+", greedyRunMode=")+ greedyRunMode)+", greedyAllowedMismatches=")+ greedyAllowedMismatches)+", greedyMinMatchScore=")+ greedyMinMatchScore)+", greedyMaxEValue=")+ greedyMaxEValue)+", sortTaxaBy=")+ sortTaxaBy)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
