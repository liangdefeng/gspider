package xyz.itbang.gspider.util

/**
 * Created by yan on 2017/5/7 0007.
 */
class Tools {

    /**
     * 设置接受Cookie。
     * 注意：这里只影响 Java 平台的网络 API 及使用其的框架。如 HttpURLConnection，Jsoup。
     */
    static void setAcceptAllCookies(){
        CookieManager cookieManager = new CookieManager()
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)
        cookieManager.setDefault(cookieManager)
    }

    /**
     * 暂停并等待，直到用户输入 yes。
     * 用于需要登录页面等，给用户时间处理。
     * @param message
     */
    static void waitFor(String message){
        println("Waiting for $message")
        Scanner scanner = new Scanner(System.in)
        String result = ''
        while (true){
            println("When thing done,just type yes :")
            result = scanner.next()
            if ("yes" == result) return
            continue
        }
    }

    public static void main(String[] args) {
        waitFor("deng")
    }
}
