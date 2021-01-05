public class RemoteControl {
    private static RemoteControl universalRemote = null;
    String message;

    private RemoteControl() {
        message = "I am a universal remote control using Singleton design principle";
    }

    public static RemoteControl getInstance(){
        if (universalRemote == null) {
            universalRemote = new RemoteControl();
            return universalRemote;
        }
    }
}
