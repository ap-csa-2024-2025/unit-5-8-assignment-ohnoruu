public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
  public Dog(String name){
    this.name = name;
    numDog++;
    this.ID = numDogs*numDogs;
  }
  // Default Dog constructor

  // Setters - instance variables only
  public void setName(String name){
    this.name = name;
  }

  public void setID(int ID){
    this.ID = ID;
  }

  // Getters - instance variables only
  public String getName(){
    return name;
  }

  public int getID(){
    return ID;
  }

  // method getNumDogs
}
