package ���콺Ŭ����;

public class Mouse_Main {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();

		Mouse_Wheel mouse2 = new Mouse_Wheel();
		mouse2.leftClick(); // ���
		mouse2.rightClick(); // ���
		mouse2.Scroll(); // Ȯ��

		// ��ĳ���� -> ���� Ŭ������ ��ü�� ����Ŭ������ ��ü Ÿ������ �� ��ȯ
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// �������̵��� ����� ���
		// ��ĳ���� �ϴ��� �ڽĿ� �ִ� ����� ���
		mouse3.leftClick();

	}

}
