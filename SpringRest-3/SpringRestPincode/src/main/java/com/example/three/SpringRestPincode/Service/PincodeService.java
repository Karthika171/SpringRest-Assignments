package com.example.three.SpringRestPincode.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.three.SpringRestPincode.Entity.Pincode;
@Service
public class PincodeService implements PinService {
	
	List<Pincode> pin;

	public PincodeService() {
		pin = new ArrayList<>();
		pin.add(new Pincode(636002,"TN","Chennai","India"));
		pin.add(new Pincode(634778,"KL","Alappey","India"));
		pin.add(new Pincode(623321,"MP","Lucknow","India"));
		pin.add(new Pincode(642787,"UK","Haridwar","India"));
		pin.add(new Pincode(646835,"Mh","MUmbai","India"));
		pin.add(new Pincode(634557,"AP","Hyderabad","India"));
		pin.add(new Pincode(465474,"KN","Bangalore","India"));
		pin.add(new Pincode(643564,"MH","Pune","India"));
		pin.add(new Pincode(353463,"RJ","Jaipur","India"));
		pin.add(new Pincode(253466,"MP","Bhopal","India"));
		pin.add(new Pincode(253463,"TN","Cbe","India"));		
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
