package Java4Labs;

public class Pair<A,B>{
    A value1;
    B value2;

    public Pair() {
    }

    public A getValue1() {
        return value1;
    }

    public void setValue1(A value1) {
        this.value1 = value1;
    }

    public B getValue2() {
        return value2;
    }

    public void setValue2(B value2) {
        this.value2 = value2;
    }

    public String getPair(){
       return  "(" +  this.value1 + "," + this.value2 + ")";
    }


}
