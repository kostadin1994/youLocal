package classes;
// a class to store data from the jsonObject
public class groceryItem {

	public String ID;
	public String name; 
	public int Price;
	public String per;
	public String Comments;
	public boolean selected;
	
	
	public boolean isSelected() {
	        return selected;
	    }

	    public void setSelected(boolean selected) {
	        this.selected = selected;
	    }
	    public int getPrice(){
	    	 return this.Price;
	    	 }
	    public  void setChecked(boolean selected) {
	        this.selected = selected;
	    }
	    public String getName() {
	    	  return name;
	    	 }
	    	 public void setName(String name) {
	    	  this.name = name;
	    	 }
	    	 public String getDescription(){
	    		 return Comments;
	    	 }
	
			
		}

