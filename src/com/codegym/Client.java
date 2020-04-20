package com.codegym;

public class Client {

    public static void main(String[] args) {
        String url = "https://data18.chiasenhac.com/downloads/2011/1/2010847-1f89aafb/128/Hong%20Nhan%20-%20Jack.mp3";
        String userAgent = "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:75.0) Gecko/20100101 Firefox/75.0";
        String destination = "/home/alexwoo/IdeaProjects/ProxyPatternExample/alex.mp3";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}
