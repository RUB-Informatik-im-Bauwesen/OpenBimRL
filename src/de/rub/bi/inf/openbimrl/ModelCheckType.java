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
 * <p>Java-Klasse für ModelCheckType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelCheckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleIdentifiers" type="{http://inf.bi.rub.de/OpenBimRL}RuleIdentifiersType"/&gt;
 *         &lt;element name="ModelSubChecks" type="{http://inf.bi.rub.de/OpenBimRL}ModelSubChecksType"/&gt;
 *         &lt;element name="ResultSets" type="{http://inf.bi.rub.de/OpenBimRL}ResultSetsType"/&gt;
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
@XmlType(name = "ModelCheckType", propOrder = {
    "ruleIdentifiers",
    "modelSubChecks",
    "resultSets"
})
public class ModelCheckType {

    @XmlElement(name = "RuleIdentifiers", required = true)
    protected RuleIdentifiersType ruleIdentifiers;
    @XmlElement(name = "ModelSubChecks", required = true)
    protected ModelSubChecksType modelSubChecks;
    @XmlElement(name = "ResultSets", required = true)
    protected ResultSetsType resultSets;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Ruft den Wert der ruleIdentifiers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RuleIdentifiersType }
     *     
     */
    public RuleIdentifiersType getRuleIdentifiers() {
        return ruleIdentifiers;
    }

    /**
     * Legt den Wert der ruleIdentifiers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleIdentifiersType }
     *     
     */
    public void setRuleIdentifiers(RuleIdentifiersType value) {
        this.ruleIdentifiers = value;
    }

    /**
     * Ruft den Wert der modelSubChecks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModelSubChecksType }
     *     
     */
    public ModelSubChecksType getModelSubChecks() {
        return modelSubChecks;
    }

    /**
     * Legt den Wert der modelSubChecks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelSubChecksType }
     *     
     */
    public void setModelSubChecks(ModelSubChecksType value) {
        this.modelSubChecks = value;
    }

    /**
     * Ruft den Wert der resultSets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetsType }
     *     
     */
    public ResultSetsType getResultSets() {
        return resultSets;
    }

    /**
     * Legt den Wert der resultSets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetsType }
     *     
     */
    public void setResultSets(ResultSetsType value) {
        this.resultSets = value;
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
