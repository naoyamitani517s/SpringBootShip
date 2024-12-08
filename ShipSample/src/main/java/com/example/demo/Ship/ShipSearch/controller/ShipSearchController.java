package com.example.demo.Ship.ShipSearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Ship.ShipSearch.form.ShipSearchForm;
import com.example.demo.Ship.ShipSearch.mapper.ShipSearchMapper;
import com.example.demo.Ship.ShipSearch.service.ShipSearchService;
import com.example.demo.model.SHP_SPM_SC_Ship_Model;


@RestController
@CrossOrigin(origins = "http://192.168.11.9:3000")
@RequestMapping("/Ship")
public class ShipSearchController {
	
	@Autowired
	private ShipSearchService shipSearchService;
	
    @Autowired
    private ShipSearchMapper shipSearchMapper;
    

    @PostMapping("/search")
    public List<SHP_SPM_SC_Ship_Model> searchShips(@RequestBody ShipSearchForm form) {
        return shipSearchService.getShipSearch(form);
    }
	
//	@PostMapping("/ShipSearch")
//	public List<Map<String, Object>> getserch(@RequestBody Map<String, String> formData) {
//		String Shipyardcode = formData.get("shipyardcode");
//		String Shipnumber = formData.get("shipnumver");
//		String Customercode = formData.get("customercode");
//		String Series = formData.get("series");
//		String Shipnameen = formData.get("shipnameen");
//		String Furunorescompany = formData.get("furunorescompany");
//		String Shipnationality = formData.get("shipnationality");
//		String Shipclass = formData.get("shipclass");
//		String Shiptype = formData.get("shiptype");
//		String Grosstonnage = formData.get("grosstonnage");
//		String Imono = formData.get("imono");
//		String Builddate = formData.get("builddate");
//		String F_shipno = formData.get("f_shipno");
//		String Registerdower = formData.get("registerdower");
//		
//		List<Map<String, Object>> results = new ArrayList<>();
//		Map<String, Object> result = new HashMap<>();
//		
//		result.put("shipyardcode", Shipyardcode);
//		result.put("shipnumver", Shipnumber);
//		result.put("customercode", Customercode);
//		result.put("series", Series);
//		result.put("shipnameen", Shipnameen);
//		result.put("furunorescompany", Furunorescompany);
//		result.put("shipnationality", Shipnationality);
//		result.put("shipclass", Shipclass);
//		result.put("shiptype", Shiptype);
//		result.put("grosstonnage", Grosstonnage);
//		result.put("imono", Imono);
//		result.put("builddate", Builddate);
//		result.put("f_shipno", F_shipno);
//		result.put("registerdower", Registerdower);
//		
//		results.add(result);
//		
//		return results;
//	}

}
