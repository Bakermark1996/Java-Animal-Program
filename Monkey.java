
public class Monkey extends RescueAnimal {
	
	
	
	public Monkey(String name, String breed, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setSpecies(breed);
		setGender(gender);
		setAge(age);
		setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

		    }
	
	
}
