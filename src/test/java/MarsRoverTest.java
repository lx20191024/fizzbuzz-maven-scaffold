import static org.junit.Assert.*;

import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {

	/*
	 * ����
	 * ���ܽ�����������
	 * �����ƶ���������
	 * 
	 * ���󣺳����ش�λ�á���½�����򡢿���������������ָ������򣨳�����
	 * ��������½��ת�򣨶������������ƶ���ǰ������ת����ת��
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
