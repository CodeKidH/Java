package designPattern.builderPattern;

public class Pet {
	
	public static class Builder{
		
		private String petName;
		private String ownerName;
		
		public Builder withPetName(final String petName){
			this.petName = petName;
			return this;
		}
		
		public Builder ownerName(final String ownerName){
			this.ownerName = ownerName;
			return this;
		}
		
		public Pet build(){
			if(petName == null || ownerName == null){
				throw new IllegalStateException("Cannot create");
			}
			
			Pet pet = new Pet(petName, ownerName);
			return pet;
		}
		
	}
	
	private final String petName;
	private final String ownerName;
	
	private Pet(final String petName, final String ownerName){
		this.petName = petName;
		this.ownerName = ownerName;
	}
}
