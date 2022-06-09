package src.decorator;

import basic.Television;

public class RecordingTV extends TVDecorator{

    public RecordingTV(Television tv) {
        super(tv);
    }

    @Override
    public void assemble() {

        addRecordingFeature();
        tv.assemble();
    }

    public void addRecordingFeature(){
        System.out.println("Added recording feature.");
    }
}
