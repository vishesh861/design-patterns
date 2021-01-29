package builder;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;


    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    public UserDTOBuilder withBirthday(String date) {
        age = date;
        return this;
    }

    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNo() + ", "  + address.getStreet()+ " " + address.getCity();
        return this;
    }

    public UserDTO build() {
        dto = new UserWebDTO(firstName+ " "+lastName, address, age);
        return dto;
    }
}
