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

    public BranchMaster(String programid, String branchid) {
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchcode == null) ? 0 : branchcode.hashCode());
		result = prime * result + ((branchmasterPK == null) ? 0 : branchmasterPK.hashCode());
		result = prime * result + ((branchname == null) ? 0 : branchname.hashCode());
		result = prime * result + ((programmaster == null) ? 0 : programmaster.hashCode());
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
		BranchMaster other = (BranchMaster) obj;
		if (branchcode == null) {
			if (other.branchcode != null)
				return false;
		} else if (!branchcode.equals(other.branchcode))
			return false;
		if (branchmasterPK == null) {
			if (other.branchmasterPK != null)
				return false;
		} else if (!branchmasterPK.equals(other.branchmasterPK))
			return false;
		if (branchname == null) {
			if (other.branchname != null)
				return false;
		} else if (!branchname.equals(other.branchname))
			return false;
		if (programmaster == null) {
			if (other.programmaster != null)
				return false;
		} else if (!programmaster.equals(other.programmaster))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BranchMaster [branchmasterPK=" + branchmasterPK + ", branchcode=" + branchcode + ", branchname="
				+ branchname + ", programmaster=" + programmaster + "]";
	}
 
    
     
}
