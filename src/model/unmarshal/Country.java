package model.unmarshal;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Country")
public class Country {
	private String name, capital, continent;

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}
	@XmlElement
	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinent() {
		return continent;
	}
	
	@XmlElement
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String toString()
	{
		return name;
	}

}
