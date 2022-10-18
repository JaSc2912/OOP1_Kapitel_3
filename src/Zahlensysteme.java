

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
        System.out.println(zahlensysteme.toHex(270));
        System.out.println(zahlensysteme.toHex(1000));
        System.out.println(zahlensysteme.toHex(43981));
        System.out.println(zahlensysteme.toHex(34952));
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


        /*while((int)(dez/8)!=0){
            Integer r = dez%8;
            dez=dez/8;
            String rString;
            rString = r.toString();
            rString+=ret;
            ret=rString;
        }*/

        String ret="";
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
        String ret="";
        while(dez>0){
            Integer tem = 0;
            tem = dez%16;
            dez= dez/16;
            String temp="";
            switch (tem){
                case 10: temp+="A"; break;
                case 11: temp+="B"; break;
                case 12: temp+="C"; break;
                case 13: temp+="D"; break;
                case 14: temp+="E"; break;
                case 15: temp+="F"; break;
                default: temp+=tem.toString(); break;
            }
            ret=temp+=ret;
        }
        return ret;
    }
}
