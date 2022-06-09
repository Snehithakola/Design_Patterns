package client;

import basic.BasicTV;
import basic.Television;
import decorator.RecordingTV;
import decorator.ScreenCastTV;
import decorator.SmartTV;

public class Client {
    public static void main(String[] args) {

        Television tvModel1=new BasicTV();
        System.out.println("TV Model1: ");
        tvModel1.assemble();

        System.out.println();

        Television tvModel2=new RecordingTV(new BasicTV());
        System.out.println("TV Model2: ");
        tvModel2.assemble();

        System.out.println();

        Television tvModel3=new ScreenCastTV(new BasicTV());
        System.out.println("TV Model3: ");
        tvModel3.assemble();

        System.out.println();

        Television tvModel4=new SmartTV(new ScreenCastTV(new RecordingTV(new BasicTV())));
        System.out.println("TV Model4: ");
        tvModel4.assemble();

    }
}
