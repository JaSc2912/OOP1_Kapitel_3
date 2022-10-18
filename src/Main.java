public class Main//Word To Ascii
{
    public static void main(String[] args) {

        String ascii = "INFORMATIK";
        int i =0;
        while(i<ascii.length()){
            int a = (int) ascii.charAt(i);
            System.out.println("Buchstabe: "+ascii.charAt(i)+"; Ascii Code: "+a);
            i++;
        }


    }
}