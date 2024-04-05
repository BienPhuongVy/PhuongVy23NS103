package controller;

import model.TheMuonModel;
import view.TheMuonView;

public class TheMuonController {
	private TheMuonView view;
	 private TheMuonModel model;

	public TheMuonController(TheMuonView tmview, TheMuonModel tmmodel) {
		super();
		this.view = tmview;
		this.model = tmmodel;
	}

	public void themTheMuon(TheMuonModel theMuon) {
		view.themTheMuon(theMuon);
	}

	public void xoaTheMuon(String MaPhieuMuon) {
		view.xoaTheMuon(MaPhieuMuon);
	}
	
	public void hienThiThongTinTheMuon() {
		view.hienThiThongTinTheMuon();
	}
}
