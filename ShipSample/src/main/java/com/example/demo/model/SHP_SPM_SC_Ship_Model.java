package com.example.demo.model;

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

}
