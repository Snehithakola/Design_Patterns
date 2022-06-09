package src.decorator;

import basic.Television;

public class SmartTV extends TVDecorator{
    public SmartTV(Television tv) {
        super(tv);
    }

    @Override
    public void assemble() {

        addSmartTVFeature();
        tv.assemble();
    }

    public void addSmartTVFeature(){
        System.out.println("Added smart tv feature.");
    }
}
