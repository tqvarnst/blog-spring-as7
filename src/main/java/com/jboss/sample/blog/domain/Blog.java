package com.jboss.sample.blog.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "BLOG")
public class Blog implements Serializable {
	private static final long serialVersionUID = 2174550864792874612L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", updatable = false, nullable = false)
	private long id;

	@Version
	@Column(name = "VERSION")
	private int version = 0;

	@Basic
	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "blog", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@OrderBy("timestamp DESC")
	private List<BlogPost> blogPosts;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BlogPost> getBlogPosts() {
		return blogPosts;
	}

	public void setBlogPosts(List<BlogPost> blogPosts) {
		this.blogPosts = blogPosts;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", version=" + version + ", name=" + name + ", blogPosts=" + blogPosts + "]";
	}
}