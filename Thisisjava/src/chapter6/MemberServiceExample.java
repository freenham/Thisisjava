package chapter6;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("12345");
		}else {
			System.out.println("ID 또는 PASSWORD가 올바르지 않습니다.");
		}
	}

}
