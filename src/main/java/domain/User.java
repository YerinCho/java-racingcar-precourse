package domain;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class User {

    public String inputCar() {
	Scanner sc = new Scanner(System.in);
	String tmpname="";
	System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����,5�� ����)");
	tmpname=sc.nextLine();
	sc.close();
	return tmpname;
    }
    
    public String inputCount() {
	Scanner sc = new Scanner(System.in);
	String count;
	System.out.println("�õ��� Ƚ���� ��ȸ�ΰ���?");
	count=sc.next();
	sc.close();
	return count;
    }
    
}