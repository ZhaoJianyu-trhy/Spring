package com.zjy.demo01;

public class Proxy implements Rent {

    private Host host;

    public void rents() {
        seeHouse();
        host.rents();
        sign();
        pay();
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void seeHouse() {
        System.out.println("中介帮你看房");
    }

    public void pay() {
        System.out.println("收中介费");
    }

    public void sign() {
        System.out.println("签合同");
    }
}
