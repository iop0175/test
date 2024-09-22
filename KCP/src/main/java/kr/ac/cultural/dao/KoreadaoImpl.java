package kr.ac.cultural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.cultural.model.Korea;

@Repository
public class KoreadaoImpl implements Koreadao {
	@Autowired
	SqlSession sql;

	@Override
	public List<Korea> getMain() {
		// TODO Auto-generated method stub
		return sql.selectList("Korea.Main");
	}

}
