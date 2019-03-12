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
@Table(name = "fourth_reading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FourthReading.findAll", query = "SELECT f FROM FourthReading f"),
    @NamedQuery(name = "FourthReading.findByFourthReadingId", query = "SELECT f FROM FourthReading f WHERE f.fourthReadingId = :fourthReadingId"),
    @NamedQuery(name = "FourthReading.findByFirstReading", query = "SELECT f FROM FourthReading f WHERE f.firstReading = :firstReading"),
    @NamedQuery(name = "FourthReading.findBySecondReading", query = "SELECT f FROM FourthReading f WHERE f.secondReading = :secondReading"),
    @NamedQuery(name = "FourthReading.findByThirdReading", query = "SELECT f FROM FourthReading f WHERE f.thirdReading = :thirdReading"),
    @NamedQuery(name = "FourthReading.findByFourthReading", query = "SELECT f FROM FourthReading f WHERE f.fourthReading = :fourthReading"),
    @NamedQuery(name = "FourthReading.findByFifthReading", query = "SELECT f FROM FourthReading f WHERE f.fifthReading = :fifthReading"),
    @NamedQuery(name = "FourthReading.findBySixthReading", query = "SELECT f FROM FourthReading f WHERE f.sixthReading = :sixthReading"),
    @NamedQuery(name = "FourthReading.findByTakenAt", query = "SELECT f FROM FourthReading f WHERE f.takenAt = :takenAt")})
public class FourthReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FourthReadingPK fourthReadingPK;
    @Basic(optional = false)
    @Column(name = "fourth_reading_id")
    private int fourthReadingId;
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

    public FourthReading() {
    }

    public FourthReading(FourthReadingPK fourthReadingPK) {
        this.fourthReadingPK = fourthReadingPK;
    }

    public FourthReading(FourthReadingPK fourthReadingPK, int fourthReadingId, String firstReading, String secondReading, String thirdReading, String fourthReading, String fifthReading, String sixthReading, String takenAt) {
        this.fourthReadingPK = fourthReadingPK;
        this.fourthReadingId = fourthReadingId;
        this.firstReading = firstReading;
        this.secondReading = secondReading;
        this.thirdReading = thirdReading;
        this.fourthReading = fourthReading;
        this.fifthReading = fifthReading;
        this.sixthReading = sixthReading;
        this.takenAt = takenAt;
    }

    public FourthReadingPK getFourthReadingPK() {
        return fourthReadingPK;
    }

    public void setFourthReadingPK(FourthReadingPK fourthReadingPK) {
        this.fourthReadingPK = fourthReadingPK;
    }

    public int getFourthReadingId() {
        return fourthReadingId;
    }

    public void setFourthReadingId(int fourthReadingId) {
        this.fourthReadingId = fourthReadingId;
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
        hash += (fourthReadingPK != null ? fourthReadingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FourthReading)) {
            return false;
        }
        FourthReading other = (FourthReading) object;
        if ((this.fourthReadingPK == null && other.fourthReadingPK != null) || (this.fourthReadingPK != null && !this.fourthReadingPK.equals(other.fourthReadingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.FourthReading[ fourthReadingPK=" + fourthReadingPK + " ]";
    }
    
}
