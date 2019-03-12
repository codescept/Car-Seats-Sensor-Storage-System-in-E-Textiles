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
@Table(name = "fifth_reading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FifthReading.findAll", query = "SELECT f FROM FifthReading f"),
    @NamedQuery(name = "FifthReading.findByFifthReadingId", query = "SELECT f FROM FifthReading f WHERE f.fifthReadingId = :fifthReadingId"),
    @NamedQuery(name = "FifthReading.findByFirstReading", query = "SELECT f FROM FifthReading f WHERE f.firstReading = :firstReading"),
    @NamedQuery(name = "FifthReading.findBySecondReading", query = "SELECT f FROM FifthReading f WHERE f.secondReading = :secondReading"),
    @NamedQuery(name = "FifthReading.findByThirdReading", query = "SELECT f FROM FifthReading f WHERE f.thirdReading = :thirdReading"),
    @NamedQuery(name = "FifthReading.findByFourthReading", query = "SELECT f FROM FifthReading f WHERE f.fourthReading = :fourthReading"),
    @NamedQuery(name = "FifthReading.findByFifthReading", query = "SELECT f FROM FifthReading f WHERE f.fifthReading = :fifthReading"),
    @NamedQuery(name = "FifthReading.findBySixthReading", query = "SELECT f FROM FifthReading f WHERE f.sixthReading = :sixthReading"),
    @NamedQuery(name = "FifthReading.findByTakenAt", query = "SELECT f FROM FifthReading f WHERE f.takenAt = :takenAt")})
public class FifthReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FifthReadingPK fifthReadingPK;
    @Basic(optional = false)
    @Column(name = "fifth_reading_id")
    private int fifthReadingId;
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

    public FifthReading() {
    }

    public FifthReading(FifthReadingPK fifthReadingPK) {
        this.fifthReadingPK = fifthReadingPK;
    }

    public FifthReading(FifthReadingPK fifthReadingPK, int fifthReadingId, String firstReading, String secondReading, String thirdReading, String fourthReading, String fifthReading, String sixthReading, String takenAt) {
        this.fifthReadingPK = fifthReadingPK;
        this.fifthReadingId = fifthReadingId;
        this.firstReading = firstReading;
        this.secondReading = secondReading;
        this.thirdReading = thirdReading;
        this.fourthReading = fourthReading;
        this.fifthReading = fifthReading;
        this.sixthReading = sixthReading;
        this.takenAt = takenAt;
    }

    public FifthReadingPK getFifthReadingPK() {
        return fifthReadingPK;
    }

    public void setFifthReadingPK(FifthReadingPK fifthReadingPK) {
        this.fifthReadingPK = fifthReadingPK;
    }

    public int getFifthReadingId() {
        return fifthReadingId;
    }

    public void setFifthReadingId(int fifthReadingId) {
        this.fifthReadingId = fifthReadingId;
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
        hash += (fifthReadingPK != null ? fifthReadingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FifthReading)) {
            return false;
        }
        FifthReading other = (FifthReading) object;
        if ((this.fifthReadingPK == null && other.fifthReadingPK != null) || (this.fifthReadingPK != null && !this.fifthReadingPK.equals(other.fifthReadingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.FifthReading[ fifthReadingPK=" + fifthReadingPK + " ]";
    }
    
}
