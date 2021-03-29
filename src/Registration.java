public class Registration {
    public int userCount;

    User[] array = new User[1000];

    public void createAccount(User user){
        array[userCount] = user;
        userCount++;
    }
}