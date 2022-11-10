//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.10 um 10:18:51 PM CET 
//


package de.rub.bi.inf.openbimrl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ModelSubCheckType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelSubCheckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Applicability" type="{http://inf.bi.rub.de/OpenBimRL}ApplicabilityType"/&gt;
 *         &lt;element name="Rules" type="{http://inf.bi.rub.de/OpenBimRL}RulesType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelSubCheckType", propOrder = {
    "applicability",
    "rules"
})
public class ModelSubCheckType {

    @XmlElement(name = "Applicability", required = true)
    protected ApplicabilityType applicability;
    @XmlElement(name = "Rules", required = true)
    protected RulesType rules;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Ruft den Wert der applicability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicabilityType }
     *     
     */
    public ApplicabilityType getApplicability() {
        return applicability;
    }

    /**
     * Legt den Wert der applicability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicabilityType }
     *     
     */
    public void setApplicability(ApplicabilityType value) {
        this.applicability = value;
    }

    /**
     * Ruft den Wert der rules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RulesType }
     *     
     */
    public RulesType getRules() {
        return rules;
    }

    /**
     * Legt den Wert der rules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesType }
     *     
     */
    public void setRules(RulesType value) {
        this.rules = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
