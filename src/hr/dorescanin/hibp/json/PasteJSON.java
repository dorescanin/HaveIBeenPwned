package hr.dorescanin.hibp.json;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "Source", "Id", "Title", "Date", "EmailCount" })
public class PasteJSON {

	@JsonProperty("Source")
	private String source;
	@JsonProperty("Id")
	private String id;
	@JsonProperty("Title")
	private String title;
	@JsonProperty("Date")
	private Date date;
	@JsonProperty("EmailCount")
	private Integer emailCount;

	/**
	 * 
	 * @return The source
	 */
	@JsonProperty("Source")
	public String getSource() {
		return source;
	}

	/**
	 * 
	 * @param source
	 *            The Source
	 */
	@JsonProperty("Source")
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("Id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The Id
	 */
	@JsonProperty("Id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The title
	 */
	@JsonProperty("Title")
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The Title
	 */
	@JsonProperty("Title")
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The date
	 */
	@JsonProperty("Date")
	public Date getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 *            The Date
	 */
	@JsonProperty("Date")
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @return The emailCount
	 */
	@JsonProperty("EmailCount")
	public Integer getEmailCount() {
		return emailCount;
	}

	/**
	 * 
	 * @param emailCount
	 *            The EmailCount
	 */
	@JsonProperty("EmailCount")
	public void setEmailCount(Integer emailCount) {
		this.emailCount = emailCount;
	}

	@Override
	public String toString() {
		return "PasteJSON [source=" + source + ", id=" + id + ", title=" + title + ", date=" + date + ", emailCount="
				+ emailCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((emailCount == null) ? 0 : emailCount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		PasteJSON other = (PasteJSON) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (emailCount == null) {
			if (other.emailCount != null)
				return false;
		} else if (!emailCount.equals(other.emailCount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	
	
	

}