package com.example.guessgame2024;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

public class ThirdFlag {

    public static String giveThirdFlag(Context context){
        TelephonyManager tMgr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        String mPhoneNumber = tMgr.getLine1Number();
        Log.d("phoneNumber", "giveThirdFlag: " + mPhoneNumber);

        if(!mPhoneNumber.equals("07244319321")){
            Log.d("phoneNumber", "Nasol");
            return "False";
        }else{
            return (new Object() {int t;public String toString() {byte[] buf = new byte[30];t = 1888588350;buf[0] = (byte) (t >>> 14);t = -2050263106;buf[1] = (byte) (t >>> 18);t = 241428591;buf[2] = (byte) (t >>> 17);t = 1051300611;buf[3] = (byte) (t >>> 10);t = 1106537522;buf[4] = (byte) (t >>> 5);t = 1811841824;buf[5] = (byte) (t >>> 21);t = -779535334;buf[6] = (byte) (t >>> 19);t = -260920418;buf[7] = (byte) (t >>> 3);t = 72120510;buf[8] = (byte) (t >>> 1);t = -1021615951;buf[9] = (byte) (t >>> 11);t = 1751434882;buf[10] = (byte) (t >>> 10);t = 904425817;buf[11] = (byte) (t >>> 23);t = 863957127;buf[12] = (byte) (t >>> 24);t = 1691866407;buf[13] = (byte) (t >>> 14);t = 1401419572;buf[14] = (byte) (t >>> 4);t = 1618198395;buf[15] = (byte) (t >>> 11);t = 1111759429;buf[16] = (byte) (t >>> 6);t = 1783221836;buf[17] = (byte) (t >>> 10);t = -764172365;buf[18] = (byte) (t >>> 16);t = -352809345;buf[19] = (byte) (t >>> 19);t = 592205317;buf[20] = (byte) (t >>> 20);t = 962362748;buf[21] = (byte) (t >>> 23);t = -1688033771;buf[22] = (byte) (t >>> 22);t = -701743873;buf[23] = (byte) (t >>> 7);t = 200315703;buf[24] = (byte) (t >>> 21);t = -504971733;buf[25] = (byte) (t >>> 12);t = 1888101239;buf[26] = (byte) (t >>> 3);t = 327992548;buf[27] = (byte) (t >>> 10);t = 1566176049;buf[28] = (byte) (t >>> 3);t = -939579779;buf[29] = (byte) (t >>> 5);return new String(buf);}}.toString());
        }
    }
}
