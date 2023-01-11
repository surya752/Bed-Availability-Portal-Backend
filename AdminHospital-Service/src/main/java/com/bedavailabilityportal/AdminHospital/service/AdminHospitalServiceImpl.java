package com.bedavailabilityportal.AdminHospital.service;


import com.bedavailabilityportal.AdminHospital.entity.Hospital;
import com.bedavailabilityportal.AdminHospital.repository.AdminHospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminHospitalServiceImpl implements AdminHospitalService {

	@Autowired
	private AdminHospitalRepository repository;
	
	@Override
	public String addHospital(Hospital hospital) {
		 repository.save(hospital);
		 return "Hospital inserted";
	}

	@Override
	public String deleteHospital(Long hId) {
		repository.deleteById(hId);
		return "Hospital deleted";
	}

	@Override
	public List<Hospital> getAll() {
		return repository.findAll();

	}

//	@Override
//	public Hospital updateHospital(Long hId, Hospital hospital) {
//		return repository.save(hospital);
//	}
//

//	public Hospital updateHospital(long hId, Hospital hospital) {
//		return repository.save(hospital);
//	}


//	@Override
//	public List<Hospital> updateHospital(String hName, Hospital hospital) {
//		return repository.save();
//	}

//	@Override
//	public String updateHospital(String hName, Hospital hospital) {
//		Hospital h = repository.findById(hName).orElse(null);
//		h.sethAddress(hospital.gethAddress());
//		h.sethCity(hospital.gethCity());
//		h.sethState(hospital.gethState());
//		h.sethType(hospital.gethType());
//		return h;
//	}

	@Override
	public Hospital updateHospital(Long hId, Hospital hospital) {
		Hospital h = repository.findById(hId).orElse(null);
		h.sethName(hospital.gethName());
		h.sethNumber(hospital.gethNumber());
		h.sethAddress(hospital.gethAddress());
		h.sethCity(hospital.gethCity());
		h.sethState(hospital.gethState());
		h.sethType(hospital.gethType());
		return repository.save( hospital);
	}

	@Override
	public Hospital getById(Long hId) {
		Hospital h = repository.findById(hId).orElse(null);
		return h;
	}

	@Override
	public List<Hospital> searchByName(String hName) {
		return repository.findAll().stream().filter(n->(n.gethName().equals(hName))).collect(Collectors.toList());
	}

	@Override
	public List<Hospital> searchByType(String hType) {
		return repository.findAll().stream().filter(n->(n.gethType().equals(hType))).collect(Collectors.toList());
	}
//



}
