package kr.ac.cultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.cultural.dao.Koreadao;
import kr.ac.cultural.model.Korea;
@Service
public class KoreaServiceImpl implements KoreaeService {
	@Autowired
	Koreadao dao;
	@Override
	
	public List<Korea> Main() {
		// TODO Auto-generated method stub
		return dao.getMain();
	}

}
