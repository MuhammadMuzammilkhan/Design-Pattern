public class Main {
  public static void main(String[] args) {
    PersonFactory factory = new PersonFactory();
    IPerson villager = factory.getPerson(PersonType.RURAL);
    IPerson cityPerson = factory.getPerson(PersonType.URBAN);

    System.out.println(villager.getName()); // Output: Village Person
    System.out.println(cityPerson.getName()); // Output: City Person
  }
}