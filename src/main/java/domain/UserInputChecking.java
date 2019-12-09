/*
 * @(#)UserInputChecking.java        2019/12/10
 *
 *
 */

package domain;

/**
 * 사용자가 입력한 값이 유효한 값인지 확인하기 위한 클래스
 *
 * @version		0.1 2019년 12월 10일
 * @author		YerinCho          
 */

public class UserInputChecking {
    
    public boolean checkCarName(String n) {
	String[] tmpname = n.split(",");
	for(int i=0;i<tmpname.length;i++) {
	    
	    /*이름이 5자를 넘어가면 오류*/
	    if(tmpname[i].length()==0 || tmpname[i].length()>5) {
		System.out.println("자동차 이름이 잘못되었습니다.");
		return false;
	    }
	}
	return true;
    }
    
    
    /*횟수가 잘못 입력된 경우 -1을 리턴하고, 아니면 입력된 횟수를 출력*/
    public int checkCount(String n) {
	if(isStringInt(n)==false) {
	    System.out.println("횟수가 잘못 입력되었습니다. 정수만 입력해주세요.");
	    return -1;
	}
	if( Integer.parseInt(n)<=0 ) {
	    System.out.println("횟수가 잘못 입력되었습니다. 양의 정수만 입력해주세요.");
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