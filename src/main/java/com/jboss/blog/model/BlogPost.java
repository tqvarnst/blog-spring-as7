package com.jboss.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "BLOG_POST")
public class BlogPost implements Serializable {
	private static final long serialVersionUID = -1981822744067616301L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Version
	@Column(name = "VERSION")
	private int version;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", updatable = false)
	private Date timestamp;

	@Basic
	@Column(name = "TITLE")
	private String title;

	@Basic
	@Column(name = "BODY", length = 1024)
	private String body;
	
	@ManyToOne
	@JoinColumn(name="BLOG_ID")
	private Blog blog;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}
}
