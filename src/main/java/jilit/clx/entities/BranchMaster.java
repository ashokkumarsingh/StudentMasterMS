/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jilit.clx.entities;

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

 
@Entity
@Table(name = "branchmaster")
 
 public class BranchMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BranchMasterPK branchmasterPK;
    @Basic(optional = false)
    @Column(name = "branchcode")
    private String branchcode;
    @Basic(optional = false)
    @Column(name = "branchname")
    private String branchname;
    @JoinColumn(name = "programid", referencedColumnName = "programid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProgramMaster programmaster;

    public BranchMaster() {
    }

    public BranchMaster(BranchMasterPK branchmasterPK) {
        this.branchmasterPK = branchmasterPK;
    }

    public BranchMaster(BranchMasterPK branchmasterPK, String branchcode, String branchname) {
        this.branchmasterPK = branchmasterPK;
        this.branchcode = branchcode;
        this.branchname = branchname;
    }

    public BranchMaster(int programid, int branchid) {
        this.branchmasterPK = new BranchMasterPK(programid, branchid);
    }

    public BranchMasterPK getBranchmasterPK() {
        return branchmasterPK;
    }

    public void setBranchmasterPK(BranchMasterPK branchmasterPK) {
        this.branchmasterPK = branchmasterPK;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public ProgramMaster getProgrammaster() {
        return programmaster;
    }

    public void setProgrammaster(ProgramMaster programmaster) {
        this.programmaster = programmaster;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchmasterPK != null ? branchmasterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchMaster)) {
            return false;
        }
        BranchMaster other = (BranchMaster) object;
        if ((this.branchmasterPK == null && other.branchmasterPK != null) || (this.branchmasterPK != null && !this.branchmasterPK.equals(other.branchmasterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jilit.clx.entities.BranchMaster[ branchmasterPK=" + branchmasterPK + " ]";
    }
    
}
