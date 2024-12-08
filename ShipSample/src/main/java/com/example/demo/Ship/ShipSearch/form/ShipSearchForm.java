package com.example.demo.Ship.ShipSearch.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ShipSearchForm {
	private String shipyardcode; 	      // 造船所
	private String shipnumber;            // 船番
	private String customercode;   	      // 取引先
	private String series;  	          // シリーズ
	private String shipnameen;
	private String shipnamejp;     	      // 船名
	private String managementofficecode;  // 船舶管理会社
	private String shipspecies;  	      // 船種
	private String shipnationality;  	  // 船籍
	private String shipclass;  	          // 船級
	private String shiptype;  	          // 船舶タイプ
	private String grosstonnageFrom;      // 重量 From(HTML取得内容)
	private String grosstonnageTo;	      // 重量 To(HTML取得内容)
	private int grossTonnageFromByInt;    // 重量 From mapper.xmlに記載
	private int grossTonnageToByInt;  	  // 重量 To mapper.xmlに記載
	private String imono;  	              // IMONo
	private String builddateFrom;  	      // 建造年月日 From(HTML取得内容)
	private String builddateTo;  	      // 建造年月日 To(HTML取得内容)
	private LocalDate buildDateFromByDate;// 建造年月日 From mapper.xmlに記載
	private LocalDate buildDateToByDate;  // 建造年月日 To mapper.xmlに記載
	private String furunorescompany;
	private String f_shipno;  	          // F-ShipNo
	private int logicalDelete;  	      // 論理削除表示 含
	private int ownerchangekbn;           // オーナー変更 有
	private String registeredowner;
}
