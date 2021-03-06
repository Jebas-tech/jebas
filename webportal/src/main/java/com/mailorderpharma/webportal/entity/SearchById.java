package com.mailorderpharma.webportal.entity;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class SearchById {
	String id;
	String name;
	
	
	public SearchById() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SearchById(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SearchById [id=" + id + ", name=" + name + "]";
	}
	
	
}
