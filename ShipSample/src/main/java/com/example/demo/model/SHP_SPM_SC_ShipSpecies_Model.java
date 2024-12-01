package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="shp_spm_sc_shipspecies")
public class SHP_SPM_SC_ShipSpecies_Model {
	
	@Column(name="shipspecies")
	public String shipspecies;
	
	@Column(name="shipspeciesnamejp")
	public String shipspeciesnamejp;
	
	@Column(name="shipspeciesnameen")
	public String shipspeciesnameen;
	
	@Column(name="ins_date")
	public Date ins_date;
	
}
