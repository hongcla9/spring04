package mvc1;

import java.util.ArrayList;
import java.util.List;

public class DepartExpert {
	public List<String> getAdvice(String depart) {
		List<String> advice = new ArrayList<>();
		
		switch(depart) {
		case "kor" : 
			advice.add("�������� �����ؾ��ϴ� �а��Դϴ�.");
			advice.add("��� �ſ� ���ؾ��մϴ�.");
			break;
		case "eng" : 
			advice.add("�������� �����ؾ��ϴ� �а��Դϴ�.");
			advice.add("��� �ſ� ���ؾ��մϴ�.");
			break;
		case "com" :
			advice.add("��ǻ������ �����ؾ��ϴ� �а��Դϴ�.");
			advice.add("��ǻ�͸� �ſ� ���ؾ��մϴ�.");
			break;
		case "game" :
			advice.add("�������� �����ؾ��ϴ� �а��Դϴ�.");
			advice.add("���Ӹ� �ſ� ���ؾ��մϴ�.");
			break;
		default:
			advice.add("�����Ͻ� ������ ���� �غ� ���� �ʾҽ��ϴ�");
		}
		return advice;
	}
}
