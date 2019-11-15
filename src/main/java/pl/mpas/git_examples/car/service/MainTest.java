package pl.mpas.git_examples.car.service;

public class MainTest {
    LambdaConverter my=new LambdaConverter() {
        @Override
        public int convertStringToInt(String string) {
            return 0;
        }
    };

    LambdaConverter my2=one->one.length();
    Interface2Int dodawanie=(w,e)->(w+e);
    Interface2Int mnozenie=(a,b)->(a*b);
}
