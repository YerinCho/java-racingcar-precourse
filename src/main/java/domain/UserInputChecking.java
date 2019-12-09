package domain;

public class UserInputChecking {
    
    public boolean checkCarName(String n) {
	String[] tmpname = n.split(",");
	for(int i=0;i<tmpname.length;i++) {
	    if(tmpname[i].length()==0 || tmpname[i].length()>5) {
		System.out.println("�ڵ��� �̸��� �߸��Ǿ����ϴ�.");
		return false;
	    }
	}
	return true;
    }
    
    public int checkCount(String n) {
	if(isStringInt(n)==false) {
	    System.out.println("Ƚ���� �߸� �ԷµǾ����ϴ�. ������ �Է����ּ���.");
	    return -1;
	}
	if( Integer.parseInt(n)<=0 ) {
	    System.out.println("Ƚ���� �߸� �ԷµǾ����ϴ�. ���� ������ �Է����ּ���.");
	    return -1;
	}
	return Integer.parseInt(n);
    }
    
    public boolean isStringInt(String n) {
	 try {
	        Integer.parseInt(n);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
    }
}