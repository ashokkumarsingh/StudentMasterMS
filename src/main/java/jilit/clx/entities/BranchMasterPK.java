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
    private String programid;
    @Basic(optional = false)
    @Column(name = "branchid")
    private String branchid;

    public BranchMasterPK() {
    }

    public BranchMasterPK(String programid, String branchid) {
        this.programid = programid;
        this.branchid = branchid;
    }

    public String getProgramid() {
        return programid;
    }

    public void setProgramid(String programid) {
        this.programid = programid;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

   

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchid == null) ? 0 : branchid.hashCode());
		result = prime * result + ((programid == null) ? 0 : programid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BranchMasterPK other = (BranchMasterPK) obj;
		if (branchid == null) {
			if (other.branchid != null)
				return false;
		} else if (!branchid.equals(other.branchid))
			return false;
		if (programid == null) {
			if (other.programid != null)
				return false;
		} else if (!programid.equals(other.programid))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "jilit.clx.entities.BranchmasterPK[ programid=" + programid + ", branchid=" + branchid + " ]";
    }
    
}
