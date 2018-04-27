/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jilit.clx.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
 
@Entity
@Table(name = "studentmaster")
 
public class StudentMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "studentid")
    private String studentid;
    @Basic(optional = false)
    @Column(name = "enrollmentno")
    private String enrollmentno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "programid")
    private int programid;
    @Basic(optional = false)
    @Column(name = "branchid")
    private int branchid;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "CurrentSemester")
    private Integer currentSemester;

    public StudentMaster() {
    }

    public StudentMaster(String studentid) {
        this.studentid = studentid;
    }

    public StudentMaster(String studentid, String enrollmentno, String name, int programid, int branchid) {
        this.studentid = studentid;
        this.enrollmentno = enrollmentno;
        this.name = name;
        this.programid = programid;
        this.branchid = branchid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getEnrollmentno() {
        return enrollmentno;
    }

    public void setEnrollmentno(String enrollmentno) {
        this.enrollmentno = enrollmentno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgramid() {
        return programid;
    }

    public void setProgramid(int programid) {
        this.programid = programid;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(Integer currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentMaster)) {
            return false;
        }
        StudentMaster other = (StudentMaster) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jilit.clx.entities.StudentMaster[ studentid=" + studentid + " ]";
    }
    
}
