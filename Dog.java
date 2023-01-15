
public class Dog implements Animal{
	
	
	String genus;

	@Override
	public String getMyGenus() {
		return genus;
	}

	@Override
	public void setMydGenus(String genus) {
        this.genus=genus;	
	}

	@Override
	public void getDefaultName() {
		System.out.println("My default name is  Dog ");
		
	}

}
