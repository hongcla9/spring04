package mvc1;

import java.util.ArrayList;
import java.util.List;

public class DepartExpert {
	public List<String> getAdvice(String depart) {
		List<String> advice = new ArrayList<>();
		
		switch(depart) {
		case "kor" : 
			advice.add("국문학을 공부해야하는 학과입니다.");
			advice.add("국어를 매우 잘해야합니다.");
			break;
		case "eng" : 
			advice.add("영문학을 공부해야하는 학과입니다.");
			advice.add("영어를 매우 잘해야합니다.");
			break;
		case "com" :
			advice.add("컴퓨터학을 공부해야하는 학과입니다.");
			advice.add("컴퓨터를 매우 잘해야합니다.");
			break;
		case "game" :
			advice.add("게임학을 공부해야하는 학과입니다.");
			advice.add("게임를 매우 잘해야합니다.");
			break;
		default:
			advice.add("선택하신 과목은 아직 준비가 되지 않았습니다");
		}
		return advice;
	}
}
