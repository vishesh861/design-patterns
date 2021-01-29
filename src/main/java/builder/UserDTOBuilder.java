package builder;


public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname) ;

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(String date);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

}
