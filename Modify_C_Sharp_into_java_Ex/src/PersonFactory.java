public class PersonFactory {

     /**
   * This method creates and returns an IPerson object based on the provided PersonType.
   * 
   * @param type The type of person (RURAL or URBAN) to create.
   * @return An IPerson object representing the requested person type.
  
   */

    public IPerson getPerson(PersonType type) {
      switch (type) {
        case RURAL:
          return new Villager();
        case URBAN:
          return new CityPerson();
        default:
          throw new UnsupportedOperationException("Person type not supported: " + type);
      }
    }
  }