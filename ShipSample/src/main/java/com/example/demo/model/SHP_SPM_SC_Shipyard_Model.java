package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="shp_spm_sc_shipyard")
public class SHP_SPM_SC_Shipyard_Model {
	
	@Column(name="shipyardcode")
	public String shipyardcode;
	
	@Column(name="s_shipyardid")
	public String s_shipyardid;
	
	@Column(name="shipyardnamejp")
	public String shipyardnamejp;
	
	@Column(name="shipyardnameen")
	public String shipyardnameen;
	
	@Column(name="shipyardabbr")
	public String shipyardabbr;
	
	@Column(name="chargenamejp")
	public String chargenamejp;
	
	@Column(name="chargenameen")
	public String chargenameen;
	
	@Column(name="locationnother")
	public String locationnother;
	
	@Column(name="locationcode")
	public String locationcode;
	
	@Column(name="latitude")
	public int latitude;
	
	@Column(name="longitude")
	public int longitude;
	
	@Column(name="ins_date")
	public Date ins_date;
	
	@Column(name="ins_user")
	public String ins_user;
	
	@Column(name="upd_user")
	public String upd_user;
	
	@Column(name="upd_date")
	public Date upd_date;

}
