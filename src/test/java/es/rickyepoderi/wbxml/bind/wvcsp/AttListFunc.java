//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cali",
    "dali",
    "gals"
})
@XmlRootElement(name = "AttListFunc")
public class AttListFunc {

    @XmlElement(name = "CALI")
    protected CALI cali;
    @XmlElement(name = "DALI")
    protected DALI dali;
    @XmlElement(name = "GALS")
    protected GALS gals;

    /**
     * Gets the value of the cali property.
     * 
     * @return
     *     possible object is
     *     {@link CALI }
     *     
     */
    public CALI getCALI() {
        return cali;
    }

    /**
     * Sets the value of the cali property.
     * 
     * @param value
     *     allowed object is
     *     {@link CALI }
     *     
     */
    public void setCALI(CALI value) {
        this.cali = value;
    }

    /**
     * Gets the value of the dali property.
     * 
     * @return
     *     possible object is
     *     {@link DALI }
     *     
     */
    public DALI getDALI() {
        return dali;
    }

    /**
     * Sets the value of the dali property.
     * 
     * @param value
     *     allowed object is
     *     {@link DALI }
     *     
     */
    public void setDALI(DALI value) {
        this.dali = value;
    }

    /**
     * Gets the value of the gals property.
     * 
     * @return
     *     possible object is
     *     {@link GALS }
     *     
     */
    public GALS getGALS() {
        return gals;
    }

    /**
     * Sets the value of the gals property.
     * 
     * @param value
     *     allowed object is
     *     {@link GALS }
     *     
     */
    public void setGALS(GALS value) {
        this.gals = value;
    }

}
