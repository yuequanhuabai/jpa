package com.h.ti.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetUtils {

    public static boolean isLoclePortUsing(int port){
        boolean flag=true;
flag= isPortUsing("127.0.0.1",port);
        return flag;
    }

    public static boolean isPortUsing(String host ,int port)  {

        boolean flag= false;

        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
 return  flag;

    }
}
