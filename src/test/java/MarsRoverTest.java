import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {

	/*
	 * ����
	 * ���ܽ�����������
	 * �����ƶ���������
	 * 
	 * ���󣺳����ش�λ�á���½�����򡢿���������������ָ������򣨳�����
	 * ��������½��ת�򣨶������������ƶ���ǰ������ת����ת��
	 */
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void should_throw_land_out_of_area(){
		expectedException.expect(IllegalArgumentException.class);
		Area area = new Area(10,10);
		Rover rover = new Rover();
		rover.land(area,11,5,"E");
	}
	
	@Test
	public void should_throw_move_out_of_area(){
		expectedException.expect(IllegalArgumentException.class);
		Area area = new Area(10,10);
		Rover rover = new Rover();
		rover.land(area,10,5,"E");
		rover.move();
	}
	
	@Test
	public void should_land_the_rover_on_area() {
		Area area = new Area(10,10);
		Rover rover = new Rover();
		rover.land(area,5,5,"E");
		String position = rover.getPosition();
		assertThat(position).isEqualTo("55E");
	}
	
	@Test
	public void should_move(){
		Area area = new Area(10,10);
		Rover rover = new Rover();
		rover.land(area,5,5,"E");
		rover.move();
		String position = rover.getPosition();
		assertThat(position).isEqualTo("65E");
		
		rover.turnLeft();
		position = rover.getPosition();
		assertThat(position).isEqualTo("65N");
		
		rover.turnRight();
		position = rover.getPosition();
		assertThat(position).isEqualTo("65E");
		
	}

	@Test
	public void should_mission(){
		RoverContrlller roverContrlller = new RoverContrlller();
		String mission = "10,10,5,5,E,M,L,M,R";
		String position = roverContrlller.excute(mission);
		assertThat(position).isEqualTo("66E");
	}

}
