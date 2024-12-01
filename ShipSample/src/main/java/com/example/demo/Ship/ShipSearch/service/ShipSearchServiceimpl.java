package com.example.demo.Ship.ShipSearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Ship.ShipSearch.form.ShipSearchForm;
import com.example.demo.Ship.ShipSearch.mapper.ShipSearchMapper;
import com.example.demo.model.SHP_SPM_SC_Ship_Model;

@Service
public class ShipSearchServiceimpl implements ShipSearchService {
	@Autowired
	private ShipSearchMapper shipSearchMapper;
	
	@Override
	public List<SHP_SPM_SC_Ship_Model> getShipSearch(ShipSearchForm form) {
		return shipSearchMapper.getShipSearch(form);
	}
	

}
