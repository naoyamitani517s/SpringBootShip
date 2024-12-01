package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="shp_spm_sc_ship")
public class SHP_SPM_SC_Ship_Model {
	@Column(name="f_shipno")
	public String f_shipno;
	
	@Column(name="imono")
	public String imono;
	
	@Column(name="shiptype")
	public String shiptype;
	
	@Column(name="customercode")
	public String customercode;
	
	@Column(name="customercode2")
	public String customercode2;
	
	@Column(name="managementofficecode")
	public String managementofficecode;
	
	@Column(name="managementofficecode2")
	public String managementofficecode2;
	
	@Column(name="contactcode")
	public String contactcode;
	
	@Column(name="groupcode")
	public String groupcode;
	
	@Column(name="shipyardcode")
	public String shipyardcode;
	
	@Column(name="shipnumber")
	public String shipnumber;
	
	@Column(name="series")
	public String series;
	
	@Column(name="shipnamejp")
	public String shipnamejp;
	
	@Column(name="shipnameen")
	public String shipnameen;
	
	@Column(name="shipspecies")
	public String shipspecies;
	
	@Column(name="shipclass")
	public String shipclass;
	
	@Column(name="shipclassf")
	public String shipclassf;
	
	@Column(name="shipclassm")
	public String shipclassm;
	
	@Column(name="shipnationality")
	public String shipnationality;
	
	@Column(name="grosstonnage")
	public int grosstonnage;
	
	@Column(name="builddate")
	public LocalDate builddate;
	
	@Column(name="projectno")
	public int projectno;
	
	@Column(name="status")
	public String status;
	
	@Column(name="remarks")
	public String remarks;
	
	@Column(name="smskeyno")
	public String smskeyno;
	
	@Column(name="registrationno")
	public String registrationno;
	
	@Column(name="fishingregistrationno")
	public String fishingregistrationno;
	
	@Column(name="licenseno")
	public String licenseno;
	
	@Column(name="furunorescompany")
	public String furunorescompany;
	
	@Column(name="furunorescompany2")
	public String furunorescompany2;
	
	@Column(name="doccompany")
	public String doccompany;
	
	@Column(name="groupbeneficialowner")
	public String groupbeneficialower;
	
	@Column(name="operator")
	public String operator;
	
	@Column(name="registeredowner")
	public String registeredowner;
	
	@Column(name="shipmanager")
	public String shipmanager;
	
	@Column(name="technicalmanager")
	public String technicalmanager;
	
	@Column(name="shipnameen2")
	public String shipnameen2;
	
	@Column(name="shipstatus")
	public String shipstatus;
	
	@Column(name="ownercustomerkbn")
	public String ownercustomerkbn;
	
	@Column(name="ownermanagementkbn")
	public String ownermanagementkbn;
	
	@Column(name="ownercustomerfrescomp")
	public String ownercustomerfrescomp;
	
	@Column(name="ownerchangekbn")
	public String ownerchangekbn;
	
	@Column(name="doccompany_bk")
	public String doccompany_bk;
	
	@Column(name="groupbeneficialower_bk")
	public String groupbeneficialower_bk;
	
	@Column(name="operator_bk")
	public String operator_bk;
	
	@Column(name="registeredowner_bk")
	public String registerdowner_bk;
	
	@Column(name="shipmanager_bk")
	public String shipmanager_bk;
	
	@Column(name="technicalmanager_bk")
	public String technicalmanager_bk;
	
	@Column(name="shipyardnameen")
	public String shipyardnameen;
	
	@Column(name="recordid")
	public int recordid;
	
	@Column(name="recordtimestamp")
	public LocalDate recordtimestamp;
	
	@Column(name="shipfishingdatakbn")
	public String shipfishingdatakbn;
	
	@Column(name="exportcontrolgroup")
	public String exportcontrolgroup;
	
	@Column(name="torishinno")
	public String torishinno;
	
	@Column(name="shipspecies_seaweb")
	public String shipspecies_seaweb;
	
	@Column(name="ownercustomer_manual")
	public String ownercustomer_manual;
	
	@Column(name="ownermanagement_manual")
	public String ownermanagement_manual;
	
	@Column(name="ownercustomer_manual_bk")
	public String ownercustomer_manual_bk;
	
	@Column(name="ownermanagement_manual_bk")
	public String owermanagement_manual_bk;
	
	@Column(name="ownermanagement_lastupd_date")
	public LocalDate ownermanagement_lastupd_date;
	
	@Column(name="ownermanagementlastupd_user")
	public String ownermanagementlastupd_user;
	
	@Column(name="ownercustomer_lastupd_date")
	public LocalDate ownercustomer_lastupd_date;
	
	@Column(name="ownercustomer_lastupd_user")
	public String ownercustomer_lastupd_user;
	
	@Column(name="teu")
	public String teu;
	
	@Column(name="mainpowersupply")
	public String mainpowersupply;
	
	@Column(name="upd_user")
	public String upd_user;
	
	@Column(name="ins_user")
	public String ins_user;
	
	@Column(name="upd_date")
	public LocalDate upd_date;
	
	@Column(name="ins_date")
	public LocalDate ins_date;
	

}
