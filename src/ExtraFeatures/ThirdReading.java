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
@Table(name = "third_reading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ThirdReading.findAll", query = "SELECT t FROM ThirdReading t"),
    @NamedQuery(name = "ThirdReading.findByThirdReadingId", query = "SELECT t FROM ThirdReading t WHERE t.thirdReadingId = :thirdReadingId"),
    @NamedQuery(name = "ThirdReading.findByFirstReading", query = "SELECT t FROM ThirdReading t WHERE t.firstReading = :firstReading"),
    @NamedQuery(name = "ThirdReading.findBySecondReading", query = "SELECT t FROM ThirdReading t WHERE t.secondReading = :secondReading"),
    @NamedQuery(name = "ThirdReading.findByThirdReading", query = "SELECT t FROM ThirdReading t WHERE t.thirdReading = :thirdReading"),
    @NamedQuery(name = "ThirdReading.findByFourthReading", query = "SELECT t FROM ThirdReading t WHERE t.fourthReading = :fourthReading"),
    @NamedQuery(name = "ThirdReading.findByFifthReading", query = "SELECT t FROM ThirdReading t WHERE t.fifthReading = :fifthReading"),
    @NamedQuery(name = "ThirdReading.findBySixthReading", query = "SELECT t FROM ThirdReading t WHERE t.sixthReading = :sixthReading"),
    @NamedQuery(name = "ThirdReading.findByTakenAt", query = "SELECT t FROM ThirdReading t WHERE t.takenAt = :takenAt")})
public class ThirdReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ThirdReadingPK thirdReadingPK;
    @Basic(optional = false)
    @Column(name = "third_reading_id")
    private int thirdReadingId;
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

    public ThirdReading() {
    }

    public ThirdReading(ThirdReadingPK thirdReadingPK) {
        this.thirdReadingPK = thirdReadingPK;
    }

    public ThirdReading(ThirdReadingPK thirdReadingPK, int thirdReadingId, String firstReading, String secondReading, String thirdReading, String fourthReading, String fifthReading, String sixthReading, String takenAt) {
        this.thirdReadingPK = thirdReadingPK;
        this.thirdReadingId = thirdReadingId;
        this.firstReading = firstReading;
        this.secondReading = secondReading;
        this.thirdReading = thirdReading;
        this.fourthReading = fourthReading;
        this.fifthReading = fifthReading;
        this.sixthReading = sixthReading;
        this.takenAt = takenAt;
    }

    public ThirdReadingPK getThirdReadingPK() {
        return thirdReadingPK;
    }

    public void setThirdReadingPK(ThirdReadingPK thirdReadingPK) {
        this.thirdReadingPK = thirdReadingPK;
    }

    public int getThirdReadingId() {
        return thirdReadingId;
    }

    public void setThirdReadingId(int thirdReadingId) {
        this.thirdReadingId = thirdReadingId;
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
        hash += (thirdReadingPK != null ? thirdReadingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThirdReading)) {
            return false;
        }
        ThirdReading other = (ThirdReading) object;
        if ((this.thirdReadingPK == null && other.thirdReadingPK != null) || (this.thirdReadingPK != null && !this.thirdReadingPK.equals(other.thirdReadingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.ThirdReading[ thirdReadingPK=" + thirdReadingPK + " ]";
    }
    
}
