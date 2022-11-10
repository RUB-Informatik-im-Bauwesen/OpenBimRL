//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.10 um 10:08:44 PM CET 
//


package de.rub.bi.inf.openbimrl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrecalculationsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrecalculationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="Node" type="{http://inf.bi.rub.de/OpenBimRL}NodeType"/&gt;
 *         &lt;element name="Edge" type="{http://inf.bi.rub.de/OpenBimRL}EdgeType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecalculationsType", propOrder = {
    "nodeOrEdge"
})
public class PrecalculationsType {

    @XmlElements({
        @XmlElement(name = "Node", type = NodeType.class),
        @XmlElement(name = "Edge", type = EdgeType.class)
    })
    protected List<Object> nodeOrEdge;

    /**
     * Gets the value of the nodeOrEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeOrEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeOrEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeType }
     * {@link EdgeType }
     * 
     * 
     */
    public List<Object> getNodeOrEdge() {
        if (nodeOrEdge == null) {
            nodeOrEdge = new ArrayList<Object>();
        }
        return this.nodeOrEdge;
    }

}
