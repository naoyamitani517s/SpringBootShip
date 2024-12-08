package com.example.demo.Ship.ShipSearch.service;

import java.util.List;

import com.example.demo.Ship.ShipSearch.form.ShipSearchForm;
import com.example.demo.model.SHP_SPM_SC_Ship_Model;

public interface ShipSearchService {
	public List<SHP_SPM_SC_Ship_Model> getShipSearch(ShipSearchForm form);
}
