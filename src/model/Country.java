package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "capital", "continent",
		"population" })
@XmlRootElement(name = "Country")
public class Country {
	private String name;
	private int population;
	private String capital;
	private int importance;
	private String continent;

	@XmlElement(name = "Country_Population")
	public void setPopulation(int population) {
		this.population = population;
	}

	@XmlElement(name = "Country_Name")
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "Country_Capital")
	public void setCapital(String capital) {
		this.capital = capital;
	}

	@XmlElement(name = "Country_Continent")
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	@XmlAttribute(name = "importance", required = true)
	public void setImportance(int importance) {
		this.importance = importance;
	}

	public String getContinent() {
		return continent;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public String getCapital() {
		return capital;
	}

	public int getImportance() {
		return importance;
	}

}
