
package com.exalt.server.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "roles")
@JsonInclude(content =Include.NON_NULL)
public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Rid;

	private String name;
	@JsonBackReference
	@ManyToMany(mappedBy = "roles")
	
	 @JsonIgnore
	
	private Set<User> users = new HashSet<>();

	public Integer getId() {
		return Rid;
	}

	public void setId(Integer Rid) {
		this.Rid = Rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Rid ^ (Rid >>> 32));
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
		Roles other = (Roles) obj;
		if (Rid != other.Rid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [id=" + Rid + ", name=" + name + "]";
	}


}
