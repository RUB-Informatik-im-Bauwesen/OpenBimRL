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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="Rule" type="{http://inf.bi.rub.de/OpenBimRL}RuleType"/&gt;
 *           &lt;element name="Rules" type="{http://inf.bi.rub.de/OpenBimRL}RulesType"/&gt;
 *         &lt;/choice&gt;
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
    "ruleOrRules"
})
public class ModelSubCheckType {

    @XmlElement(name = "Applicability", required = true)
    protected ApplicabilityType applicability;
    @XmlElements({
        @XmlElement(name = "Rule", type = RuleType.class),
        @XmlElement(name = "Rules", type = RulesType.class)
    })
    protected List<Object> ruleOrRules;
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
     * Gets the value of the ruleOrRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleOrRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleOrRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleType }
     * {@link RulesType }
     * 
     * 
     */
    public List<Object> getRuleOrRules() {
        if (ruleOrRules == null) {
            ruleOrRules = new ArrayList<Object>();
        }
        return this.ruleOrRules;
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
