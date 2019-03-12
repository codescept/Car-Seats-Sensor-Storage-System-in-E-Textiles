/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraFeatures;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abdullah Sajid
 */
@Entity
@Table(name = "second_reading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecondReading.findAll", query = "SELECT s FROM SecondReading s"),
    @NamedQuery(name = "SecondReading.findBySecondReadingId", query = "SELECT s FROM SecondReading s WHERE s.secondReadingId = :secondReadingId"),
    @NamedQuery(name = "SecondReading.findByFirstReading", query = "SELECT s FROM SecondReading s WHERE s.firstReading = :firstReading"),
    @NamedQuery(name = "SecondReading.findBySecondReading", query = "SELECT s FROM SecondReading s WHERE s.secondReading = :secondReading"),
    @NamedQuery(name = "SecondReading.findByThirdReading", query = "SELECT s FROM SecondReading s WHERE s.thirdReading = :thirdReading"),
    @NamedQuery(name = "SecondReading.findByFourthReading", query = "SELECT s FROM SecondReading s WHERE s.fourthReading = :fourthReading"),
    @NamedQuery(name = "SecondReading.findByFifthReading", query = "SELECT s FROM SecondReading s WHERE s.fifthReading = :fifthReading"),
    @NamedQuery(name = "SecondReading.findBySixthReading", query = "SELECT s FROM SecondReading s WHERE s.sixthReading = :sixthReading"),
    @NamedQuery(name = "SecondReading.findByTakenAt", query = "SELECT s FROM SecondReading s WHERE s.takenAt = :takenAt")})
public class SecondReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecondReadingPK secondReadingPK;
    @Basic(optional = false)
    @Column(name = "second_reading_id")
    private int secondReadingId;
    @Basic(optional = false)
    @Column(name = "first_reading")
    private String firstReading;
    @Basic(optional = false)
    @Column(name = "second_reading")
    private String secondReading;
    @Basic(optional = false)
    @Column(name = "third_reading")
    private String thirdReading;
    @Basic(optional = false)
    @Column(name = "fourth_reading")
    private String fourthReading;
    @Basic(optional = false)
    @Column(name = "fifth_reading")
    private String fifthReading;
    @Basic(optional = false)
    @Column(name = "sixth_reading")
    private String sixthReading;
    @Basic(optional = false)
    @Column(name = "taken_at")
    private String takenAt;
    @JoinColumn(name = "test_id", referencedColumnName = "test_id")
    @ManyToOne(optional = false)
    private Tests testId;

    public SecondReading() {
    }

    public SecondReading(SecondReadingPK secondReadingPK) {
        this.secondReadingPK = secondReadingPK;
    }

    public SecondReading(SecondReadingPK secondReadingPK, int secondReadingId, String firstReading, String secondReading, String thirdReading, String fourthReading, String fifthReading, String sixthReading, String takenAt) {
        this.secondReadingPK = secondReadingPK;
        this.secondReadingId = secondReadingId;
        this.firstReading = firstReading;
        this.secondReading = secondReading;
        this.thirdReading = thirdReading;
        this.fourthReading = fourthReading;
        this.fifthReading = fifthReading;
        this.sixthReading = sixthReading;
        this.takenAt = takenAt;
    }

    public SecondReadingPK getSecondReadingPK() {
        return secondReadingPK;
    }

    public void setSecondReadingPK(SecondReadingPK secondReadingPK) {
        this.secondReadingPK = secondReadingPK;
    }

    public int getSecondReadingId() {
        return secondReadingId;
    }

    public void setSecondReadingId(int secondReadingId) {
        this.secondReadingId = secondReadingId;
    }

    public String getFirstReading() {
        return firstReading;
    }

    public void setFirstReading(String firstReading) {
        this.firstReading = firstReading;
    }

    public String getSecondReading() {
        return secondReading;
    }

    public void setSecondReading(String secondReading) {
        this.secondReading = secondReading;
    }

    public String getThirdReading() {
        return thirdReading;
    }

    public void setThirdReading(String thirdReading) {
        this.thirdReading = thirdReading;
    }

    public String getFourthReading() {
        return fourthReading;
    }

    public void setFourthReading(String fourthReading) {
        this.fourthReading = fourthReading;
    }

    public String getFifthReading() {
        return fifthReading;
    }

    public void setFifthReading(String fifthReading) {
        this.fifthReading = fifthReading;
    }

    public String getSixthReading() {
        return sixthReading;
    }

    public void setSixthReading(String sixthReading) {
        this.sixthReading = sixthReading;
    }

    public String getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(String takenAt) {
        this.takenAt = takenAt;
    }

    public Tests getTestId() {
        return testId;
    }

    public void setTestId(Tests testId) {
        this.testId = testId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secondReadingPK != null ? secondReadingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecondReading)) {
            return false;
        }
        SecondReading other = (SecondReading) object;
        if ((this.secondReadingPK == null && other.secondReadingPK != null) || (this.secondReadingPK != null && !this.secondReadingPK.equals(other.secondReadingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.SecondReading[ secondReadingPK=" + secondReadingPK + " ]";
    }
    
}
