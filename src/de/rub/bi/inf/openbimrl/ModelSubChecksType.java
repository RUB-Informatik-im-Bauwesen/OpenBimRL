//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.07.18 um 03:38:28 PM CEST 
//


package de.rub.bi.inf.openbimrl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ModelSubChecksType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelSubChecksType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModelSubCheck" type="{http://inf.bi.rub.de/OpenBimRL}ModelSubCheckType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelSubChecksType", propOrder = {
    "modelSubCheck"
})
public class ModelSubChecksType {

    @XmlElement(name = "ModelSubCheck", required = true)
    protected List<ModelSubCheckType> modelSubCheck;

    /**
     * Gets the value of the modelSubCheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelSubCheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelSubCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelSubCheckType }
     * 
     * 
     */
    public List<ModelSubCheckType> getModelSubCheck() {
        if (modelSubCheck == null) {
            modelSubCheck = new ArrayList<ModelSubCheckType>();
        }
        return this.modelSubCheck;
    }

}
