package ���콺Ŭ����;

public class Mouse_Wheel extends Mouse {
	public void Scroll() {
		System.out.println("��ũ���� ���Ƚ��ϴ�");
	}

	@Override
	public void rightClick() {
		System.out.println("������Ŭ��");
		System.out.println("�巡��");
	}

	// �������̵� -> ��Ӱ��迡�� �ڽ� Ŭ������
	// �θ�Ŭ������ ����� ������ �Ҷ� ���
	@Override
	public void leftClick() {
		System.out.println("����Ŭ��");
		System.out.println("�巡��");
	}

}
