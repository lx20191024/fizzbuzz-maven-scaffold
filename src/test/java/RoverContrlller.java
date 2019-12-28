
public class RoverContrlller {

	int initX;
	int initY;
	String direction;  // 方向
	String position;  // 返回位置信息
	
	public RoverContrlller(Rover rover) {
		initX = rover.getX();
		initY = rover.getY();
	}
	
}
