package io.gjf;


/**
 * Create by GuoJF on 2019/6/10
 */
public class App {
    public static void main(String[] args) {


        try {
            String ipaddres = null;

            if (ipaddres == null) {
                ipaddres = NetWorkUtil.getIP();
                SendMailUtil.send(ipaddres);

            }


            while (true) {

                Thread.sleep(60000);
                if (!ipaddres.equals(NetWorkUtil.getIP())) {
                    System.out.println("IP已经改变，当前IP为：" + ipaddres);
                    ipaddres = NetWorkUtil.getIP();
                    SendMailUtil.send(ipaddres);
                }

                System.out.println("IP没有改变，当前IP为：" + ipaddres);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


