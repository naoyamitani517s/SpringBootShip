package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="shp_spm_sc_customer")
public class SHP_SPM_SC_CustomerModel {
	
	@Column(name="customercode")
	public String customercode;
	
	@Column(name="customernamejp")
	public String customernamejp;
	
	@Column(name="customernameen")
	public String customernameen;
	
	@Column(name="s_ownerid")
	public String s_ownerid;
	
	@Column(name="nationality")
	public String nationality;
	
	@Column(name="ins_date")
	public Data ins_date;
	
	@Column(name="ins_user")
	public String ins_user;
	
	@Column(name="upd_date")
	public Data upd_date;
	
	@Column(name="upd_user")
	public String upd_user;

}
