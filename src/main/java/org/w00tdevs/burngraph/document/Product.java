package org.w00tdevs.burngraph.document;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author agisbert
 *
 */
@Document(collection = "products")
public class Product {

	@Id
	private String id;

	private String name;
	
	// If not initialized, put over products changing stories fails. 
	// Works as from the moment a post with [storyx] is performed.
	private List<Story> stories = new ArrayList<Story>();

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

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	} 

	
}
