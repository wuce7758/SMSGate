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
    "userID",
    "clientID"
})
@XmlRootElement(name = "User")
public class User {

    @XmlElement(name = "UserID", required = true)
    protected UserID userID;
    @XmlElement(name = "ClientID")
    protected ClientID clientID;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link UserID }
     *     
     */
    public UserID getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserID }
     *     
     */
    public void setUserID(UserID value) {
        this.userID = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClientID(ClientID value) {
        this.clientID = value;
    }

}
