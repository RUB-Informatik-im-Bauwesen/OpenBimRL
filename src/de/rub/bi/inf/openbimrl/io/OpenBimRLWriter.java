package de.rub.bi.inf.openbimrl.io;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import de.rub.bi.inf.openbimrl.BIMRuleType;
import de.rub.bi.inf.openbimrl.ObjectFactory;

public class OpenBimRLWriter {

	public static String writeString(BIMRuleType openBimRL) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(openBimRL, sw);
			
			return sw.toString();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
