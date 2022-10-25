package server;

import java.util.List;

/*Data File과의 통신을 위한(DAO)
 * DB에서 정보만 전달하는 역할을 수행
 * */
public class DataAccessObject {

	public DataAccessObject() {

	}

	/* 회원정보 수집 (List는 Collection의 최상위 ) */
	public List readMembers() {

		return null;
	}

	/* 접속기록(로그정보) 작성 */
	public void writeAccessHistory(String id, String date, String accessType) {

	}

}
