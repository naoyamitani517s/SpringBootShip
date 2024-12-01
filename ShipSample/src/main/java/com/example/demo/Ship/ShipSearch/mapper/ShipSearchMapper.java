package com.example.demo.Ship.ShipSearch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Ship.ShipSearch.form.ShipSearchForm;
import com.example.demo.model.SHP_SPM_SC_Ship_Model;

@Mapper
public interface ShipSearchMapper {
	public List<SHP_SPM_SC_Ship_Model> getShipSearch(ShipSearchForm form); 
}
