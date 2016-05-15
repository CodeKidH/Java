package designPattern.builderPattern;

import org.junit.Test;

public class BuilderTest {
	
	@Test
	public void legalBuild(){
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder.withPetName("Cloud")
							   .ownerName("hee")
							   .build();
		
	}
}
