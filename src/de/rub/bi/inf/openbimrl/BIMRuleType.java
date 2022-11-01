//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.05 um 03:12:58 PM CEST 
//


package de.rub.bi.inf.openbimrl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r BIMRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BIMRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Precalculations" type="{http://inf.bi.rub.de/OpenBimRL}PrecalculationsType" minOccurs="0"/&gt;
 *         &lt;element name="ModelCheck" type="{http://inf.bi.rub.de/OpenBimRL}ModelCheckType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIMRuleType", propOrder = {
    "precalculations",
    "modelCheck"
})
public class BIMRuleType {

    @XmlElement(name = "Precalculations")
    protected PrecalculationsType precalculations;
    @XmlElement(name = "ModelCheck", required = true)
    protected ModelCheckType modelCheck;
    @XmlAttribute(name = "schemaVersion", required = true)
    protected String schemaVersion;

    /**
     * Ruft den Wert der precalculations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrecalculationsType }
     *     
     */
    public PrecalculationsType getPrecalculations() {
        return precalculations;
    }

    /**
     * Legt den Wert der precalculations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecalculationsType }
     *     
     */
    public void setPrecalculations(PrecalculationsType value) {
        this.precalculations = value;
    }

    /**
     * Ruft den Wert der modelCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModelCheckType }
     *     
     */
    public ModelCheckType getModelCheck() {
        return modelCheck;
    }

    /**
     * Legt den Wert der modelCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelCheckType }
     *     
     */
    public void setModelCheck(ModelCheckType value) {
        this.modelCheck = value;
    }

    /**
     * Ruft den Wert der schemaVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Legt den Wert der schemaVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
