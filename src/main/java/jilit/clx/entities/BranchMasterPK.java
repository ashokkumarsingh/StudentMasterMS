/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jilit.clx.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

 
public class BranchMasterPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "programid")
    private int programid;
    @Basic(optional = false)
    @Column(name = "branchid")
    private int branchid;

    public BranchMasterPK() {
    }

    public BranchMasterPK(int programid, int branchid) {
        this.programid = programid;
        this.branchid = branchid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) programid;
        hash += (int) branchid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchMasterPK)) {
            return false;
        }
        BranchMasterPK other = (BranchMasterPK) object;
        if (this.programid != other.programid) {
            return false;
        }
        if (this.branchid != other.branchid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jilit.clx.entities.BranchmasterPK[ programid=" + programid + ", branchid=" + branchid + " ]";
    }
    
}
