//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.05 um 03:12:58 PM CEST 
//


package de.rub.bi.inf.openbimrl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ApplicablityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApplicablityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://inf.bi.rub.de/OpenBimRL}Rule"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicablityType", propOrder = {
    "rule"
})
public class ApplicablityType {

    @XmlElement(name = "Rule")
    protected RuleType rule;

    /**
     * Ruft den Wert der rule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RuleType }
     *     
     */
    public RuleType getRule() {
        return rule;
    }

    /**
     * Legt den Wert der rule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType }
     *     
     */
    public void setRule(RuleType value) {
        this.rule = value;
    }

}
