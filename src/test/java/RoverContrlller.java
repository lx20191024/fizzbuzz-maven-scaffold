
public class RoverContrlller {

	int initX;
	int initY;
	String direction;  // ����
	String position;  // ����λ����Ϣ
	
	public RoverContrlller(Rover rover) {
		initX = rover.getX();
		initY = rover.getY();
	}
	
}
