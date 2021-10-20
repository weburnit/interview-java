package com.mckinsey.domain;

import com.mckinsey.spi.DelegateProcessor;
import com.mckinsey.spi.MasterData;
import com.mckinsey.spi.Processor;

public class FrontierBusinessUnit extends DelegateProcessor implements DelegateProcessor.HandleReceiver {

    public FrontierBusinessUnit() {
        this.passReceiver(this);
    }

    @Override
    public void setState(MyState state) {

    }

    @Override
    public MyState getState() {
        return null;
    }

    @Override
    public Processor getNext() {
        return null;
    }

    @Override
    public void setNext(Processor processor) {

    }

    @Override
    public void receive(MasterData dto) {

    }
}
