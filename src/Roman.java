import java.util.HashMap;
import java.util.Map;

public class Roman {

    static String converterRome(int nums) {
        int num1 = nums % 10;
        int num10 = (nums % 100) / 10;
        int num100 = (nums % 1000) / 10;

        return num100(num100) + num10(num10) + num1(num1);
    }

    static int converterArab(String num) {
        int result = 0;
        switch (num) {
            case "I":
                result = 1;
            case "II":
                result = 2;
            case "III":
                result = 3;
            case "IV":
                result = 4;
            case "V":
                result = 5;
            case "VI":
                result = 6;
            case "VII":
                result = 7;
            case "VIII":
                result = 8;
            case "IX":
                result = 9;
                break;
        }
        return result;
    }
    static String num1(int num1) {

        String result = "";

        switch (num1) {
            case 1:
                result = "I";
            case 2:
                result = "II";
            case 3:
                result = "III";
            case 4:
                result = "IV";
            case 5:
                result = "V";
            case 6:
                result = "VI";
            case 7:
                result = "VII";
            case 8:
                result = "VIII";
            case 9:
                result = "IX";
                break;
        }
        return result;
    }


    static String num10(int num10){
        String result = "";

        switch (num10) {
            case 1:
                result = "X";
            case 2:
                result = "XX";
            case 3:
                result = "XXX";
            case 4:
                result = "XL";
            case 5:
                result = "L";
            case 6:
                result = "LX";
            case 7:
                result = "LXX";
            case 8:
                result = "LXXX";
            case 9:
                result = "XC";
                break;
        }
        return result;
    }


    static String num100(int num100){
        String result = "";

        switch (num100) {
            case 1:
                result = "C";
                break;
        }
        return result;
    }

}



// "[IVX]{1,4}"
// 1-10. 10-ки 10*10=