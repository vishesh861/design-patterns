package creational.builder;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(userDTOBuilder, user);
        System.out.println(userDTO);

    }

    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {
           return userDTOBuilder.withFirstName(user.getfName()).withLastName(user.getlName()).withBirthday(user.getAge())
                    .withAddress(user.getAddress()).build();
    }

    public static User createUser() {
        User user = new User();
        user.setfName("Vishesh");
        user.setlName("Agarwal");
        user.setAge("27");
        Address address = new Address();
        address.setHouseNo("20/a");
        address.setStreet("Ram Nagar");
        address.setCity("Ajmer");
        user.setAddress(address);
        return user;
    }
}
