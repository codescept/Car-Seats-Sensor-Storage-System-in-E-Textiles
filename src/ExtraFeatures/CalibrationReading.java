/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraFeatures;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abdullah Sajid
 */
@Entity
@Table(name = "calibration_reading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CalibrationReading.findAll", query = "SELECT c FROM CalibrationReading c"),
    @NamedQuery(name = "CalibrationReading.findByCalibrationId", query = "SELECT c FROM CalibrationReading c WHERE c.calibrationId = :calibrationId"),
    @NamedQuery(name = "CalibrationReading.findByFirstReading", query = "SELECT c FROM CalibrationReading c WHERE c.firstReading = :firstReading"),
    @NamedQuery(name = "CalibrationReading.findBySecondReading", query = "SELECT c FROM CalibrationReading c WHERE c.secondReading = :secondReading"),
    @NamedQuery(name = "CalibrationReading.findByThirdReading", query = "SELECT c FROM CalibrationReading c WHERE c.thirdReading = :thirdReading"),
    @NamedQuery(name = "CalibrationReading.findByFourthReading", query = "SELECT c FROM CalibrationReading c WHERE c.fourthReading = :fourthReading"),
    @NamedQuery(name = "CalibrationReading.findByFifthReading", query = "SELECT c FROM CalibrationReading c WHERE c.fifthReading = :fifthReading"),
    @NamedQuery(name = "CalibrationReading.findBySixthReading", query = "SELECT c FROM CalibrationReading c WHERE c.sixthReading = :sixthReading"),
    @NamedQuery(name = "CalibrationReading.findByTakenAt", query = "SELECT c FROM CalibrationReading c WHERE c.takenAt = :takenAt")})
public class CalibrationReading implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CalibrationReadingPK calibrationReadingPK;
    @Basic(optional = false)
    @Column(name = "calibration_id")
    private int calibrationId;
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

    public CalibrationReading() {
    }

    public CalibrationReading(CalibrationReadingPK calibrationReadingPK) {
        this.calibrationReadingPK = calibrationReadingPK;
    }

    public CalibrationReading(CalibrationReadingPK calibrationReadingPK, int calibrationId, String firstReading, String secondReading, String thirdReading, String fourthReading, String fifthReading, String sixthReading, String takenAt) {
        this.calibrationReadingPK = calibrationReadingPK;
        this.calibrationId = calibrationId;
        this.firstReading = firstReading;
        this.secondReading = secondReading;
        this.thirdReading = thirdReading;
        this.fourthReading = fourthReading;
        this.fifthReading = fifthReading;
        this.sixthReading = sixthReading;
        this.takenAt = takenAt;
    }

    public CalibrationReadingPK getCalibrationReadingPK() {
        return calibrationReadingPK;
    }

    public void setCalibrationReadingPK(CalibrationReadingPK calibrationReadingPK) {
        this.calibrationReadingPK = calibrationReadingPK;
    }

    public int getCalibrationId() {
        return calibrationId;
    }

    public void setCalibrationId(int calibrationId) {
        int oldCalibrationId = this.calibrationId;
        this.calibrationId = calibrationId;
        changeSupport.firePropertyChange("calibrationId", oldCalibrationId, calibrationId);
    }

    public String getFirstReading() {
        return firstReading;
    }

    public void setFirstReading(String firstReading) {
        String oldFirstReading = this.firstReading;
        this.firstReading = firstReading;
        changeSupport.firePropertyChange("firstReading", oldFirstReading, firstReading);
    }

    public String getSecondReading() {
        return secondReading;
    }

    public void setSecondReading(String secondReading) {
        String oldSecondReading = this.secondReading;
        this.secondReading = secondReading;
        changeSupport.firePropertyChange("secondReading", oldSecondReading, secondReading);
    }

    public String getThirdReading() {
        return thirdReading;
    }

    public void setThirdReading(String thirdReading) {
        String oldThirdReading = this.thirdReading;
        this.thirdReading = thirdReading;
        changeSupport.firePropertyChange("thirdReading", oldThirdReading, thirdReading);
    }

    public String getFourthReading() {
        return fourthReading;
    }

    public void setFourthReading(String fourthReading) {
        String oldFourthReading = this.fourthReading;
        this.fourthReading = fourthReading;
        changeSupport.firePropertyChange("fourthReading", oldFourthReading, fourthReading);
    }

    public String getFifthReading() {
        return fifthReading;
    }

    public void setFifthReading(String fifthReading) {
        String oldFifthReading = this.fifthReading;
        this.fifthReading = fifthReading;
        changeSupport.firePropertyChange("fifthReading", oldFifthReading, fifthReading);
    }

    public String getSixthReading() {
        return sixthReading;
    }

    public void setSixthReading(String sixthReading) {
        String oldSixthReading = this.sixthReading;
        this.sixthReading = sixthReading;
        changeSupport.firePropertyChange("sixthReading", oldSixthReading, sixthReading);
    }

    public String getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(String takenAt) {
        String oldTakenAt = this.takenAt;
        this.takenAt = takenAt;
        changeSupport.firePropertyChange("takenAt", oldTakenAt, takenAt);
    }

    public Tests getTestId() {
        return testId;
    }

    public void setTestId(Tests testId) {
        Tests oldTestId = this.testId;
        this.testId = testId;
        changeSupport.firePropertyChange("testId", oldTestId, testId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calibrationReadingPK != null ? calibrationReadingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalibrationReading)) {
            return false;
        }
        CalibrationReading other = (CalibrationReading) object;
        if ((this.calibrationReadingPK == null && other.calibrationReadingPK != null) || (this.calibrationReadingPK != null && !this.calibrationReadingPK.equals(other.calibrationReadingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.CalibrationReading[ calibrationReadingPK=" + calibrationReadingPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
