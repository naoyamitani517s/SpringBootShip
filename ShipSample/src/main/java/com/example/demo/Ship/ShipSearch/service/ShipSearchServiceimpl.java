package com.example.demo.Ship.ShipSearch.service;

import java.time.LocalDate;
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
		try {
	        // 型変換処理
	        if (form.getGrosstonnageFrom() != null) {
	            form.setGrossTonnageFromByInt(Integer.parseInt(form.getGrosstonnageFrom()));
	        }
	        if (form.getGrosstonnageTo() != null) {
	            form.setGrossTonnageToByInt(Integer.parseInt(form.getGrosstonnageTo()));
	        }
	        if (form.getBuilddateFrom() != null) {
	            form.setBuildDateFromByDate(LocalDate.parse(form.getBuilddateFrom()));
	        }
	        if (form.getBuilddateTo() != null) {
	            form.setBuildDateToByDate(LocalDate.parse(form.getBuilddateTo()));
	        }
	        
		} catch (Exception e) {
	        e.printStackTrace();
	    }

        // 検索処理
        return shipSearchMapper.ShipSearch(form);
	}
	
	
	// 空文字列や null を処理するヘルパーメソッド
	private int parseSafe(String value, int defaultValue) {
		if (value == null || value.trim().isEmpty()) {
		}
		return defaultValue;
	}

}
