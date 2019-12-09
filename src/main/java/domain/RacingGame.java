package domain;

import java.util.ArrayList;

public class RacingGame {
    User user = new User();
    UserInputChecking userinputcheck= new UserInputChecking();
    
    Computer computer = new Computer();
    Message message = new Message();
    
    private Car[] car;
    private int count;
    
    public void run() {
	enterCarInfo();
	for(int i=0;i<this.count;i++) {
	    createAndSetPosition();
	    showResult();
	    sleep();
	}
	showWinner();
    }
    
    public void enterCarInfo() {
	String carname=user.inputCar();
	while(userinputcheck.checkCarName(carname)==false) {
	    carname=user.inputCar();
	}
	String[] tmpname = carname.split(",");
	car=new Car[tmpname.length];
	for(int i=0;i<tmpname.length;i++) {
	    this.car[i]=new Car(tmpname[i]);
	}
	
	int tmpcount=userinputcheck.checkCount(user.inputCount());
	while(tmpcount==-1) {
	    tmpcount=userinputcheck.checkCount(user.inputCount());
	}
	
	this.count=tmpcount;
    }
    
    public void createAndSetPosition() {
	for(int i=0;i<car.length;i++) {
	    car[i].isGoStop(computer.createRandNum());
	}
    }
    
    public void showResult() {
	System.out.println("���� ���");
	for(int i=0;i<car.length;i++) {
	    message.playResult(car[i].getName(), car[i].getPosition());
	}
	System.out.println();
    }
    
    
    /*�� ���� Ƚ�� ���� �� ���尨�� ���� ������*/
    public void sleep() {
	try {
	    Thread.sleep(1000); 		//1�� ���
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
    
    public void showWinner() {
	boolean found=false;
	int i;
	for(i=this.count;i>=0;i--) {
	    found=findPosition(i);
	    if(found) {
		break;
	    }
	}
    }
    
    public boolean findPosition(int c){
	boolean f=false;
	ArrayList<String> winner=new ArrayList<>();
	for(int i=0;i<car.length;i++) {
	    if(c==car[i].getPosition()) {
		f=true;
		winner.add(car[i].getName());
	    }
	}
	if(f) {
	    message.judgeWinner(winner);
	}
	return f;
    }
    
}


