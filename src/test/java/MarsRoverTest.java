import static org.junit.Assert.*;

import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {

	/*
	 * 规则：
	 * 不能降落在区域外
	 * 不能移动到区域外
	 * 
	 * 对象：车（回传位置、着陆、朝向、控制器：批量传输指令）、区域（长、宽）
	 * 动作：着陆、转向（东南西北）、移动（前进、左转、右转）
	 * north\south\east\w
	 */
	
	@Test
	public void should_land_the_rover_on_area() {
		Area area = new Area(10,10);
		Rover rover = new Rover();
		rover.land(area,5,5,"E");
		String position = rover.getPosition();
		assertThat(position).isEqualTo("55E");
	}
	
/*	@Test
	public void should_move_the_north(){
		Rover rover = new Rover();
		RoverContrlller roverContrlller = new RoverContrlller(rover);
		String mission = "10,10,5,5,E,M,L,M,R";
		String position = roverContrlller.excute(mission);
		assertThat(position).isEqualTo("55E");
	}*/

}
