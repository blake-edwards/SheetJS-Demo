package com.dataaccessobject.blake;

//Resource allocation data transfer object
public class ResourceAllocationRow {
	private int id;
	private int RA_year;
	private String RE;
	private String CRO;
	private String project_code;
	private double JAN;
	private double FEB;
	private double MAR;
	private double APR;
	private double MAY;
	private double JUN;
	private double JUL;
	private double AUG;
	private double SEP;
	private double OCT;
	private double NOV;
	private double DEC;
	private String update_by;
	private String update_when;
	private String notes;
	
	public ResourceAllocationRow() { // originally contains nothing upon instantiation
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the rA_year
	 */
	public int getRA_year() {
		return RA_year;
	}
	/**
	 * @param rA_year the rA_year to set
	 */
	public void setRA_year(int rA_year) {
		RA_year = rA_year;
	}
	/**
	 * @return the rE
	 */
	public String getRE() {
		return RE;
	}
	/**
	 * @param rE the rE to set
	 */
	public void setRE(String rE) {
		RE = rE;
	}
	/**
	 * @return the cRO
	 */
	public String getCRO() {
		return CRO;
	}
	/**
	 * @param cRO the cRO to set
	 */
	public void setCRO(String cRO) {
		CRO = cRO;
	}
	/**
	 * @return the project_code
	 */
	public String getProject_code() {
		return project_code;
	}
	/**
	 * @param project_code the project_code to set
	 */
	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}
	/**
	 * @return the jAN
	 */
	public double getJAN() {
		return JAN;
	}
	/**
	 * @param jAN the jAN to set
	 */
	public void setJAN(double jAN) {
		JAN = jAN;
	}
	/**
	 * @return the fEB
	 */
	public double getFEB() {
		return FEB;
	}
	/**
	 * @param fEB the fEB to set
	 */
	public void setFEB(double fEB) {
		FEB = fEB;
	}
	/**
	 * @return the mAR
	 */
	public double getMAR() {
		return MAR;
	}
	/**
	 * @param mAR the mAR to set
	 */
	public void setMAR(double mAR) {
		MAR = mAR;
	}
	/**
	 * @return the aPR
	 */
	public double getAPR() {
		return APR;
	}
	/**
	 * @param aPR the aPR to set
	 */
	public void setAPR(double aPR) {
		APR = aPR;
	}
	/**
	 * @return the mAY
	 */
	public double getMAY() {
		return MAY;
	}
	/**
	 * @param mAY the mAY to set
	 */
	public void setMAY(double mAY) {
		MAY = mAY;
	}
	/**
	 * @return the jUN
	 */
	public double getJUN() {
		return JUN;
	}
	/**
	 * @param jUN the jUN to set
	 */
	public void setJUN(double jUN) {
		JUN = jUN;
	}
	/**
	 * @return the jUL
	 */
	public double getJUL() {
		return JUL;
	}
	/**
	 * @param jUL the jUL to set
	 */
	public void setJUL(double jUL) {
		JUL = jUL;
	}
	/**
	 * @return the aUG
	 */
	public double getAUG() {
		return AUG;
	}
	/**
	 * @param aUG the aUG to set
	 */
	public void setAUG(double aUG) {
		AUG = aUG;
	}
	/**
	 * @return the sEP
	 */
	public double getSEP() {
		return SEP;
	}
	/**
	 * @param sEP the sEP to set
	 */
	public void setSEP(double sEP) {
		SEP = sEP;
	}
	/**
	 * @return the oCT
	 */
	public double getOCT() {
		return OCT;
	}
	/**
	 * @param oCT the oCT to set
	 */
	public void setOCT(double oCT) {
		OCT = oCT;
	}
	/**
	 * @return the nOV
	 */
	public double getNOV() {
		return NOV;
	}
	/**
	 * @param nOV the nOV to set
	 */
	public void setNOV(double nOV) {
		NOV = nOV;
	}
	/**
	 * @return the dEC
	 */
	public double getDEC() {
		return DEC;
	}
	/**
	 * @param dEC the dEC to set
	 */
	public void setDEC(double dEC) {
		DEC = dEC;
	}
	/**
	 * @return the update_by
	 */
	public String getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_when
	 */
	public String getUpdate_when() {
		return update_when;
	}
	/**
	 * @param update_when the update_when to set
	 */
	public void setUpdate_when(String update_when) {
		this.update_when = update_when;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	// converts a row object to a printable string
	@Override
	public String toString() {
		return "[id=" + id + ", RA_year=" + RA_year + ", RE=" + RE + ", CRO=" + CRO
				+ ", project_code=" + project_code + ", JAN=" + JAN + ", FEB=" + FEB + ", MAR=" + MAR + ", APR=" + APR
				+ ", MAY=" + MAY + ", JUN=" + JUN + ", JUL=" + JUL + ", AUG=" + AUG + ", SEP=" + SEP + ", OCT=" + OCT
				+ ", NOV=" + NOV + ", DEC=" + DEC + ", update_by=" + update_by + ", update_when=" + update_when
				+ ", notes=" + notes + "]";
	}
	
	// *toJSON function
	
}