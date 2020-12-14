package DS1;

public class Marker 
{
	
	// will need instance variables to store latitude, longitude, color, label, category
	private double latitude;
	private double longitude;
	private String color;
	private String label;
	private String category;
	

	// will need appropriate parameterized constructor, accessors and mutators
	
	public Marker (double lat,double lon,String colo,String labe,String cat)
	{
		latitude = lat;
		longitude = lon;
		color = colo;
		label = labe;
		category = cat;
	}
	
	
	

	// will need toString that outputs in format of ex.
	
	// &markers=color:red%7Clabel:A%7C40.729961,-73.590879
	
	// A is the value of the label
	// there is "%7C" separating the value of the color and the word label
	// there is "%7C" separating the value of the label and the latitude
	
	public String getCategory() 
	{
		return category;
	}

	public double getLatitude() {
		return latitude;
	}




	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}




	public double getLongitude() {
		return longitude;
	}




	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getLabel() {
		return label;
	}




	public void setLabel(String label) {
		this.label = label;
	}




	public String toString() 
	{ 
	String toReturn = "&markers=color:"+color+"%7Clabel:"+label+"%7C"+latitude+","+longitude;
		return toReturn;
	}
}
