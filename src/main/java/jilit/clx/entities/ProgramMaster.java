/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jilit.clx.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "programmaster")
 public class ProgramMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "programid")
    private String programid;
    @Basic(optional = false)
    @Column(name = "programcode")
    private String programcode;
    @Basic(optional = false)
    @Column(name = "programname")
    private String programname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programmaster")
    private Collection<BranchMaster> branchMasterCollection;

    public ProgramMaster() {
    }

    public ProgramMaster(String programid) {
        this.programid = programid;
    }

    public ProgramMaster(String programid, String programcode, String programname) {
        this.programid = programid;
        this.programcode = programcode;
        this.programname = programname;
    }

    public String getProgramid() {
        return programid;
    }

    public void setProgramid(String programid) {
        this.programid = programid;
    }

    public String getProgramcode() {
        return programcode;
    }

    public void setProgramcode(String programcode) {
        this.programcode = programcode;
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname;
    }

    @XmlTransient
    public Collection<BranchMaster> getBranchMasterCollection() {
        return branchMasterCollection;
    }

    public void setBranchmasterCollection(Collection<BranchMaster> branchMasterCollection) {
        this.branchMasterCollection = branchMasterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programid != null ? programid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramMaster)) {
            return false;
        }
        ProgramMaster other = (ProgramMaster) object;
        if ((this.programid == null && other.programid != null) || (this.programid != null && !this.programid.equals(other.programid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProgramMaster[ programid=" + programid + " ]";
    }
    
}
