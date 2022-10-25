package server;

import server.beans.MemberBean;

/*로그인, 로그아웃,접속로그기록을 담당하는*/
public class Auth {
	
	public Auth() {
		
	}
	
	
	/* Job : 로그인
	 * 
	 * 1.parameter를 통해 받는 정보 : id, password
	 * 2.id가 DB에 존재하는지 여부 Check
	 *  ----> DAO가 MEMBERS의 전체 레코드를 전달 --> 비교(accessCtl에서 실행)
	 * 	  2-1. true --> 3번으로 이동
	 *    2-2. false --> client
	 * 3. id와 password를 DB와 비교
	 *    3-1. true --> 4번으로 이동
	 *    3-2. false --> client
	 * 4. 접속기록(로그기록) 생성하기(AccessHistory)
	 * 5. client에게 로그인 결과 전달
	 * * */
	/* 정보를 DB와 비교*/
	void accessCtl(String clientData) {
		/* serviceCode=1&id=hoonzzang&password=1234 --> 
		 * split("&") --> {"serviceCode=1", "id=hoonzzang", "password=1234"}
		 * [1].split("=") --> {"id", "hoonzzang"}[1] --> MemberBean.setAccessCode
		 * [2].split("=") --> {"password", "1234"}[1] --> MemberBean.setSecretCode
		 * */
		
		
		/* setMemberBean의 member의 life-cycle이 끝나기 전에 
		 * accessCtl로 참조선을 변경시켜 계속 사용하도록 한다.
		 * */
		MemberBean member = this.setMemberBean(clientData);
		System.out.println(member.getAccessCode());
		System.out.println(member.getSecretCode());
	
	}
	
	/* MemberBean에 접근하기 위해 member라는 참조변수를 이용하여
	 * Userapp에서 받은 clientData를 AccessCode와 SecretCode로
	 * split하여 참조변수 member로 저장
	 *  */
	private MemberBean setMemberBean(String clientData) {
		MemberBean member = new MemberBean();
		
		/* splitData라는 배열을 선언하여 하나로 저장해 준다 */
		String[] splitData = clientData.split("&");
		member.setAccessCode(splitData[1].split("=")[1]);
		member.setSecretCode(splitData[2].split("=")[1]);
		
		return member;
	}
	
	
	
	/* 아이디의 존재여부 판단(객체지향)*/
	private boolean compareAccessCode() {
		return false;
	}
	
	/* 아이디와 비밀번호 비교 */
	private boolean isAuth() {
		return false;
	}
	
}
