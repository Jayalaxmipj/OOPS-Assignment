package book_details;

public class enggbook extends Book {
	private String category;
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "enggbook [category=" + category + "]";
	}


	


	

	
	 
}

