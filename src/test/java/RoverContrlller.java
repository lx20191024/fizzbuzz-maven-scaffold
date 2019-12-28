
public class RoverContrlller {

	public String excute(String mission) {
//		String mission = "10,10,5,5,E,M,L,M,R";
		String [] commond = mission.split(",");
		Area area = new Area(Integer.valueOf(commond[0]),Integer.valueOf(commond[1]));
		Rover rover = new Rover();
		rover.land(area,Integer.valueOf(commond[2]),Integer.valueOf(commond[3]),commond[4]);
		
		rover.move();
		rover.turnLeft();
		rover.move();
		rover.turnRight();
		
		return rover.getPosition();
	}
	
}
