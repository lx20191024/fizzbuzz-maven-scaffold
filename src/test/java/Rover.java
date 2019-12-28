
public class Rover {
	
	Area area;
	int x;  // 横坐标
	int y;  // 纵坐标
	String direction;  // 方向
	String position;  // 返回位置信息
	
	public void land(Area area, int x, int y, String direction){
		if (!isLandOnArea(area,x,y)) {
			throw new IllegalArgumentException("position is out of area!");
		}else {
			this.x = x;
			this.y = y;
			this.direction = direction;
			this.area = area;
		}
	}

	private boolean isLandOnArea(Area area, int x2, int y2) {
		if (x2 >= area.width || y2 >= area.height) {
			return false;
		}else {
			return true;
		}
	}
	

	private boolean isMoveOnArea() {
		if (x+1> area.width || y+1 > area.height) {
			return false;
		}else {
			return true;
		}
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

	public void move() {
		
		if (!isMoveOnArea()) {
			throw new IllegalArgumentException("move is out of area!");
		}
		if (direction.equals("E")) {
			x += 1;
		}else if (direction.equals("S")) {
			y -= 1;
		}else if (direction.equals("W")) {
			x -= 1;
		}else if (direction.equals("N")) {
			y += 1;
		}
		
	}

	public void turnLeft() {
		
		if (direction.equals("E")) {
			direction = "N";
		}else if (direction.equals("S")) {
			direction = "E";
		}else if (direction.equals("W")) {
			direction = "S";
		}else if (direction.equals("N")) {
			direction = "W";
		}
	}

	public void turnRight() {
		
		if (direction.equals("E")) {
			direction = "S";
		}else if (direction.equals("S")) {
			direction = "W";
		}else if (direction.equals("W")) {
			direction = "N";
		}else if (direction.equals("N")) {
			direction = "E";
		}
	}
}
