

public class Zahlensysteme {
    public static void main(String[] args) {
        Zahlensysteme zahlensysteme = new Zahlensysteme();
        System.out.println(zahlensysteme.toBinary(270));
        System.out.println(zahlensysteme.toBinary(1000));
        System.out.println(zahlensysteme.toBinary(43981));
        System.out.println(zahlensysteme.toBinary(34952));
        System.out.println(zahlensysteme.toOktal(270));
        System.out.println(zahlensysteme.toOktal(1000));
        System.out.println(zahlensysteme.toOktal(43981));
        System.out.println(zahlensysteme.toOktal(34952));
    }

//only working for positive decimals without a point.
    public String toBinary(int dez) {
        String output="";
        for(int i=16; i>=0; i--){
            if(dez-Math.pow(2, (double) i)>=0){
                output+="1";
                dez= dez-(int) Math.pow(2,(double) i);
            }
            else output+="0";
        }

        return output;
    }
    public String toOktal(int dez)
    {
        String ret="";


        /*while((int)(dez/8)!=0){
            Integer r = dez%8;
            dez=dez/8;
            String rString;
            rString = r.toString();
            rString+=ret;
            ret=rString;
        }*/

        while(dez>0){
            Integer tem = 0;
            tem = dez%8;
            dez= dez/8;
            String temp="";
            temp+=tem.toString();
            ret=temp+=ret;
        }
        return ret;
    }
    public String toHex(int dez){
        return "";
    }
}
