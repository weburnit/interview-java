package com.mckinsey.spi;

public abstract class DelegateProcessor implements Processor {
    HandleReceiver receiver;

    public interface HandleReceiver extends com.mckinsey.spi.HandleReceiver {
    }

    protected final void passReceiver(HandleReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void processMasterData(MasterData data) {
        System.out.println("I'm doing nothing here and move next");
        Processor p = this.getNext();
        if (p != null) {
            p.processMasterData(data);
        }
        if (this.receiver != null) {
            this.receiver.receive(data);
        }
    }
}
