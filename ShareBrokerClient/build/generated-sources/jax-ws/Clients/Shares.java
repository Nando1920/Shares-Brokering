
package Clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Info" type="{http://xml.netbeans.org/schema/Shares}Company"/>
 *         &lt;element name="Share_Price" type="{http://xml.netbeans.org/schema/Shares}Price"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shares", namespace = "http://xml.netbeans.org/schema/Shares", propOrder = {
    "companyInfo",
    "sharePrice"
})
public class Shares {

    @XmlElement(name = "Company_Info", namespace = "http://xml.netbeans.org/schema/Shares", required = true)
    protected Company companyInfo;
    @XmlElement(name = "Share_Price", namespace = "http://xml.netbeans.org/schema/Shares", required = true)
    protected Price sharePrice;

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompanyInfo(Company value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the sharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSharePrice() {
        return sharePrice;
    }

    /**
     * Sets the value of the sharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSharePrice(Price value) {
        this.sharePrice = value;
    }

}
