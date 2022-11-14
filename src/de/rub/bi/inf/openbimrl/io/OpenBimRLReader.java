package de.rub.bi.inf.openbimrl.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import de.rub.bi.inf.openbimrl.BIMRuleType;
import de.rub.bi.inf.openbimrl.ObjectFactory;

public class OpenBimRLReader {
	
	public OpenBimRLReader() { }
	
	public static Object readFromFile(String path) throws JAXBException, FileNotFoundException, XMLStreamException {
		
		File file = new File(path);
		
		//JAXBContext context = JAXBContext.newInstance("de.rub.bi.inf.openbimrl");
		JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
		
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		Unmarshaller um = context.createUnmarshaller();

		XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(new FileInputStream(file));
		Object o = um.unmarshal(reader);
		
		return o;
	}
	
	public static BIMRuleType read(InputStream stream) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller um = context.createUnmarshaller();
			Object obj = um.unmarshal(stream);
			
			if(obj instanceof BIMRuleType) {
				return (BIMRuleType)obj;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
     
}
