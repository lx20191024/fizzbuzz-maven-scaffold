import java.sql.Driver;

public class Rover {
	

	int x;  // ������
	int y;  // ������
	String direction;  // ����
	String position;  // ����λ����Ϣ
	
	public void land(Area area, int x, int y, String direction){
			this.x = x;
			this.y = y;
			this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPosition() {
		return position = "" + x + y + direction;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
