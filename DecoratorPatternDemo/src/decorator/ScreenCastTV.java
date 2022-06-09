package decorator;

import basic.Television;

public class ScreenCastTV extends TVDecorator{

    public ScreenCastTV(Television tv) {
        super(tv);
    }

    @Override
    public void assemble() {

        addScreenCastFeature();
        tv.assemble();
    }

    public void addScreenCastFeature(){
        System.out.println("Added screen cast feature.");
    }
}
