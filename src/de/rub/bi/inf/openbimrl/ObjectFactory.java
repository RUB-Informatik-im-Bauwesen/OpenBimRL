//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.11.10 um 10:18:51 PM CET 
//


package de.rub.bi.inf.openbimrl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.rub.bi.inf.openbimrl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BIMRule_QNAME = new QName("http://inf.bi.rub.de/OpenBimRL", "BIMRule");
    private final static QName _Rule_QNAME = new QName("http://inf.bi.rub.de/OpenBimRL", "Rule");
    private final static QName _Rules_QNAME = new QName("http://inf.bi.rub.de/OpenBimRL", "Rules");
    private final static QName _NodeTypeDescription_QNAME = new QName("http://inf.bi.rub.de/OpenBimRL", "Description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.rub.bi.inf.openbimrl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link BIMRuleType }
     * 
     */
    public BIMRuleType createBIMRuleType() {
        return new BIMRuleType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link RulesType }
     * 
     */
    public RulesType createRulesType() {
        return new RulesType();
    }

    /**
     * Create an instance of {@link InputType }
     * 
     */
    public InputType createInputType() {
        return new InputType();
    }

    /**
     * Create an instance of {@link OutputType }
     * 
     */
    public OutputType createOutputType() {
        return new OutputType();
    }

    /**
     * Create an instance of {@link ModelCheckType }
     * 
     */
    public ModelCheckType createModelCheckType() {
        return new ModelCheckType();
    }

    /**
     * Create an instance of {@link RuleIdentifiersType }
     * 
     */
    public RuleIdentifiersType createRuleIdentifiersType() {
        return new RuleIdentifiersType();
    }

    /**
     * Create an instance of {@link RuleIdentifierType }
     * 
     */
    public RuleIdentifierType createRuleIdentifierType() {
        return new RuleIdentifierType();
    }

    /**
     * Create an instance of {@link ModelSubChecksType }
     * 
     */
    public ModelSubChecksType createModelSubChecksType() {
        return new ModelSubChecksType();
    }

    /**
     * Create an instance of {@link ModelSubCheckType }
     * 
     */
    public ModelSubCheckType createModelSubCheckType() {
        return new ModelSubCheckType();
    }

    /**
     * Create an instance of {@link ApplicabilityType }
     * 
     */
    public ApplicabilityType createApplicabilityType() {
        return new ApplicabilityType();
    }

    /**
     * Create an instance of {@link ResultSetType }
     * 
     */
    public ResultSetType createResultSetType() {
        return new ResultSetType();
    }

    /**
     * Create an instance of {@link ResultSetsType }
     * 
     */
    public ResultSetsType createResultSetsType() {
        return new ResultSetsType();
    }

    /**
     * Create an instance of {@link PrecalculationsType }
     * 
     */
    public PrecalculationsType createPrecalculationsType() {
        return new PrecalculationsType();
    }

    /**
     * Create an instance of {@link EdgeType }
     * 
     */
    public EdgeType createEdgeType() {
        return new EdgeType();
    }

    /**
     * Create an instance of {@link NodeType.Inputs }
     * 
     */
    public NodeType.Inputs createNodeTypeInputs() {
        return new NodeType.Inputs();
    }

    /**
     * Create an instance of {@link NodeType.Outputs }
     * 
     */
    public NodeType.Outputs createNodeTypeOutputs() {
        return new NodeType.Outputs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BIMRuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BIMRuleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://inf.bi.rub.de/OpenBimRL", name = "BIMRule")
    public JAXBElement<BIMRuleType> createBIMRule(BIMRuleType value) {
        return new JAXBElement<BIMRuleType>(_BIMRule_QNAME, BIMRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://inf.bi.rub.de/OpenBimRL", name = "Rule")
    public JAXBElement<RuleType> createRule(RuleType value) {
        return new JAXBElement<RuleType>(_Rule_QNAME, RuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RulesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://inf.bi.rub.de/OpenBimRL", name = "Rules")
    public JAXBElement<RulesType> createRules(RulesType value) {
        return new JAXBElement<RulesType>(_Rules_QNAME, RulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://inf.bi.rub.de/OpenBimRL", name = "Description", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeDescription(String value) {
        return new JAXBElement<String>(_NodeTypeDescription_QNAME, String.class, NodeType.class, value);
    }

}
