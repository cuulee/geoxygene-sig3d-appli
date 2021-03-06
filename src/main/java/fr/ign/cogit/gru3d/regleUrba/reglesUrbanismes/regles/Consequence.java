//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.1.3-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2010.01.22 at 02:09:30 PM CET
//

package fr.ign.cogit.gru3d.regleUrba.reglesUrbanismes.regles;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import fr.ign.cogit.gru3d.regleUrba.representation.Incoherence;
import fr.ign.cogit.gru3d.regleUrba.schemageo.Parcelle;

/**
 * 
 *        This software is released under the licence CeCILL
 * 
 *        see LICENSE.TXT
 * 
 *        see <http://www.cecill.info/ http://www.cecill.info/
 * 
 * 
 * 
 * @copyright IGN
 * 
 * @author Brasebin Mickaël
 * 
 * @version 1.0
 *
 * <p>
 * Java class for Consequence complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Consequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlSeeAlso({ LimitationCES.class, LimitationCOS.class,
    BandeConstructibilite.class, ConsequenceHauteur.class, AngleToit.class,
    ConsequenceTexture.class, Recul.class, Interdiction.class })
public abstract class Consequence {

  @XmlTransient
  protected String description = "";

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link String }
   */
  public String getDescription() {
    this.description = this.toString();
    return this.description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value allowed object is {@link String }
   */
  public void setDescription(String value) {
    this.description = this.toString();
  }

  @Override
  public String toString() {
    return "";
  }

  public abstract List<Incoherence> isConsequenceChecked(Parcelle p, boolean represent);

}
