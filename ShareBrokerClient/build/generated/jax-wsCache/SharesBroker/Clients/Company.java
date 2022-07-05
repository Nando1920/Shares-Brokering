
package Clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Company_Symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Shares_Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", namespace = "http://xml.netbeans.org/schema/Shares", propOrder = {
    "companyName",
    "companySymbol",
    "sharesNumber"
})
public class Company {

    @XmlElement(name = "Company_Name", namespace = "http://xml.netbeans.org/schema/Shares", required = true)
    protected String companyName;
    @XmlElement(name = "Company_Symbol", namespace = "http://xml.netbeans.org/schema/Shares", required = true)
    protected String companySymbol;
    @XmlElement(name = "Shares_Number", namespace = "http://xml.netbeans.org/schema/Shares")
    protected int sharesNumber;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanySymbol() {
        return companySymbol;
    }

    /**
     * Sets the value of the companySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanySymbol(String value) {
        this.companySymbol = value;
    }

    /**
     * Gets the value of the sharesNumber property.
     * 
     */
    public int getSharesNumber() {
        return sharesNumber;
    }

    /**
     * Sets the value of the sharesNumber property.
     * 
     */
    public void setSharesNumber(int value) {
        this.sharesNumber = value;
    }

}
