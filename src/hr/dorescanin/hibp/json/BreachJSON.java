package hr.dorescanin.hibp.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "Name",
    "Domain",
    "BreachDate",
    "AddedDate",
    "PwnCount",
    "Description",
    "DataClasses",
    "IsVerified",
    "IsSensitive",
    "IsActive",
    "IsRetired",
    "LogoType"
})
public class BreachJSON {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Domain")
    private String domain;
    @JsonProperty("BreachDate")
    private Date breachDate;
    @JsonProperty("AddedDate")
    private Date addedDate;
    @JsonProperty("PwnCount")
    private Integer pwnCount;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DataClasses")
    private List<String> dataClasses = new ArrayList<String>();
    @JsonProperty("IsVerified")
    private Boolean isVerified;
    @JsonProperty("IsSensitive")
    private Boolean isSensitive;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("IsRetired")
    private Boolean isRetired;
    @JsonProperty("LogoType")
    private String logoType;

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The Title
     */
    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The domain
     */
    @JsonProperty("Domain")
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain
     *     The Domain
     */
    @JsonProperty("Domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * 
     * @return
     *     The breachDate
     */
    @JsonProperty("BreachDate")
    public Date getBreachDate() {
        return breachDate;
    }

    /**
     * 
     * @param breachDate
     *     The BreachDate
     */
    @JsonProperty("BreachDate")
    public void setBreachDate(Date breachDate) {
        this.breachDate = breachDate;
    }

    /**
     * 
     * @return
     *     The addedDate
     */
    @JsonProperty("AddedDate")
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * 
     * @param addedDate
     *     The AddedDate
     */
    @JsonProperty("AddedDate")
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * 
     * @return
     *     The pwnCount
     */
    @JsonProperty("PwnCount")
    public Integer getPwnCount() {
        return pwnCount;
    }

    /**
     * 
     * @param pwnCount
     *     The PwnCount
     */
    @JsonProperty("PwnCount")
    public void setPwnCount(Integer pwnCount) {
        this.pwnCount = pwnCount;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The dataClasses
     */
    @JsonProperty("DataClasses")
    public List<String> getDataClasses() {
        return dataClasses;
    }

    /**
     * 
     * @param dataClasses
     *     The DataClasses
     */
    @JsonProperty("DataClasses")
    public void setDataClasses(List<String> dataClasses) {
        this.dataClasses = dataClasses;
    }

    /**
     * 
     * @return
     *     The isVerified
     */
    @JsonProperty("IsVerified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    /**
     * 
     * @param isVerified
     *     The IsVerified
     */
    @JsonProperty("IsVerified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    /**
     * 
     * @return
     *     The isSensitive
     */
    @JsonProperty("IsSensitive")
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /**
     * 
     * @param isSensitive
     *     The IsSensitive
     */
    @JsonProperty("IsSensitive")
    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

    /**
     * 
     * @return
     *     The isActive
     */
    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive
     *     The IsActive
     */
    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * 
     * @return
     *     The isRetired
     */
    @JsonProperty("IsRetired")
    public Boolean getIsRetired() {
        return isRetired;
    }

    /**
     * 
     * @param isRetired
     *     The IsRetired
     */
    @JsonProperty("IsRetired")
    public void setIsRetired(Boolean isRetired) {
        this.isRetired = isRetired;
    }

    /**
     * 
     * @return
     *     The logoType
     */
    @JsonProperty("LogoType")
    public String getLogoType() {
        return logoType;
    }

    /**
     * 
     * @param logoType
     *     The LogoType
     */
    @JsonProperty("LogoType")
    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

	@Override
	public String toString() {
		return "BreachJSON [title=" + title + ", name=" + name + ", domain=" + domain + ", breachDate=" + breachDate
				+ ", addedDate=" + addedDate + ", pwnCount=" + pwnCount + ", description=" + description
				+ ", dataClasses=" + dataClasses + ", isVerified=" + isVerified + ", isSensitive=" + isSensitive
				+ ", isActive=" + isActive + ", isRetired=" + isRetired + ", logoType=" + logoType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addedDate == null) ? 0 : addedDate.hashCode());
		result = prime * result + ((breachDate == null) ? 0 : breachDate.hashCode());
		result = prime * result + ((dataClasses == null) ? 0 : dataClasses.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((isRetired == null) ? 0 : isRetired.hashCode());
		result = prime * result + ((isSensitive == null) ? 0 : isSensitive.hashCode());
		result = prime * result + ((isVerified == null) ? 0 : isVerified.hashCode());
		result = prime * result + ((logoType == null) ? 0 : logoType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwnCount == null) ? 0 : pwnCount.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BreachJSON other = (BreachJSON) obj;
		if (addedDate == null) {
			if (other.addedDate != null)
				return false;
		} else if (!addedDate.equals(other.addedDate))
			return false;
		if (breachDate == null) {
			if (other.breachDate != null)
				return false;
		} else if (!breachDate.equals(other.breachDate))
			return false;
		if (dataClasses == null) {
			if (other.dataClasses != null)
				return false;
		} else if (!dataClasses.equals(other.dataClasses))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (isRetired == null) {
			if (other.isRetired != null)
				return false;
		} else if (!isRetired.equals(other.isRetired))
			return false;
		if (isSensitive == null) {
			if (other.isSensitive != null)
				return false;
		} else if (!isSensitive.equals(other.isSensitive))
			return false;
		if (isVerified == null) {
			if (other.isVerified != null)
				return false;
		} else if (!isVerified.equals(other.isVerified))
			return false;
		if (logoType == null) {
			if (other.logoType != null)
				return false;
		} else if (!logoType.equals(other.logoType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwnCount == null) {
			if (other.pwnCount != null)
				return false;
		} else if (!pwnCount.equals(other.pwnCount))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

    

    

    

}
