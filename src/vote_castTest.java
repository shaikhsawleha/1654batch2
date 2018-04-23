import static org.junit.Assert.*;

import org.junit.Test;

public class vote_castTest {
	candidate c1,c2;
	vote_cast v1;
	@Test
	public void test() {
		c1 = new candidate ("sawleha", "vasco","100",0);
		c2 = new candidate ("abhilasha","panjim","100",0);
		v1 = new vote_cast("ME");
		v1.addVote(new evmclass(c1));
		v1.addVote(new evmclass(c2));
		System.out.println(v1.vote_result());

		//fail("Not yet implemented");
	}

}