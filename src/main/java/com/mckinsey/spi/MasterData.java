package com.mckinsey.spi;


import java.util.concurrent.ConcurrentHashMap;

public class MasterData {
    ConcurrentHashMap<String, Processor.MyState> data;

    void write(String ticket, Processor.MyState state) {
        this.data.put(ticket, state);
    }

    boolean isGood(String ticket) {
        return this.data.containsKey(ticket) && this.data.get(ticket).state == Processor.MyState.State.GOOD;
    }

    boolean isBad(String ticket) {
        return this.data.containsKey(ticket) && this.data.get(ticket).state == Processor.MyState.State.GOOD;
    }

    public void callOnceInLife() {
        //
    }
}
