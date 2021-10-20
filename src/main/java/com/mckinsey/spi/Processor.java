package com.mckinsey.spi;

public interface Processor {
    class MyState {
        String category;
        State state;

        enum State {
            GOOD,
            BAD
        }
    }

    void setState(MyState state);

    MyState getState();

    void processMasterData(MasterData data);

    Processor getNext();

    void setNext(Processor processor);
}
