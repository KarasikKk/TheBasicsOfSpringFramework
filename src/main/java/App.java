public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFuLName());
        eventLogger.logEvent(message);
    }
}
