/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraFeatures;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Abdullah Sajid
 */
@Entity
@Table(name = "tests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tests.findAll", query = "SELECT t FROM Tests t"),
    @NamedQuery(name = "Tests.findByTestId", query = "SELECT t FROM Tests t WHERE t.testId = :testId"),
    @NamedQuery(name = "Tests.findByTestName", query = "SELECT t FROM Tests t WHERE t.testName = :testName"),
    @NamedQuery(name = "Tests.findByCreatedAt", query = "SELECT t FROM Tests t WHERE t.createdAt = :createdAt")})
public class Tests implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TestsPK testsPK;
    @Basic(optional = false)
    @Column(name = "test_id")
    private int testId;
    @Basic(optional = false)
    @Column(name = "test_name")
    private String testName;
    @Basic(optional = false)
    @Column(name = "created_at")
    private String createdAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<FirstReading> firstReadingCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Users username;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<CalibrationReading> calibrationReadingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<FourthReading> fourthReadingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<ThirdReading> thirdReadingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<FifthReading> fifthReadingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testId")
    private Collection<SecondReading> secondReadingCollection;

    public Tests() {
    }

    public Tests(TestsPK testsPK) {
        this.testsPK = testsPK;
    }

    public Tests(TestsPK testsPK, int testId, String testName, String createdAt) {
        this.testsPK = testsPK;
        this.testId = testId;
        this.testName = testName;
        this.createdAt = createdAt;
    }

    public TestsPK getTestsPK() {
        return testsPK;
    }

    public void setTestsPK(TestsPK testsPK) {
        this.testsPK = testsPK;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        int oldTestId = this.testId;
        this.testId = testId;
        changeSupport.firePropertyChange("testId", oldTestId, testId);
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        String oldTestName = this.testName;
        this.testName = testName;
        changeSupport.firePropertyChange("testName", oldTestName, testName);
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        String oldCreatedAt = this.createdAt;
        this.createdAt = createdAt;
        changeSupport.firePropertyChange("createdAt", oldCreatedAt, createdAt);
    }

    @XmlTransient
    public Collection<FirstReading> getFirstReadingCollection() {
        return firstReadingCollection;
    }

    public void setFirstReadingCollection(Collection<FirstReading> firstReadingCollection) {
        this.firstReadingCollection = firstReadingCollection;
    }

    public Users getUsername() {
        return username;
    }

    public void setUsername(Users username) {
        Users oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    @XmlTransient
    public Collection<CalibrationReading> getCalibrationReadingCollection() {
        return calibrationReadingCollection;
    }

    public void setCalibrationReadingCollection(Collection<CalibrationReading> calibrationReadingCollection) {
        this.calibrationReadingCollection = calibrationReadingCollection;
    }

    @XmlTransient
    public Collection<FourthReading> getFourthReadingCollection() {
        return fourthReadingCollection;
    }

    public void setFourthReadingCollection(Collection<FourthReading> fourthReadingCollection) {
        this.fourthReadingCollection = fourthReadingCollection;
    }

    @XmlTransient
    public Collection<ThirdReading> getThirdReadingCollection() {
        return thirdReadingCollection;
    }

    public void setThirdReadingCollection(Collection<ThirdReading> thirdReadingCollection) {
        this.thirdReadingCollection = thirdReadingCollection;
    }

    @XmlTransient
    public Collection<FifthReading> getFifthReadingCollection() {
        return fifthReadingCollection;
    }

    public void setFifthReadingCollection(Collection<FifthReading> fifthReadingCollection) {
        this.fifthReadingCollection = fifthReadingCollection;
    }

    @XmlTransient
    public Collection<SecondReading> getSecondReadingCollection() {
        return secondReadingCollection;
    }

    public void setSecondReadingCollection(Collection<SecondReading> secondReadingCollection) {
        this.secondReadingCollection = secondReadingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testsPK != null ? testsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tests)) {
            return false;
        }
        Tests other = (Tests) object;
        if ((this.testsPK == null && other.testsPK != null) || (this.testsPK != null && !this.testsPK.equals(other.testsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFeatures.Tests[ testsPK=" + testsPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
