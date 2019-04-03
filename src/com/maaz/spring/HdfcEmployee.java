package com.maaz.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class HdfcEmployee implements Employee{
    private RateOfInterest roi;
	
    @Autowired
	public HdfcEmployee( RateOfInterest roi )
	{
		this.setRoi(roi);
	}
    
    @Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return "HDFC Employee";
	}

	public RateOfInterest getRoi() {
		return roi;
	}

	public void setRoi(RateOfInterest roi) {
		this.roi = roi;
	}

	@Override
	public String getROI() {
		// TODO Auto-generated method stub
		return this.roi.getROI();
	}

}
