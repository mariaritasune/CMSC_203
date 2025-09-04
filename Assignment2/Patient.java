/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: This class has the fields for the patient's
 * first name, middle name, last name, address, city, state, 
 * ZIP code, phone, emergency contact name and emergency phone number.
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Maria Marques
*/
public class Patient {
    
	// no-arg constructor
	public Patient() {
		
	}
	
	// fields
    private String first;
    private String middle;
    private String last;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
    private String emergencyName;
    private String emergencyPhone;
    
    // constructors
    public Patient(String first_Name, String middle_Name, String last_Name) {
    first = first_Name;
    middle = middle_Name;
    last = last_Name;
    }
    
    // Parameter constructor for all attributes
    public Patient(String first_Name, String middle_Name, 
    		String last_Name, String street_Address, 
    		String city_Name, String state_Name, 
    		String zipcode_Number, String phone_Number,
    		String emergencyContactName, String emergencyPhoneNumber) {
        first = first_Name;
        middle = middle_Name;
        last = last_Name;
        address = street_Address;
        city = city_Name;
        state = state_Name;
        zipcode = zipcode_Number;
        phone = phone_Number;
        emergencyName = emergencyContactName;
        emergencyPhone = emergencyPhoneNumber;
        }
    
    // mutators
    public void setFirst(String first_Name) {
    	first = first_Name;
    }
    public void setMiddle(String middle_Name) {
    	middle = middle_Name;
    }
    public void setLast(String last_Name) {
    	last = last_Name;
    }
    public void setAddress(String street_Address) {
    	address = street_Address;
    }
    public void setCity(String city_Name) {
    	city = city_Name;
    }
    public void setState(String state_Name) {
    	state = state_Name;
    }
    public void setZipcode(String zipcode_Number) {
    	zipcode = zipcode_Number;
    }
    public void setPhone(String phone_Number) {
    	phone = phone_Number;
    }
    public void setEmergencyName(String emergencyContactName) {
    	emergencyName = emergencyContactName;
    }
    public void setEmergencyPhone(String emergencyPhoneNumber) {
    	emergencyPhone = emergencyPhoneNumber;
    }
    
    // accessors
    public String getFirst(String first_Name) {
    	return first;
    }
    public String getMiddle(String middle_Name) {
    	return middle;
    }
    public String getLast(String last_Name) {
    	return last;
    }
    public String getAddress(String street_Address) {
    	return address;
    }
    public String getCity(String city_Name) {
    	return city;
    }
    public String getState(String state_Name) {
    	return state;
    }
    public String getZipcode(String zipcode_Number) {
    	return zipcode;
    }
    public String getPhone(String phone_Number) {
    	return phone;
    }
    public String getEmergencyName(String emergencyContactName) {
    	return emergencyName;
    }
    public String getEmergencyNumber(String emergencyPhoneNumber) {
    	return emergencyPhone;
    }
    
    // methods
    public String buildFullName() {
        return first + " " + middle + " " + last;
    }

    public String buildAddress() {
        return address + ", " + city + ", " + state + " " + zipcode;
    }

    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }
    
    // toString method
    public String toString() {
        return "Patient Information:\n" +
                "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }

}
