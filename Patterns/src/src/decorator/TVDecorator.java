package src.decorator;

import basic.Television;

public abstract class TVDecorator implements Television {

    protected Television tv;

    public TVDecorator(Television tv) {
        this.tv = tv;
    }

    @Override
    public void assemble() {
        tv.assemble();
    }
}
