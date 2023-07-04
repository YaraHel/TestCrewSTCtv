package Core;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.EventHandler;


public class EventHandlerPlugin implements ConcurrentEventListener {


    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunFinished.class,runFinishedHandler);
    }

    private EventHandler<TestRunFinished> runFinishedHandler = new EventHandler<TestRunFinished>(){
    @Override
        public void receive(TestRunFinished event) {
            Hooks.getDriver().quit();
        }
    };
}