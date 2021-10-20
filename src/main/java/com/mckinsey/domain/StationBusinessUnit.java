package com.mckinsey.domain;

import com.mckinsey.spi.MasterData;
import com.mckinsey.spi.Processor;

public class StationBusinessUnit implements Processor {
    @Override
    public void setState(MyState state) {

    }

    @Override
    public MyState getState() {
        return null;
    }

    @Override
    public void processMasterData(MasterData data) {

    }

    @Override
    public void setNext(Processor processor) {

    }

    @Override
    public Processor getNext() {
        return null;
    }
}
