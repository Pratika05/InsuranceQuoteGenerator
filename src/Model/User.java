package Model;

 public abstract class User {

  private String FirstName;
  private String LastName;
  private String Street;
  private String City;
  private String State;
  private String Zip;
  private String BusinessSegment;
  private String AccNumber;

  public String getFirstName() {
   return FirstName;
  }

  public void setFirstName(String firstName) {
   FirstName = firstName;
  }

  public String getLastName() {
   return LastName;
  }

  public void setLastName(String lastName) {
   LastName = lastName;
  }

  public String getStreet() {
   return Street;
  }

  public void setStreet(String street) {
   Street = street;
  }

  public String getCity() {
   return City;
  }

  public void setCity(String city) {
   City = city;
  }

  public String getState() {
   return State;
  }

  public void setState(String state) {
   State = state;
  }

  public String getZip() {
   return Zip;
  }

  public void setZip(String zip) {
   Zip = zip;
  }

  public String getBusinessSegment() {
   return BusinessSegment;
  }

  public void setBusinessSegment(String businessSegment) {
   BusinessSegment = businessSegment;
  }

  public String getAccNumber() {
   return AccNumber;
  }

  public void setAccNumber(String accNumber) {
   AccNumber = accNumber;
  }
 }
