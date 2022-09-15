package com.stock.Stock;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Prducts {
    private int value_danon_client,
            value_farin_client,
            value_The_client,
            sock_danon_client,
            sock_farin_client,
            sock_The_client
            ;
    public Prducts(int value_danon_client, int value_farin_client, int value_The_client,
                   int sock_danon_client, int sock_farin_client, int sock_The_client
                   ) {
        this.value_danon_client = value_danon_client;
        this.value_farin_client = value_farin_client;
        this.value_The_client = value_The_client;
        this.sock_danon_client = sock_danon_client;
        this.sock_farin_client = sock_farin_client;
        this.sock_The_client = sock_The_client;

    }

    public int getValue_danon_client() {
        return value_danon_client;
    }

    public void setValue_danon_client(int value_danon_client) {
        this.value_danon_client = value_danon_client;
    }


    public int getValue_farin_client() {
        return value_farin_client;
    }

    public void setValue_farin_client(int value_farin_client) {
        this.value_farin_client = value_farin_client;
    }

    public int getValue_The_client() {
        return value_The_client;
    }

    public void setValue_The_client(int value_The_client) {
        this.value_The_client = value_The_client;
    }

    public int getSock_danon_client() {
        return sock_danon_client;
    }

    public void setSock_danon_client(int sock_danon_client) {
        this.sock_danon_client = sock_danon_client;
    }

    public int getSock_farin_client() {
        return sock_farin_client;
    }

    public void setSock_farin_client(int sock_farin_client) {
        this.sock_farin_client = sock_farin_client;
    }

    public int getSock_The_client() {
        return sock_The_client;
    }

    public void setSock_The_client(int sock_The_client) {
        this.sock_The_client = sock_The_client;
    }

    @Override
    public String toString() {
        return "Prducts{" +
                "value_danon_client=" + value_danon_client +
                ", value_farin_client=" + value_farin_client +
                ", value_The_client=" + value_The_client +
                ", sock_danon_client=" + sock_danon_client +
                ", sock_farin_client=" + sock_farin_client +
                ", sock_The_client=" + sock_The_client +
                '}';
    }
}
