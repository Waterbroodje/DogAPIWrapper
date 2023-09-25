public class DogAPIWrapperTest {

    public DogAPIWrapper dogAPIWrapper = new DogAPIWrapper("YOUR_KEY");

    public void sendDog() {
        String url = dogAPIWrapper.getDog();
        Channel.sendDog(url);
    }
}