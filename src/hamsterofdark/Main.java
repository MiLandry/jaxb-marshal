package hamsterofdark;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import model.Countries;
import model.Country;


public class Main {

	public static void main(String[] args) {
		marshalExample();

		
		
	}

	private static void marshalExample() {
		Country spain = new Country();
		spain.setName( "Spain" );
		spain.setCapital( "Madrid" );
		spain.setContinent( "Europe" );
		spain.setImportance( 1 );
		spain.setPopulation( 45000000 );
		/* init jaxb marshaler */
		
		Country murica = new Country();
		murica.setName( "USA" );
		murica.setCapital( "DC" );
		murica.setContinent( "NA" );
		murica.setImportance( 1 );
		murica.setPopulation( 25000000 );
		/* init jaxb marshaler */
		
		Countries countries = new Countries();
		List al = new ArrayList();
		al.add(spain);
		al.add(murica);
		
		countries.setCountries(al);
		
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance( Country.class, Countries.class );
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			/* set this flag to true to format the output */
			jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
			/* marshaling of java objects in xml (output to file and standard output) */
			jaxbMarshaller.marshal( countries, new File( "country.xml" ) );
			jaxbMarshaller.marshal( countries, System.out );
			
		}
		catch(JAXBException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("done");
		
	}



}
