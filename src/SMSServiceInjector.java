public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new ConsumerServiceImplementation(new SMSServiceImplementation());
    }

}
