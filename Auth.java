package server;

/* 로그인, 로그아웃, 접속로그기록 */
public class Auth {
	
	public Auth() {
		
	}
	
	/* Job : 로그인 
	 *  1. param : id, password
	 *  2. id가 DB에 존재여부 check
	 *      --> DAO가 MEMBERS 전체 레코드를 전달 --> 비교
	 *  	2-1. true --> p3
	 *  	2-2. false --> client
	 *  3. id와 password를 DB와 비교
	 *  	3-1. true --> p4
	 *  	3-2. false --> client
	 *  4. 접속기록(로그기록) 생성
	 *  5. client 결과 통보
	 * */
	private void accessCtl(String id, String password) {
		
	}
	
	/* AccessCode 존재여부 판단 */
	private boolean compareAccessCode() {
		return false;
	}
	/* AccessCode와 SecretCode의 비교 */
	private boolean isAuth() {
		return false;
	}
}
