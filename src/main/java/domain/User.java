package domain;

import java.util.ArrayList;
import java.util.Scanner;


public class User {
    private int count = 0;
    
    public String inputCar() {
	Scanner sc = new Scanner(System.in);
	String tmpname="";
	System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����,5�� ����)");
	tmpname=sc.nextLine();
	return tmpname;
    }
    
}